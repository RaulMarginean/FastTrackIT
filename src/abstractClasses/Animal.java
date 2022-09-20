package abstractClasses;

public abstract class Animal {
    private int Weight;

    public Animal(int weight) {
        this.Weight = weight;
    }

   public Integer getWeight(){
        return Weight;
            }
    abstract public String talk();

}
