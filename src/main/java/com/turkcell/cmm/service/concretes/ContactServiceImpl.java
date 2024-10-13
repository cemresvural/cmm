package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.service.Dtos.Requests.ContactRequests.AddContactRequest;
import com.turkcell.cmm.service.Dtos.Response.ContactResponses.AddContactResponse;
import com.turkcell.cmm.entities.Contact;
import com.turkcell.cmm.repository.ContactRepository;
import com.turkcell.cmm.service.abstracts.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;
    private  ModelMapper modelMapper;
    @Override
    public ResponseEntity<AddContactResponse> addContact(AddContactRequest addContactRequest) {
        var contact=modelMapper.map(addContactRequest, Contact.class) ;
        var savedContact=contactRepository.save(contact);
        return ResponseEntity.ok(modelMapper.map(savedContact, AddContactResponse.class));
    }
}
