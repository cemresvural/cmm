package com.turkcell.cmm.service.Dtos.Requests.CustomerRequests;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotNull;


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
public class CreateCustomerRequest {
    @NotNull
    private String identityNo;

    @NotNull
    private Long nationalityId;

    @NotNull @Size(max=53)
    private String firstName;

    @NotNull @Size(max = 50)
    //@Pattern(regexp = "^[a-zA-Z0-9_]*[a-zA-Z_]*[a-zA-Z0-9_]*$")
    private String lastName;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @NotNull(message = "This field is required")

    private Date birthDate;
    private String birthPlace;

    private String gender;
    private String  passportNo;

}
