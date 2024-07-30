package com.turkcell.cmm.business.Dtos.Requests.CustomerRequests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {
    @NotNull
    @Pattern(regexp = "\\d+", message = "This field is required")
    @Size(min = 11,max = 11)
    private String identityNo;
    /*
    *regexp = "\\d+":
alanın değerinin eşleşmesi gereken düzenli ifadeyi belirtir. Bu durumda, \\d+regex
\\dbir rakamı (eşdeğeri [0-9]) temsil eder.
+Önceki öğeden "bir veya daha fazlası" anlamına gelir.
Yani \\d+ alanın bir veya daha fazla rakam içermesi gerektiğini garanti eder.*/

    @NotBlank(message = "This field is required") @Size(max=53)
    private String firstName;

    @NotBlank(message = "This field is required") @Size(max = 50)  @Pattern(regexp = "^[a-zA-Z0-9_]*[a-zA-Z_]*[a-zA-Z0-9_]*$")
    private String lastName;
}
