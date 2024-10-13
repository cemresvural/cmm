package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.service.Dtos.Requests.ContactRequests.AddContactRequest;
import com.turkcell.cmm.service.Dtos.Response.ContactResponses.AddContactResponse;
import org.springframework.http.ResponseEntity;

public interface ContactService {
    ResponseEntity<AddContactResponse> addContact(AddContactRequest addContactRequest);
}
