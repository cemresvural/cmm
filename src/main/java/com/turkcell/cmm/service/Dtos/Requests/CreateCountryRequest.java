package com.turkcell.cmm.service.Dtos.Requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCountryRequest {
    @NotNull
    private String nationalityCode;

    @NotNull
    private String countryCode;

}
