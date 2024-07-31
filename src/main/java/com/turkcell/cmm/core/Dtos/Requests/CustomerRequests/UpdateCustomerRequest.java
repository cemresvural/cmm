package com.turkcell.cmm.core.Dtos.Requests.CustomerRequests;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {
    @NotNull

    @Size(min = 11,max = 11)
    private Long identityNo;
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
    private String gender;
    private String  passportNo;

}
