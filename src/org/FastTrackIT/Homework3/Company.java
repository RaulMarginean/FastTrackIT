package org.FastTrackIT.Homework3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees;

    public void employ(Person person) {
        if (person.isManager() && hasManager()) {
            System.out.println("Already has a manager");
        }
        employees.add(person);
    }


    private boolean hasManager() {
        boolean found = false;
        for (Person p : employees) {
            if (p.isManager()) {
                return true;
            }
        }
        return false;
    }


    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person p : employees) {
            if (p.age() > age) {
                result.add(p);
            }
        }
        return result;
    }
}
