package homework;

public class Store {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(500,200,true);
        bottle.defaultMethod();
        bottle.protectedMethod();
        //bottle.privateMethod();
    }
}
