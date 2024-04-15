package com.example.javacourceproject.model;

import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Smartphones extends Product {
    private float displayDiagonal;
    private int batteryCapacity;
    private int memoryCapacity;
    private String color;
    private String operationSystem;

    public Smartphones(String title, String description, int quantity, float price, float displayDiagonal, int batteryCapacity, int memoryCapacity, String color, String operationSystem) {
        super(title,description,quantity,price);
        this.displayDiagonal = displayDiagonal;
        this.batteryCapacity = batteryCapacity;
        this.memoryCapacity = memoryCapacity;
        this.color = color;
        this.operationSystem = operationSystem;
    }

    public String genText() {
        return "Name: " + title + "\nPrice: " + price + "\nDescription: " + description;
    }
}
