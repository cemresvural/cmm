package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAddressRepository extends JpaRepository<Address,Long> {

    List<Address> findByAddressId(Long addressId);

}
