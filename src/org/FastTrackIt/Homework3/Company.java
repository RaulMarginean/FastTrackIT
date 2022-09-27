package org.FastTrackIt.Homework3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees;

    public void employ(Person person) {
        if(person.position().equals("manager")){
            boolean found= false;
            for(Person p: employees){
                if (p.position().equals("manager")) {
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Already has a manager");
            }
        }
        employees.add(person);
    }

    public List<Person>getPersonsOlder(int age){
        List<Person>result = new ArrayList<>();
        for(Person p: employees){
            if(p.age()>age){
                result.add(p);
            }
        }
        return result;
    }
}
