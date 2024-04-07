package com.example.javacourceproject.model;

import lombok.*;

@Setter
@Getter
public class Smartphones extends Product {
    private float displayDiagonal;
    private int batteryCapacity;
    private int memoryCapacity;
    private String color;
    private String operationSystem;

    public Smartphones(String title, String description, int quantity, float price, float displayDiagonal, int batteryCapacity, int memoryCapacity, String color, String operationSystem) {
        System.out.println("Title: " + title + "\n" + "Description: " + description + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n" + "Display Diagonal: " + displayDiagonal + "\n" + "Battery Capacity: " + batteryCapacity + "\n" + "Memory Capacity: " + memoryCapacity + "\n" + "Color: " + color + "\n" + "OS: " + operationSystem + "\n");
        this.displayDiagonal = displayDiagonal;
        this.batteryCapacity = batteryCapacity;
        this.memoryCapacity = memoryCapacity;
        this.color = color;
        this.operationSystem = operationSystem;
    }

    public String genText() {
        return "Name: " + title + " | Price: " + price + "\n" + description;
    }
}
