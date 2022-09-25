public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHour(13);
        clock.setHour(99);
        System.out.println(clock.getTime());

        Clock clock2 = new Clock(22,46);
        System.out.println(clock2.getTime());

    }



}
