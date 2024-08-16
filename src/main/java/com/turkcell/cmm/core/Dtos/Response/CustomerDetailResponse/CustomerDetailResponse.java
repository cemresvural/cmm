package com.turkcell.cmm.core.Dtos.Response.CustomerDetailResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailResponse {
    private String firstName;
    private String lastName;
    private String gender;
    private String birthPlace;
    private Date birthDate;
    private String passportNo;
    

}
