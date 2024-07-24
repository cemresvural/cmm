package com.turkcell.cmm.services.concretes;

import com.turkcell.cmm.Dtos.Customer.CreateCustomerDto;
import com.turkcell.cmm.core.utilities.mappers.ModelMapperService;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.CustomerRepository;
import com.turkcell.cmm.services.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
//dependency enjection container spring ıoc ?
// dependencyler arasına ekle çünkü bu dependency olarak kullanılabilecek bir nesnedir bir servicedir. !bean(bağımlılık)tanımayacak
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepository customerRepository;
   private final ModelMapperService modellMapperService;

    @Override
    public void add(CreateCustomerDto dto) {
        Customer customer =modellMapperService.forRequest().map(dto,Customer.class);
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public List<Customer> getAll() {
        return  customerRepository.findAll();
    }

    @Override
    public Customer getById(int id) {
        return customerRepository.findById(id).orElseThrow();
    }
}
