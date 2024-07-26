package com.turkcell.cmm.controllers;

import com.turkcell.cmm.Dtos.Countries.CreateCountriesDto;

import com.turkcell.cmm.entities.Countries;
import com.turkcell.cmm.services.abstracts.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountriesController {

    private final CountriesService countriesService;
    @GetMapping
    public List<Countries> getAll(){
        return countriesService.getAll();
    }

    @PostMapping()
    public void createCustomer(@RequestBody CreateCountriesDto dto){
        countriesService.add(dto);
    }
}
