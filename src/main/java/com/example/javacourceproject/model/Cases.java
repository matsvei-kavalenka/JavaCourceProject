package com.example.javacourceproject.model;
import lombok.*;

@Setter
@Getter
public class Cases extends Product {
    private String type;
    private String material;
    private String color;

    public Cases(String title, String description, int quantity, float price, String type, String material, String color) {
        this.type = type;
        this.material = material;
        this.color = color;
    }
}
