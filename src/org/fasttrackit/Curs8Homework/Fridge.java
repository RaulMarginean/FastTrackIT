package org.fasttrackit.Curs8Homework;

public class Fridge extends Electronics{
    int temperature;

    public Fridge(int price, int quantity, String type, int length, int width, int height, int weight, int temperature) {
        super(price, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
