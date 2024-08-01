package com.turkcell.cmm.core.Dtos.Response.CustomerResponse;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerResponse {
    private String identityNo;
    private String firstName;
    private String lastName;
    private Long nationalityId;
    private Date birthDate;
    private String gender;
    private String  passportNo;

}
