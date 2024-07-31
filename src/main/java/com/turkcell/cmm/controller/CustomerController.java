package com.turkcell.cmm.controller;


import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.CreateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.CreateCustomerResponse;
import com.turkcell.cmm.service.abstracts.CustomerService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Customer")
@AllArgsConstructor
public class CustomerController {
    private  CustomerService customerService;
    @PostMapping("/add")
    public ResponseEntity<CreateCustomerResponse> addCustomer(@Valid @RequestBody CreateCustomerRequest createCustomerRequest){
        return customerService.addCustomer(createCustomerRequest);

}
}