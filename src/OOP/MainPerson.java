public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getDetails());

        Person person1 = new Person("Andrei Ciucaru", 41, "Is Unmarried");
        System.out.println(person1.getDetails());

        Person person2 = new Person("Raul Ciobanca", 23, "Is Unmarried");
        System.out.println(person2.getDetails());

        Person person3 = new Person("Miruna Ciucea", 60, "Is Married");
        System.out.println(person3.getDetails());
    }
}

