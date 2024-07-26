package com.turkcell.cmm.services.abstracts;


import com.turkcell.cmm.Dtos.Countries.CreateCountriesDto;
import com.turkcell.cmm.entities.Countries;

import java.util.List;

public interface CountriesService {
    void add(CreateCountriesDto dto);
    List<Countries> getAll();
     Countries getById(int id);

}
