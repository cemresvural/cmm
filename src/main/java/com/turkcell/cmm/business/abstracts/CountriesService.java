package com.turkcell.cmm.business.abstracts;


import com.turkcell.cmm.business.Dtos.Requests.Countries.CreateCountriesDto;
import com.turkcell.cmm.entities.Countries;

import java.util.List;

public interface CountriesService {
    void add(CreateCountriesDto dto);
    List<Countries> getAll();
     Countries getById(int id);

}
