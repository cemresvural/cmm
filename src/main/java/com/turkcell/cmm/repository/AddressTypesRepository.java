package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.AddressTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressTypesRepository extends JpaRepository<AddressTypes,Long> {
}
