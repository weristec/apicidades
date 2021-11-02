package com.awrs.org.citiesapi.states.repository;

import com.awrs.org.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
