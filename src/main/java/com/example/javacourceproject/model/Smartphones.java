package com.example.javacourceproject.model;
import lombok.*;

@Setter
@Getter
public class Smartphones extends Product{
    private float displayDiagonal;
    private int batteryCapacity;
    private int memoryCapacity;
    private String color;

    public Smartphones(String title, String description, int quantity, float price, float displayDiagonal, int batteryCapacity, int memoryCapacity, String color) {
        this.displayDiagonal = displayDiagonal;
        this.batteryCapacity = batteryCapacity;
        this.memoryCapacity = memoryCapacity;
        this.color = color;
    }
}
