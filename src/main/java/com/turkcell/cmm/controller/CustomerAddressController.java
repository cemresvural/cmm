package com.turkcell.cmm.controller;

import com.turkcell.cmm.service.Dtos.Requests.CustomerAddressRequests.CreateCustomerAddressRequest;

import com.turkcell.cmm.service.Dtos.Response.CustomerAddressResponse.CreateCustomerAddressResponse;

import com.turkcell.cmm.service.abstracts.CustomerAddressService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/CustomerAddress")
@AllArgsConstructor
public class CustomerAddressController {
    private CustomerAddressService customerAddressService;

    @PostMapping("/add")
    public ResponseEntity<CreateCustomerAddressResponse> addCustomerAddress(@Valid @RequestBody CreateCustomerAddressRequest createCustomerAddressRequest){
        return customerAddressService.addAddress(createCustomerAddressRequest);

    }

}
