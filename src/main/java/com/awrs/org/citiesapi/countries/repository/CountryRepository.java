package com.awrs.org.citiesapi.countries.repository;

import com.awrs.org.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
