package com.turkcell.cmm.controller;

import com.turkcell.cmm.service.Dtos.Requests.CreateCountryRequest;
import com.turkcell.cmm.service.Dtos.Response.CreateCountryResponse;
import com.turkcell.cmm.service.abstracts.CountryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping
    public ResponseEntity<CreateCountryResponse> addCountry(@Valid @RequestBody CreateCountryRequest request){
        return ResponseEntity.ok(countryService.add(request));
    }
}
