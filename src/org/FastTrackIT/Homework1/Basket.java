package org.FastTrackIT.Homework1;

import java.util.*;

public class Basket {
    private static List<String> fruits;

        private int maxCapacity;

    public static void main(String[] args) {
        List<String>strings = new ArrayList<>();
        strings.add("Mar");
        strings.add("Banana");
        int maxCapacity = 10;
        Basket basket = new Basket(strings, maxCapacity);
        System.out.println(" ");
    }


    public Basket(List<String> fruits, int maxCapacity) {
        this.fruits = new ArrayList<>();
        this.fruits.addAll(fruits);
        this.maxCapacity= maxCapacity;
    }





    public boolean find(String fruit) {
        if (fruits == null) {
            return false;
        } else {
            return fruits.contains(fruit);
        }

    }

    public void add(String fruit) {
        if (fruit != null) {
            fruits.add(fruit);
        }
    }

    public Collection<String> distinct(){
        return new HashSet<>(fruits);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
