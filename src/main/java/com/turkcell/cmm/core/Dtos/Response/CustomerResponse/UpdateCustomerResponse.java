package com.turkcell.cmm.core.Dtos.Response.CustomerResponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerResponse {

    private Long identityNo;
    private Long nationalityId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender;
    private String  passportNo;
}
