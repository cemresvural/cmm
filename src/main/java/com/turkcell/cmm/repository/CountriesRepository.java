package com.turkcell.cmm.repository;


import com.turkcell.cmm.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries,Long> {
}
