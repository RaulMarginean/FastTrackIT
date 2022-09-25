package homework;

public class Bottle {
    private int totalCapacity;
    private int avalaibleLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int avalaibleLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.avalaibleLiquid = avalaibleLiquid;
        this.open = open;
    }

    protected void protectedMethod(){}
    void defaultMethod(){}

    private void privateMethod(){}

    public void publicMethod(){}
        //privateMethod();

    public boolean hasLiquid() {
        return avalaibleLiquid > 0;
    }

    public int getAvalaibleLiquid() {
        return avalaibleLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - avalaibleLiquid;
    }

    public String open() {
        if (open) {
            System.out.println("org.fasttrackit.homework.Bottle is already open");
            return null;
        }
        open = true;
        return "org.fasttrackit.homework.Bottle is opened";
    }

    public String close() {
        if (open) {
            System.out.println("org.fasttrackit.homework.Bottle is already closed");
            return null;
        }
        open = false;
        return "org.fasttrackit.homework.Bottle is closed";
    }

    public String setOpen(boolean open) {
        String actionResult = open ? "opened" : "closed";
        if (open == this.open) {
            System.out.println(String.format("org.fasttrackit.homework.Bottle is already %s", actionResult));
            return null;
        }
        this.open = open;
                return String.format("org.fasttrackit.homework.Bottle is %s", actionResult);
    }

    public String drink(int liquid) {
        if (liquid<0){
            System.out.println("Liquid to drink must be strictly positive");
            return null;
        }
        if(!open){
            System.out.println("org.fasttrackit.homework.Bottle is not opened");
            return null;
        }
        if (liquid>avalaibleLiquid){
            System.out.println("Not enough liquid");
            return null;
        }
        avalaibleLiquid-=liquid;
        return "Remaining liquid is "+ avalaibleLiquid;
    }

    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, 490, false);
        bottle.drink(100);
        System.out.println(bottle.open());
        bottle.open();
        bottle.drink(600);
        bottle.drink(-200);
        System.out.println(bottle.drink(200));
        System.out.println(bottle.close());
        bottle.close();
    }

}

