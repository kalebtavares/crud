package com.example.crud.model;

import jakarta.persistence.*;

@Entity(name = "product")
@Table(name = "product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long price;


    public Product(Integer id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
