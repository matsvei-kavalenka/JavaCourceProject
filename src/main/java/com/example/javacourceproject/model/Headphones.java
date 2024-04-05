package com.example.javacourceproject.model;
import lombok.*;

@Setter
@Getter
public class Headphones extends Product{
    private String type;
    private int batteryCapacity;
    private String color;

    public Headphones(String title, String description, int quantity, float price, String type, int batteryCapacity, String color) {
        this.type = type;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }
}
