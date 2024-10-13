package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.service.Dtos.BlacklistRequests.AddBlacklistRequest;
import com.turkcell.cmm.service.Dtos.BlacklistRequests.RemoveBlacklistRequest;

import com.turkcell.cmm.service.Dtos.BlacklistRequests.UpdateBlacklistRequest;
import com.turkcell.cmm.service.Dtos.Response.BlacklistResponses.AddBlacklistResponse;
import com.turkcell.cmm.service.Dtos.Response.BlacklistResponses.RemoveBlacklistResponse;
import com.turkcell.cmm.service.Dtos.Response.BlacklistResponses.UpdateBlacklistResponse;
import com.turkcell.cmm.entities.Customer;
import org.springframework.http.ResponseEntity;


public interface BlacklistService {
    AddBlacklistResponse addBlacklistCustomer(AddBlacklistRequest addBlacklistRequest);
    RemoveBlacklistResponse removeBlacklist(RemoveBlacklistRequest removeBlacklistRequest);
   // Customer findById(Long id);
    ResponseEntity<UpdateBlacklistResponse> updateBlacklist(UpdateBlacklistRequest updateBlacklistRequest);
    Customer getById(Long id);
 //  List<GetBlacklistResponse> getBlacklist(GetBlacklistRequest getBlacklistRequest);


}
