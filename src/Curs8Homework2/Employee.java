package Curs8Homework2;

import java.time.LocalDateTime;

public class Employee  extends  Person{

    LocalDateTime dateOfEmployment;
    String position;

    public Employee(String firstName, String lastName, LocalDateTime birthday, String address) {
        super(firstName, lastName, birthday, address);
    }

    public void setDateOfEmployment(int dateOfEmployment) {
        this.dateOfEmployment = getBirthday();
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

