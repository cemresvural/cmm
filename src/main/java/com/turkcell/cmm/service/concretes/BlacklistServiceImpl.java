package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.service.Dtos.BlacklistRequests.AddBlacklistRequest;

import com.turkcell.cmm.service.Dtos.BlacklistRequests.RemoveBlacklistRequest;
import com.turkcell.cmm.service.Dtos.BlacklistRequests.UpdateBlacklistRequest;
import com.turkcell.cmm.service.Dtos.Response.BlacklistResponses.AddBlacklistResponse;



import com.turkcell.cmm.service.Dtos.Response.BlacklistResponses.RemoveBlacklistResponse;
import com.turkcell.cmm.service.Dtos.Response.BlacklistResponses.UpdateBlacklistResponse;
import com.turkcell.cmm.core.utilities.exceptions.types.BusinessException;
import com.turkcell.cmm.entities.Blacklist;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.BlacklistRepository;
import com.turkcell.cmm.service.abstracts.BlacklistService;

import com.turkcell.cmm.service.abstracts.CustomerService;
import com.turkcell.cmm.service.enums.InReason;
import com.turkcell.cmm.service.enums.OutReason;
import com.turkcell.cmm.service.enums.Status;
import com.turkcell.cmm.service.utilities.EntityUtil;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;



@Service
@RequiredArgsConstructor
public class BlacklistServiceImpl implements BlacklistService {
    private final BlacklistRepository blacklistRepository;
    private final CustomerService customerService;
    private final ModelMapper modelMapper;


    @Override
    public AddBlacklistResponse addBlacklistCustomer(AddBlacklistRequest addBlacklistRequest) {
        checkExpireDateForRequest(addBlacklistRequest.getExpireDate());
        InReason inReason = InReason.find(addBlacklistRequest.getInReason());
        var optionalBlacklist = blacklistRepository.findByCustomerIdAndInReason(addBlacklistRequest.getCustomerId(), inReason);
        Blacklist blacklist= null;
        if (optionalBlacklist.isEmpty()) {
            blacklist = createBlacklist(addBlacklistRequest.getCustomerId(), inReason, addBlacklistRequest.getExpireDate());


        } else {
            blacklist=optionalBlacklist.get();
            blacklist.setInDate(new Date());
            EntityUtil.setUpdateFields("Add Blacklist", blacklist);
            if (Status.DEACTIVE.equals(Status.fromValue(blacklist.getStatus()))) {
                blacklist.setStatus(Status.ACTIVE.getValue());

                blacklist.setExpireDate(addBlacklistRequest.getExpireDate());
            } else if (blacklist.getExpireDate() != null
                    && addBlacklistRequest.getExpireDate() != null
            ) {

                if (addBlacklistRequest.getExpireDate().after(blacklist.getExpireDate())) {
                    blacklist.setExpireDate(addBlacklistRequest.getExpireDate());
                    //blacklist.setStatus(Status.DEACTIVE.getValue());
                }

            } else if (addBlacklistRequest.getExpireDate() == null) {
                blacklist.setExpireDate(null);


            }

        }
        blacklistRepository.save(blacklist);

        return convertBlacklistToResponse(blacklist);
    }


    private Blacklist createBlacklist(Long customerId, InReason inReason, Date expireDate) {
        Blacklist blacklist = new Blacklist();

        Customer customer = customerService.getCustomerById(customerId);

        blacklist.setCustomer(customer);
        blacklist.setStatus(Status.ACTIVE.getValue());
        blacklist.setExpireDate(expireDate);
        blacklist.setInDate(new Date());
        blacklist.setInReason(inReason);
        EntityUtil.setCreateFields("Add Blacklist", blacklist);
        return blacklist;
    }

    private void checkExpireDateForRequest(Date expireDate) {
        if (expireDate != null && expireDate.before(new Date())) {
            throw new BusinessException("expire date not before now");
        }
    }

    private AddBlacklistResponse convertBlacklistToResponse(Blacklist blacklist) {
        AddBlacklistResponse response = new AddBlacklistResponse();

        response.setCustomerId(blacklist.getCustomer().getId());
        response.setExpireDate(blacklist.getExpireDate());
        response.setStatus(blacklist.getStatus());
        response.setInReason(blacklist.getInReason().name());
        return response;
    }

    @Override
    public RemoveBlacklistResponse removeBlacklist(RemoveBlacklistRequest removeBlacklistRequest) {
        InReason inReason = InReason.valueOf(removeBlacklistRequest.getInReason());
        Blacklist blacklist = blacklistRepository.findByCustomerIdAndInReason(removeBlacklistRequest.getCustomerId(), inReason)
                .orElseThrow(() -> new  BusinessException("Blacklist registry not found"));

            blacklist.setStatus(Status.DEACTIVE.getValue());
            blacklist.setOutReason(OutReason.valueOf(removeBlacklistRequest.getOutReason()));
            blacklist.setOutDate(new Date());
            EntityUtil.setUpdateFields("Remove Blacklist",blacklist);
            blacklistRepository.save(blacklist);

        RemoveBlacklistResponse response = new RemoveBlacklistResponse();
        response.setCustomerId(blacklist.getCustomer().getId());
        response.setOutReason(String.valueOf(blacklist.getOutReason()));
        response.setStatus(blacklist.getStatus());

        return response;

    }

    @Override
    public ResponseEntity<UpdateBlacklistResponse> updateBlacklist(UpdateBlacklistRequest updateBlacklistRequest) {
        var blacklist= modelMapper.map(updateBlacklistRequest, Blacklist.class);
        var updateBlacklist=blacklistRepository.save(blacklist);
        return ResponseEntity.ok(modelMapper.map(updateBlacklist,UpdateBlacklistResponse.class));
    }

    @Override
    public Customer getById(Long id) {
        return null;
    }


    }

