package org.fasttrackit.HomeworkInterfaces2;

public class Cat implements Behavior{
    @Override
    public void walk(String walkmessage) {
        System.out.println(String.format("%s Cat-Walk",walkmessage));
    }

    @Override
    public void eat(String eatmessage) {
        System.out.println(String.format("%s Cat-Eat",eatmessage));

    }

    @Override
    public void talk(String talkmessage) {
        System.out.println(String.format("%s Cat-Talk",talkmessage));

    }
}
