package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.entities.Countries;
import com.turkcell.cmm.service.Dtos.Requests.CreateCountryRequest;
import com.turkcell.cmm.service.Dtos.Response.CreateCountryResponse;

public interface CountryService {
    Countries findById(Long id);
    CreateCountryResponse add(CreateCountryRequest request);
}
