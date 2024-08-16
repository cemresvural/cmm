package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.core.Dtos.Requests.CustomerAddressRequests.CreateCustomerAddressRequest;
import com.turkcell.cmm.core.Dtos.Response.CustomerAddressResponse.CreateCustomerAddressResponse;

import org.springframework.http.ResponseEntity;


public interface CustomerAddressService {
    ResponseEntity<CreateCustomerAddressResponse> addAddress(CreateCustomerAddressRequest createCustomerAddressRequest);

}
