package abstractClasses;

public class Cat extends Animal{
    private int Wehght;

    public Cat(int weight) {
        super (weight);
    }


    @Override
    public String talk() {
        return "Miau-Miau";
    }
}
