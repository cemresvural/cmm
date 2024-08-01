package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.entities.Countries;
import com.turkcell.cmm.repository.CountriesRepository;
import com.turkcell.cmm.service.abstracts.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountriesRepository countriesRepository;

    public CountryServiceImpl(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    public Countries findById(Long id){
     return countriesRepository.findById(id).orElseThrow(()->new RuntimeException("not found country "));
    }
}
