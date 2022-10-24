package org.FastTrackIT.Homework1;

import java.util.ArrayList;

public class PassedByReference {
    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<>(),5);
        doSiomething(basket);
        System.out.println(basket.getMaxCapacity());
    }

    public static int doSiomething(Basket basket){
        return 10;
    }

}
