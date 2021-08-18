package com.github.rodrigolsc.states.repositories;

import com.github.rodrigolsc.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
