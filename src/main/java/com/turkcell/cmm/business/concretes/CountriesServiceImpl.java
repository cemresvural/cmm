package com.turkcell.cmm.business.concretes;

import com.turkcell.cmm.business.Dtos.Requests.Countries.CreateCountriesDto;
import com.turkcell.cmm.entities.Countries;
import com.turkcell.cmm.repository.CountriesRepository;
import com.turkcell.cmm.business.abstracts.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CountriesServiceImpl implements CountriesService {

    private final CountriesRepository countriesRepository;


    @Override
    public void add(CreateCountriesDto dto) {

    }

    @Override
    public List<Countries> getAll() {
        return List.of();
    }

    @Override
    public Countries getById(int id) {
        return null;
    }
}
