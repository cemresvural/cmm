package com.turkcell.cmm.business.Dtos.Requests.Countries;



import lombok.Data;

@Data
public class CreateCountriesDto {
    private String nationalityCode;
    private String countryCode;

}

