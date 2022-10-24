package org.FastTrackIt.Classes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex");
        Person.Address address = person.new Address("Clujului", "Oradea");
        Person.School school = new Person.School("Ioan Opris");

        person.doSomethingSecret();



    }
}
