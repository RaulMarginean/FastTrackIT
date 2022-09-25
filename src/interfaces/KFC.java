package org.fasttrackit.interfaces;

public class KFC implements FoodProvider{
    public static final String NAME = "KFC";
    private int quantity =0;

    @Override
    public String deliverFood() {
        quantity++;
        return "cryspy";
    }

    @Override
    public int getDeliveredQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
