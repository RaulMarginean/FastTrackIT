package org.fasttrackit.Curs8Homework2and3;

import java.time.LocalDateTime;

public class Employee implements Person {
    private LocalDateTime birthDate;

    public Employee(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getFirstName() {
        return getFirstName();
    }

    @Override
    public String getLastName() {
        return getLastName();
    }

    @Override
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    @Override
    public String getAddress() {
        return getAddress();
    }
}






