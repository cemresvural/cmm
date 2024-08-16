package com.turkcell.cmm.repository;

import com.turkcell.cmm.core.Dtos.Response.BlacklistResponses.GetBlacklistResponse;
import com.turkcell.cmm.entities.Blacklist;
import com.turkcell.cmm.service.enums.InReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BlacklistRepository extends JpaRepository<Blacklist,Long> {
    Blacklist findByCustomerIdAndInReason(Long id, InReason inReason);


}
