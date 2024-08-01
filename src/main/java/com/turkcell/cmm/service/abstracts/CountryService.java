package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.entities.Countries;

public interface CountryService {
    Countries findById(Long id);
}
