package com.turkcell.cmm.repository;

import com.turkcell.cmm.entities.Countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries,Long> {
}
