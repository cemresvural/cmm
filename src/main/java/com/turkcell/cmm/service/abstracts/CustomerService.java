package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.service.Dtos.Requests.CustomerRequests.CreateCustomerRequest;
import com.turkcell.cmm.service.Dtos.Requests.CustomerRequests.UpdateCustomerRequest;
import com.turkcell.cmm.service.Dtos.Response.CustomerDetailResponse.CustomerDetailResponse;
import com.turkcell.cmm.service.Dtos.Response.CustomerResponse.CreateCustomerResponse;
import com.turkcell.cmm.service.Dtos.Response.CustomerResponse.SearchCustomerResponse;
import com.turkcell.cmm.service.Dtos.Response.CustomerResponse.UpdateCustomerResponse;
import com.turkcell.cmm.entities.Customer;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
//servisler direkt entity classları ile çalışmaz.
ResponseEntity<CreateCustomerResponse> addCustomer(CreateCustomerRequest createCustomerRequest);
ResponseEntity<UpdateCustomerResponse> updateCustomer(UpdateCustomerRequest updateCustomerRequest);
ResponseEntity<CustomerDetailResponse> getCustomer(Long id);
   Customer getCustomerById(Long id) ;

    SearchCustomerResponse getById(Long customerId);
    // Customer getById(Long id);
   // ResponseEntity<CustomerDetailResponse> getCustomer(Long id);


}
