package org.fasttrackit.Curs8Homework2and3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        PersonData personData = new PersonData(new Employee(LocalDateTime.of(1991, 10, 10, 22, 10)));
        System.out.println(personData.getAge());
    }
}
