package com.turkcell.cmm.repository;

import com.turkcell.cmm.core.Dtos.Response.CustomerResponse.SearchCustomerResponse;
import com.turkcell.cmm.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    boolean existsById(Long customerId);
    @Query("SELECT  new com.turkcell.cmm.core.Dtos.Response.CustomerResponse.SearchCustomerResponse(c.id,c.customerDetail.firstName,c.customerDetail.lastName)" +
            " FROM Customer c" +
            " WHERE (c.id = :id)")
    SearchCustomerResponse getCustomerResponseById(@Param("id") Long id);
}
