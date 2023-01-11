package com.interview.prep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Double price;

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

