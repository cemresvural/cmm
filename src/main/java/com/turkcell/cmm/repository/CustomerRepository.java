package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findCustomerByCustomerId(Integer customerId);
}
