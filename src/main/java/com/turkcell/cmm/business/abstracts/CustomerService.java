package com.turkcell.cmm.business.abstracts;

import com.turkcell.cmm.business.Dtos.Requests.CustomerRequests.AddCustomerRequest;
import com.turkcell.cmm.business.Dtos.Response.CustomerResponse.AddCustomerResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
//servisler direkt entity classları ile çalışmaz.


    ResponseEntity<AddCustomerResponse> addCustomer(AddCustomerRequest addCustomerRequest);
    AddCustomerResponse add(AddCustomerRequest addCustomerRequest);

    void delete(int id);
}
