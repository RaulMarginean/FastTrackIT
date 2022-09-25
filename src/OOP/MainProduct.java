public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.getBevarage());
        Product product1 = new Product("Ciuc", 10, 100, "Non-Alcoholic Baverages");
        System.out.println(product1.getBevarage());
        Product product2 = new Product("Ursus", 12, 550, "Alcoholic Baverages");
        System.out.println(product2.getBevarage());
        Product product3 = new Product("Timisoreana", 9, 0, "Alcoholic Baverages");
        System.out.println(product3.getBevarage());
    }


}




