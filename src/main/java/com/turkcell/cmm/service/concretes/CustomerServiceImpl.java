package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.CreateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.UpdateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.CreateCustomerResponse;

import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.UpdateCustomerResponse;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.CustomerRepository;
import com.turkcell.cmm.service.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
//dependency enjection container spring ıoc ?
// dependencyler arasına ekle çünkü bu dependency olarak kullanılabilecek bir nesnedir bir servicedir. !bean(bağımlılık)tanımayacak
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepository customerRepository;
   private final ModelMapper modelMapper;



    @Override
    public ResponseEntity<CreateCustomerResponse> addCustomer(CreateCustomerRequest createCustomerRequest) {
        var saveCustomer = modelMapper.map(createCustomerRequest, Customer.class);
        var savedCustomer = customerRepository.save(saveCustomer);
        return ResponseEntity.ok(modelMapper.map(savedCustomer, CreateCustomerResponse.class));
    }

    @Override
    public ResponseEntity<UpdateCustomerResponse> updateCustomer(UpdateCustomerRequest updateCustomerRequest) {
        var customer = modelMapper.map(updateCustomerRequest, Customer.class);
        var updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(modelMapper.map(updatedCustomer, UpdateCustomerResponse.class));
    }

}
