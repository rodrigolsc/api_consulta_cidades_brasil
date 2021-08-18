package com.github.rodrigolsc.countries.repositories;

import com.github.rodrigolsc.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
