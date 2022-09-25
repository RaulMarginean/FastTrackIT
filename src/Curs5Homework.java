public class Curs5Homework {
    public static void main(String[] args) {
    }

    //1. Scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static long sirNumere(int[] numere) {
        if (numere != null) {
            long sum = 0;
            for (int n : numere) {
                sum += n;
            }
            return sum;
        }
        return 0;
    }

    //2. Scrieti o functie care primeste un sir de numere intregi si ruleaza numarul de elemente impare

    public static void countOddNumbers(int[] numbers) {
        int counter = 0;
        for (int n : numbers) {
            if (n % 2; != 0){
                counter++;
            }
            return counter;
        }
        return 0;
    }

    //3. Scrieti o fucntie care primeste un sir de numere intregi si un numar intreg
    public static void()

    // 6. Scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua
    public static void despartireFraze(String fraza) {
        String[] despartireFraze = fraza.split("[.]");
        for (String propozitie : despartireFraze) {
            System.out.println(propozitie.trim() + ".");
        }
    }
}
