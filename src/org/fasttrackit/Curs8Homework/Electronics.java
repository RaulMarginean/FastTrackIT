package org.fasttrackit.Curs8Homework;

public class Electronics extends Product{
    String type;
    int length;
    int width;

    public Electronics(int price, int quantity, String type, int length, int width, int height, int weight) {
        super(price, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int height;
    int weight;
}

