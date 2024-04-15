package com.example.javacourceproject.model;
import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Headphones extends Product{
    private String type;
    private int batteryCapacity;
    private String color;

    public Headphones(String title, String description, int quantity, float price, String type, int batteryCapacity, String color) {
        super(title,description,quantity,price);
        this.type = type;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public String genText() {
        return "Name: " + title + "\nPrice: " + price + "\nDescription: " + description;
    }

}
