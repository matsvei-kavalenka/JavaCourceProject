package com.example.javacourceproject.model;
import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Cases extends Product {
    private String type;
    private String material;
    private String color;

    public Cases(String title, String description, int quantity, float price, String type, String material, String color) {
        super(title,description,quantity,price);
        this.type = type;
        this.material = material;
        this.color = color;
    }

    public String genText() {
        return "Name: " + title + "\nType: " + type + "\nPrice: " + price + "\nDescription: " + description;
    }
}
