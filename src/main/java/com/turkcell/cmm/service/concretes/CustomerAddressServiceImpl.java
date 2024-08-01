package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.core.Dtos.Requests.CustomerAddressRequests.CreateCustomerAddressRequest;
import com.turkcell.cmm.core.Dtos.Response.CustomerAddressResponse.CreateCustomerAddressResponse;
import com.turkcell.cmm.entities.Address;
import com.turkcell.cmm.repository.CustomerAddressRepository;
import com.turkcell.cmm.service.abstracts.CustomerAddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerAddressServiceImpl implements CustomerAddressService {
    private CustomerAddressRepository customerAddressRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public void CustomerAddressService(CustomerAddressRepository customerAddressRepository) {
        this.customerAddressRepository = customerAddressRepository;
    }



    @Override
    public ResponseEntity<CreateCustomerAddressResponse> add(CreateCustomerAddressRequest createCustomerAddressRequest) {
        var saveCustomerAddress = modelMapper.map(createCustomerAddressRequest, Address.class);
        var savedCustomerAddress = customerAddressRepository.save(saveCustomerAddress);
        return ResponseEntity.ok(modelMapper.map(savedCustomerAddress, CreateCustomerAddressResponse.class));
    }
}

