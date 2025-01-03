package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.core.utilities.mappers.ModelMapperService;
import com.turkcell.cmm.entities.AddressTypes;
import com.turkcell.cmm.entities.Countries;

import com.turkcell.cmm.service.Dtos.Requests.CustomerAddressRequests.CreateCustomerAddressRequest;
import com.turkcell.cmm.service.Dtos.Response.CustomerAddressResponse.CreateCustomerAddressResponse;
import com.turkcell.cmm.entities.Address;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.CustomerAddressRepository;

import com.turkcell.cmm.service.abstracts.AddressTypeService;
import com.turkcell.cmm.service.abstracts.CountryService;
import com.turkcell.cmm.service.abstracts.CustomerAddressService;
import com.turkcell.cmm.service.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerAddressServiceImpl implements CustomerAddressService {
    private final CustomerAddressRepository customerAddressRepository;
    private final ModelMapperService modelMapper;
    private final CustomerService customerService;
    private final AddressTypeService addressTypeService;
    private final CountryService countryService;


    @Override
    public ResponseEntity<CreateCustomerAddressResponse> addAddress(CreateCustomerAddressRequest createCustomerAddressRequest) {
        var saveCustomerAddress = modelMapper.forRequest().map(createCustomerAddressRequest, Address.class);

        Customer customer=customerService.getCustomerById(createCustomerAddressRequest.getCustomerId());
        AddressTypes addressTypes=addressTypeService.findAddressTypeById(createCustomerAddressRequest.getAddressTypes());
        Countries countries=countryService.findById(createCustomerAddressRequest.getCountryId());

        saveCustomerAddress.setCustomer(customer);
        saveCustomerAddress.setAddressTypes(addressTypes);
        saveCustomerAddress.setCountries(countries);
        var savedCustomerAddress=customerAddressRepository.save(saveCustomerAddress);
        return ResponseEntity.ok(modelMapper.forResponse().map(savedCustomerAddress, CreateCustomerAddressResponse.class));
    }

}

