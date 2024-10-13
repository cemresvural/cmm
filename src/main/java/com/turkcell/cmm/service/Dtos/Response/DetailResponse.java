package com.turkcell.cmm.service.Dtos.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailResponse {
    private String firstName;
    private String lastName;
    private Long nationalityId;
    private Date birthDate;
    private String gender;
    private String passportNo;


}
