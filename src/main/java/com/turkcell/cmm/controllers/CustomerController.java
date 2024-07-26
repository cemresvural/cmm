package com.turkcell.cmm.controllers;


import com.turkcell.cmm.Dtos.Customer.CreateCustomerDto;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.services.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @PostMapping()
    public void createCustomer(@RequestBody CreateCustomerDto dto){
        customerService.add(dto);
    }
}
