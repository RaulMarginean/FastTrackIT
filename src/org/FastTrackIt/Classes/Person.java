package org.FastTrackIt.Classes;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;

    }
public  String doSomethingSecret(){
        FullName fullName = new FullName("Alex", "Paltinean");
        return  fullName.getFullName();
}


    class Address{
        private final String sreet;
        private final String city;

        public Address(String sreet, String city) {
            this.sreet = sreet;
            this.city = city;
        }
    }
    static class School{
        private final String name;

        public School(String name) {
            this.name = name;
        }
    }
    private class FullName{
        private final String firstName;
        private final String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        private String getFullName(){
            return firstName +" "+  lastName;
        }
    }
}
