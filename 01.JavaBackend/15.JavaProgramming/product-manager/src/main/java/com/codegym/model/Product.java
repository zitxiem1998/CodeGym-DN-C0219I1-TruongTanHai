package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private String producer;
    private String description;

    public Product() {
    }

    public Product(int id, String name, float price, String producer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
