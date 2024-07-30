package com.turkcell.cmm.controllers;


import com.turkcell.cmm.business.Dtos.Requests.CustomerRequests.AddCustomerRequest;
import com.turkcell.cmm.business.Dtos.Response.CustomerResponse.AddCustomerResponse;
import com.turkcell.cmm.business.abstracts.CustomerService;
import com.turkcell.cmm.core.business.abstracts.MessageService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Customer")
@AllArgsConstructor
public class CustomerController {

    private  CustomerService customerService;
    private MessageService messageService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddCustomerResponse add(@Valid @RequestBody AddCustomerRequest addCustomerRequest){

        return this.customerService.add(addCustomerRequest);
    }


}