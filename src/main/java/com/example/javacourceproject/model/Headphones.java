package com.example.javacourceproject.model;
import lombok.*;

@Setter
@Getter
public class Headphones extends Product{
    private String type;
    private int batteryCapacity;
    private String color;

    public Headphones(String title, String description, int quantity, float price, String type, int batteryCapacity, String color) {
        System.out.println("Title: " + title + "\n" + "Description: " + description + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n" + "Type: " + type + "\n" + "Battery Capacity: " + batteryCapacity + "\n" + "Color: " + color + "\n");
        this.type = type;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public String genText() {
        return "Name: " + title + " | Price: " + price + "\n" + description;
    }

}
