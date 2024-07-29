package com.turkcell.cmm.services.abstracts;

import com.turkcell.cmm.Dtos.Customer.CreateCustomerDto;
import com.turkcell.cmm.Dtos.Customer.UpdateCustomerDto;
import com.turkcell.cmm.entities.Customer;

import java.util.List;

public interface CustomerService {
//servisler direkt entity classları ile çalışmaz.

    void add(CreateCustomerDto dto);
    void update(UpdateCustomerDto dto);
    //void delete(int id); //1 den 99a

    List<Customer> getAll();
    Customer getById(int id);
}
