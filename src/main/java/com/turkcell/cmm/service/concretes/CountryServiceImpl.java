package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.core.utilities.mappers.ModelMapperService;
import com.turkcell.cmm.entities.Countries;
import com.turkcell.cmm.repository.CountriesRepository;
import com.turkcell.cmm.service.Dtos.Requests.CreateCountryRequest;
import com.turkcell.cmm.service.Dtos.Response.CreateCountryResponse;
import com.turkcell.cmm.service.abstracts.CountryService;
import com.turkcell.cmm.service.utilities.EntityUtil;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountriesRepository countriesRepository;
    private final ModelMapperService modelMapper;

    public CountryServiceImpl(CountriesRepository countriesRepository, ModelMapperService modelMapper) {
        this.countriesRepository = countriesRepository;
        this.modelMapper = modelMapper;
    }

    public Countries findById(Long id){
     return countriesRepository.findById(id).orElseThrow(()->new RuntimeException("not found country "));
    }

    @Override
    public CreateCountryResponse add(CreateCountryRequest request) {
        Countries countries=modelMapper.forRequest().map(request, Countries.class);
        EntityUtil.setCreateFields("Create country",countries);
        countriesRepository.save(countries);
        return new CreateCountryResponse("Success");
    }
}
