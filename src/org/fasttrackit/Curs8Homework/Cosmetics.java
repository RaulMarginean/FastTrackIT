package org.fasttrackit.Curs8Homework;

public class Cosmetics extends Product{
    String color;
      int weight;

    public Cosmetics(int price, int quantity, String color, int weight) {
        super(price, quantity);
        this.color = color;
        this.weight = weight;
    }
}
