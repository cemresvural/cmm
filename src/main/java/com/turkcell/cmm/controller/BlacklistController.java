package com.turkcell.cmm.controller;

import com.turkcell.cmm.core.Dtos.BlacklistRequests.AddBlacklistRequest;
import com.turkcell.cmm.core.Dtos.BlacklistRequests.RemoveBlacklistRequest;
import com.turkcell.cmm.core.Dtos.BlacklistRequests.UpdateBlacklistRequest;
import com.turkcell.cmm.core.Dtos.Response.BlacklistResponses.RemoveBlacklistResponse;
import com.turkcell.cmm.core.Dtos.Response.BlacklistResponses.UpdateBlacklistResponse;
import com.turkcell.cmm.core.utilities.exceptions.types.BusinessException;
import com.turkcell.cmm.entities.Blacklist;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.BlacklistRepository;
import com.turkcell.cmm.repository.CustomerRepository;

import com.turkcell.cmm.service.abstracts.BlacklistService;
import com.turkcell.cmm.service.enums.InReason;

import com.turkcell.cmm.service.enums.OutReason;
import com.turkcell.cmm.service.enums.Status;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/blacklist")
@RequiredArgsConstructor
public class BlacklistController {
    private final BlacklistRepository blacklistRepository;
   private final BlacklistService blacklistService;
    private final CustomerRepository customerRepository;


    @PostMapping("/add")
    public ResponseEntity<Blacklist> createBlacklist(@RequestBody AddBlacklistRequest addBlacklistRequest) {
        Optional<Customer> customerOptional = customerRepository.findById(addBlacklistRequest.getCustomerId());
        if (customerOptional.isPresent()) {
            Blacklist blacklist = new Blacklist();
            blacklist.setCustomer(customerOptional.get());
            blacklist.setInReason(InReason.valueOf(addBlacklistRequest.getInReason()));
            Blacklist savedBlacklist = blacklistRepository.save(blacklist);
            return ResponseEntity.ok(savedBlacklist);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/remove")
    public ResponseEntity<RemoveBlacklistResponse> removeBlacklist(@RequestBody RemoveBlacklistRequest removeBlacklistRequest) {
        Blacklist blacklist = blacklistRepository.findByCustomerIdAndInReason(removeBlacklistRequest.getCustomerId(),InReason.valueOf(removeBlacklistRequest.getInReason()));
        if (blacklist != null) {
           // Blacklist blacklist = blacklist.get(); // Mevcut kaydı alıyor
            blacklist.setOutReason(OutReason.valueOf(removeBlacklistRequest.getOutReason()));
            blacklist.setOutDate(new Date());
            blacklist.setStatus(Status.DEACTIVE.getValue());
            Blacklist savedBlacklist = blacklistRepository.save(blacklist);

            RemoveBlacklistResponse response = new RemoveBlacklistResponse();
            response.setCustomerId(savedBlacklist.getCustomer().getId());
            response.setOutReason(String.valueOf(savedBlacklist.getOutReason()));
            response.setStatus(savedBlacklist.getStatus());

            return ResponseEntity.ok(response);
        } else {
            throw new BusinessException("Kayıt bulunamadı");
        }
    }
     @PutMapping("/update")
     public ResponseEntity<UpdateBlacklistResponse> updateBlacklist(@RequestBody UpdateBlacklistRequest updateBlacklistRequest){
        return blacklistService.updateBlacklist(updateBlacklistRequest);
     }
}


