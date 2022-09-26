package org.fasttrackit.Curs8Homework2and3;

import java.time.LocalDateTime;

public class PersonData {
    private Person person;

    public PersonData(Person person) {
        this.person = person;
    }


    public int getAge() {
        return LocalDateTime.now().getYear() - person.getBirthDate().getYear();
    }

}
