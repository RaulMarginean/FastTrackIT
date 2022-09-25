package staticPackage;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane(34, "military");
        Airplane a2 = new Airplane(12, " comercial");

        System.out.println(a1.getFuelleft());//34
        System.out.println(a2.getFuelleft());//12

        a1.setFuelleft(25);

        System.out.println(a1.getFuelleft());//25
        System.out.println(a2.getFuelleft());//12

           }
}
