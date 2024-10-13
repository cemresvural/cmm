package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.service.Dtos.Requests.CustomerAddressRequests.CreateCustomerAddressRequest;
import com.turkcell.cmm.service.Dtos.Response.CustomerAddressResponse.CreateCustomerAddressResponse;
import com.turkcell.cmm.entities.Address;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.CustomerAddressRepository;
import com.turkcell.cmm.repository.CustomerRepository;
import com.turkcell.cmm.service.abstracts.CustomerAddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerAddressServiceImpl implements CustomerAddressService {
    private CustomerAddressRepository customerAddressRepository;
    private final ModelMapper modelMapper;
    private CustomerRepository customerRepository;

    @Override
    public ResponseEntity<CreateCustomerAddressResponse> addAddress(CreateCustomerAddressRequest createCustomerAddressRequest) {
        var saveCustomerAddress = modelMapper.map(createCustomerAddressRequest, Address.class);

        Customer customer=customerRepository.findById(createCustomerAddressRequest.getCustomerId())
                .orElseThrow(()->new RuntimeException("customer not found "+createCustomerAddressRequest.getCustomerId()));
        saveCustomerAddress.setCustomer(customer);
        var savedCustomerAddress=customerAddressRepository.save(saveCustomerAddress);
        return ResponseEntity.ok(modelMapper.map(savedCustomerAddress, CreateCustomerAddressResponse.class));
    }

   /* @Override
    public CreateCustomerAddressResponse addAddress(CreateCustomerAddressRequest createCustomerAddressRequest) {
        var saveAddress=modelMapper.map(createCustomerAddressRequest,Address.class);
        Customer customer=customerRepository.findById(createCustomerAddressRequest.getCustomerId())
                .orElseThrow(()->new RuntimeException("customer not found with id:" + createCustomerAddressRequest.getCustomerId()));

        saveAddress.setCustomer(customer);
        addressRepository.save(saveAddress);
        return modelMapper.map(saveAddress,CreateCustomerAddressResponse.class);
    }

    @Override
    public GetAllAddressResponse getAddress(Long addressId) {
        return this.modelMapper.map(addressRepository.findById(addressId).orElseThrow(()
                -> new RuntimeException("Address not found with id: " + addressId)), GetAllAddressResponse.class);
    }*/
}

