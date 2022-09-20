package abstractClasses;

public class Dog extends Animal{
    private int Weight;

    public Dog(int weight) {
        super(weight);
            }

    @Override
    public String talk() {
        return "Ham-Ham";
    }
}
