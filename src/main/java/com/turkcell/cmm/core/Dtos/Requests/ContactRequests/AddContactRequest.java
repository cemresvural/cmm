package com.turkcell.cmm.core.Dtos.Requests.ContactRequests;


import jakarta.validation.constraints.NotNull;

public class AddContactRequest {

    @NotNull
    private Long customerId;
    private String contactType;

    private String contactInfo;

    private String status;




}
