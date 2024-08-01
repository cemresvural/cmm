package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.CreateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.UpdateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.CreateCustomerResponse;
import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.UpdateCustomerResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
//servisler direkt entity classları ile çalışmaz.
ResponseEntity<CreateCustomerResponse> addCustomer(CreateCustomerRequest createCustomerRequest);
//ResponseEntity<UpdateCustomerResponse> updateCustomer(UpdateCustomerRequest updateCustomerRequest);

}
