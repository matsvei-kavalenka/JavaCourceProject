package com.example.javacourceproject.model;
import lombok.*;

@Setter
@Getter
public class Cases extends Product {
    private String type;
    private String material;
    private String color;

    public Cases(String title, String description, int quantity, float price, String type, String material, String color) {
        System.out.println("Title: " + title + "\n" + "Description: " + description + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n" + "Type: " + type + "\n" + "Material: " + material + "\n" + "Color: " + color + "\n" );
        this.type = type;
        this.material = material;
        this.color = color;
    }

    public String genText() {
        return "Name: " + title + " | Type: " + type + " | Price: " + price + "\n" + description;
    }
}
