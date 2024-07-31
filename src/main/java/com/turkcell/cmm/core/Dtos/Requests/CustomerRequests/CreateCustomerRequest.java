package com.turkcell.cmm.core.Dtos.Requests.CustomerRequests;

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
public class CreateCustomerRequest {
    @NotNull
    private String identityNo;
    /*
    *regexp = "\\d+":
alanın değerinin eşleşmesi gereken düzenli ifadeyi belirtir. Bu durumda, \\d+regex
\\dbir rakamı (eşdeğeri [0-9]) temsil eder.
+Önceki öğeden "bir veya daha fazlası" anlamına gelir.
Yani \\d+ alanın bir veya daha fazla rakam içermesi gerektiğini garanti eder.*/
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
