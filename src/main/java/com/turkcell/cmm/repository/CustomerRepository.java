package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    boolean existsByNationalityId(Long nationalityId);
    boolean existsById(Long customerId);
    List<Customer> findByNationalityId(Long nationalityId);
}
