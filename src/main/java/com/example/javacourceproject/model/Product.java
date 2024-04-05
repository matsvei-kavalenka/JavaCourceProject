package com.example.javacourceproject.model;
import lombok.*;

@Setter
@Getter
public class Product{
    protected int id;
    protected String title;
    protected String description;
    protected int qty;
    protected float price;

    public Product() {
    }

    public Product(String title, String description, int quantity, float price) {
        this.title = title;
        this.description = description;
        this.qty = quantity;
        this.price = price;
    }


}
