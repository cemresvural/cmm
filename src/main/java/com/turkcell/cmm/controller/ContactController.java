package com.turkcell.cmm.controller;

import com.turkcell.cmm.service.Dtos.Requests.ContactRequests.AddContactRequest;
import com.turkcell.cmm.service.Dtos.Response.ContactResponses.AddContactResponse;
import com.turkcell.cmm.service.abstracts.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @PostMapping("/add")
    public ResponseEntity<AddContactResponse> addContact(@RequestBody AddContactRequest addContactRequest){
        return contactService.addContact(addContactRequest);
    }
}
