package com.turkcell.cmm.controller;

import com.turkcell.cmm.core.Dtos.BlacklistRequests.AddBlacklistRequest;
import com.turkcell.cmm.core.Dtos.BlacklistRequests.RemoveBlacklistRequest;
import com.turkcell.cmm.core.Dtos.BlacklistRequests.UpdateBlacklistRequest;
import com.turkcell.cmm.core.Dtos.Response.BlacklistResponses.AddBlacklistResponse;
import com.turkcell.cmm.core.Dtos.Response.BlacklistResponses.RemoveBlacklistResponse;
import com.turkcell.cmm.core.Dtos.Response.BlacklistResponses.UpdateBlacklistResponse;
import com.turkcell.cmm.core.utilities.exceptions.types.BusinessException;
import com.turkcell.cmm.entities.Blacklist;
import com.turkcell.cmm.repository.BlacklistRepository;

import com.turkcell.cmm.service.abstracts.BlacklistService;
import com.turkcell.cmm.service.enums.InReason;

import com.turkcell.cmm.service.enums.OutReason;
import com.turkcell.cmm.service.enums.Status;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/blacklist")
@RequiredArgsConstructor
public class BlacklistController {
    private final BlacklistRepository blacklistRepository;
   private final BlacklistService blacklistService;



    @PostMapping("/add")
    public AddBlacklistResponse createBlacklist(@Valid @RequestBody AddBlacklistRequest addBlacklistRequest) {
        return  blacklistService.addBlacklistCustomer(addBlacklistRequest);
    }

    @PostMapping("/remove")
    public RemoveBlacklistResponse removeBlacklist(@RequestBody RemoveBlacklistRequest removeBlacklistRequest) {
        return blacklistService.removeBlacklist(removeBlacklistRequest);

    }
     @PutMapping("/update")
     public ResponseEntity<UpdateBlacklistResponse> updateBlacklist(@RequestBody UpdateBlacklistRequest updateBlacklistRequest){
        return blacklistService.updateBlacklist(updateBlacklistRequest);
     }
}


