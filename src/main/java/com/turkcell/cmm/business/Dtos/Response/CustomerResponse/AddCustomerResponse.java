package com.turkcell.cmm.business.Dtos.Response.CustomerResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerResponse {
    private String  identityNo;
    private String firstName;
    private String lastName;
}
