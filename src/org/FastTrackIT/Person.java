package org.FastTrackIT;

public class Person {
    String name;
    int age;
    String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Object name() {
        return name;
    }

    public Object age() {
        return age;
    }

    public Object position() {
        return position;
    }
}
