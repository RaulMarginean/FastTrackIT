package org.fasttrackit.Curs8Homework;

public class Product {
    private String name;
    public int price;
    private String description;
    public int quantity;

    public Product(int price, int quantity){
        this.price= 500;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
