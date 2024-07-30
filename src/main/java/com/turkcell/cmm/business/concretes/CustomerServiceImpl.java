package com.turkcell.cmm.business.concretes;

import com.turkcell.cmm.business.Dtos.Requests.CustomerRequests.AddCustomerRequest;
import com.turkcell.cmm.business.Dtos.Response.CustomerResponse.AddCustomerResponse;
import com.turkcell.cmm.core.utilities.mappers.ModelMapperService;
import com.turkcell.cmm.repository.CustomerRepository;
import com.turkcell.cmm.business.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//dependency enjection container spring ıoc ?
// dependencyler arasına ekle çünkü bu dependency olarak kullanılabilecek bir nesnedir bir servicedir. !bean(bağımlılık)tanımayacak
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepository customerRepository;
   private final ModelMapperService modelMapperService;

    @Override
    public ResponseEntity<AddCustomerResponse> addCustomer(AddCustomerRequest addCustomerRequest) {
        return null;
    }

    @Override
    public AddCustomerResponse add(AddCustomerRequest addCustomerRequest) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
