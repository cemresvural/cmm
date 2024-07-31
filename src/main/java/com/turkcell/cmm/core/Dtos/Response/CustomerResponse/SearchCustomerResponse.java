package com.turkcell.cmm.core.Dtos.Response.CustomerResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerResponse {
    private Long id;
    private String firstName;
    private String lastName;

}
