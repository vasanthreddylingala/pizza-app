package com.pizza.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    // No code needed! JpaRepository gives us save(), findAll(), deleteById() automatically.
}