public class Person {
    String name = "John Doe";
    int age = 45;
    String status = "Is Married";

    public Person() {
        System.out.println("This is a persons name, age and status: ");
    }

    public Person(String name, int age, String status) {
        System.out.println("Custom Person details: ");
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getDetails() {
        return String.format("%d,%d,%d", name, age, status);
    }
}

