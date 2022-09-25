package interfaces;

public class McDonalds implements FoodProvider{
    public static final String NAME = "McDonalds";
    private int quantity =0;


    @Override
    public String deliverFood() {
        quantity++;
        return "burger";
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
