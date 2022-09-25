
public class Product {
    String name = "Heineken";
    int price = 15;
    int quantity = 300;
    String category = "Alcoholic bevarages";

    public Product() {
        System.out.println("This is our product: ");
    }


    public Product(String name, int price, int quantity, String category){
        System.out.println("This is your bevarage to buy: ");
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public void setQuantity(int quantity) {
        this.quantity = price;
    }

    public String getBevarage(){
        return String.format("%d %d %d %d", name, price,quantity,category);
    }
}
