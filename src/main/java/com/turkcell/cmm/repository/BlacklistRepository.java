package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.Blacklist;
import com.turkcell.cmm.service.enums.InReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BlacklistRepository extends JpaRepository<Blacklist,Long> {
    Optional<Blacklist> findByCustomerIdAndInReason(Long id, InReason inReason);


}
