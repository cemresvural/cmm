package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.CustomerDetail;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CustomerDetailRepository extends JpaRepository<CustomerDetail,Long> {
    Optional<CustomerDetail> findByDetailId(Long detailId);
}
