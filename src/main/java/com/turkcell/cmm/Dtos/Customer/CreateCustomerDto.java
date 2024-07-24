package com.turkcell.cmm.Dtos.Customer;

import lombok.Data;

@Data
public class CreateCustomerDto {
    private String identityNo;
    private String firstName;
    private String lastName;
}
