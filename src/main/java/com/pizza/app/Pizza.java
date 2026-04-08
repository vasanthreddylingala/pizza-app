package com.pizza.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String size;
    private String topping;

    // No-arg constructor (required by JPA)
    public Pizza() {}

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSize() { return size; }
    public String getTopping() { return topping; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSize(String size) { this.size = size; }
    public void setTopping(String topping) { this.topping = topping; }
}