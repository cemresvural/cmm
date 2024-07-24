package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
