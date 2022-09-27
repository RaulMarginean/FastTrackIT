package org.FastTrackIt.Homework1;

import java.util.ArrayList;
import java.util.stream.BaseStream;

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
