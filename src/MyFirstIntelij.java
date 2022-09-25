import java.util.Scanner;

public class MyFirstIntelij {
    public static void main(String[] args) {
        System.out.println("My first intelij");
        Scanner scanner = new Scanner(System.in);
        extracted(scanner);
    }
    private static void extracted(Scanner scanner) {
        String anyName = scanner.nextLine();
        System.out.println(anyName);
    }

    public static int anyNameMethod(int a, int b) {
        return a * b;

    }

}


