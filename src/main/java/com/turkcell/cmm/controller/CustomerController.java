package com.turkcell.cmm.controller;


import com.turkcell.cmm.service.Dtos.Requests.CustomerRequests.CreateCustomerRequest;
import com.turkcell.cmm.service.Dtos.Requests.CustomerRequests.UpdateCustomerRequest;
import com.turkcell.cmm.service.Dtos.Response.CustomerDetailResponse.CustomerDetailResponse;
import com.turkcell.cmm.service.Dtos.Response.CustomerResponse.CreateCustomerResponse;
import com.turkcell.cmm.service.Dtos.Response.CustomerResponse.SearchCustomerResponse;
import com.turkcell.cmm.service.Dtos.Response.CustomerResponse.UpdateCustomerResponse;
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
    @PutMapping("/update")
    public ResponseEntity<UpdateCustomerResponse> updateCustomer(@Valid @RequestBody UpdateCustomerRequest updateCustomerRequest){
        return customerService.updateCustomer(updateCustomerRequest);
    }
    @GetMapping("/{id}")
    public CustomerDetailResponse getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id).getBody();
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<SearchCustomerResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(customerService.getById(id));
    }
}