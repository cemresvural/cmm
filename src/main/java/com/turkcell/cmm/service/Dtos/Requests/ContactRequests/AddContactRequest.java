package com.turkcell.cmm.service.Dtos.Requests.ContactRequests;


import jakarta.validation.constraints.NotNull;

public class AddContactRequest {

    @NotNull
    private Long customerId;
    private String contactType;

    private String contactInfo;

    private String status;




}
