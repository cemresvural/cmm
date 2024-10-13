package com.turkcell.cmm.service.Dtos.Requests.CustomerRequests;

import lombok.Data;

@Data
public class SearchCustomerRequest {
    private Long id;
    private String firstName;
    private String lastName;
}
