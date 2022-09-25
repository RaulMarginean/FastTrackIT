package org.fasttrackit.Curs8Homework2;

import java.time.LocalDateTime;

public class Person {
    String FirstName;
    String LastName;
    LocalDateTime Birthday;
    String Address;

    public Person(String firstName, String lastName, LocalDateTime birthday, String address) {
        FirstName = firstName;
        LastName = lastName;
        Birthday = birthday;
        Address = address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public LocalDateTime getBirthday() {
        return Birthday;
    }

    public String getAddress() {
        return Address;
    }
}

