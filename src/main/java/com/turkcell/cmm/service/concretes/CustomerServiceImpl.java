package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.CreateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Requests.CustomerRequests.UpdateCustomerRequest;
import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.CreateCustomerResponse;

import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.UpdateCustomerResponse;
import com.turkcell.cmm.entities.Countries;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.entities.CustomerDetail;
import com.turkcell.cmm.repository.CustomerRepository;
import com.turkcell.cmm.service.abstracts.CountryService;
import com.turkcell.cmm.service.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;


@Service
@RequiredArgsConstructor
//dependency enjection container spring ıoc ?
// dependencyler arasına ekle çünkü bu dependency olarak kullanılabilecek bir nesnedir bir servicedir. !bean(bağımlılık)tanımayacak
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepository customerRepository;
   private final ModelMapper modelMapper;
   private final CountryService countryService;



    @Override
    public ResponseEntity<CreateCustomerResponse> addCustomer(CreateCustomerRequest createCustomerRequest) {
   Countries country= countryService.findById(createCustomerRequest.getNationalityId());
        Customer customer=new Customer();
        customer.setCountries(country);
        customer.setIdentityNo(createCustomerRequest.getIdentityNo());
        customer.setStatus("active");
        customer.setActivation_date(new Date());
        customer.setCreateDate(new Date());
        customer.setCreateOperation("add customer");

        CustomerDetail customerDetail=new CustomerDetail();
        customerDetail.setCustomer(customer);
        customerDetail.setFirstName(createCustomerRequest.getFirstName());
        customerDetail.setLastName(createCustomerRequest.getLastName());
        customerDetail.setBirthDate(createCustomerRequest.getBirthDate());
        customerDetail.setBirthPlace(createCustomerRequest.getBirthPlace());
        customerDetail.setPassportNo(createCustomerRequest.getPassportNo());
        customerDetail.setGender(createCustomerRequest.getGender());
        customerDetail.setCreateDate(new Date());
        customerDetail.setCreateOperation("add customer");
        customer.setCustomerDetail(customerDetail);
        var savedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(new CreateCustomerResponse());
    }

    /*@Override
    public ResponseEntity<UpdateCustomerResponse> updateCustomer(UpdateCustomerRequest updateCustomerRequest) {
        var customer = modelMapper.map(updateCustomerRequest, Customer.class);
        var updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(modelMapper.map(updatedCustomer, UpdateCustomerResponse.class));
    }*/

}
