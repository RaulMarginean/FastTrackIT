package org.fasttrackit.HomeworkInterfaces2;

public class Chicken implements Behavior{
    @Override
    public void walk(String walkmessage) {
        System.out.println(String.format("%s Chicken-Walk",walkmessage));
    }

    @Override
    public void eat(String eatmessage) {
        System.out.println(String.format("%s Chicken-Eat",eatmessage));
    }

    @Override
    public void talk(String talkmessage) {
        System.out.println(String.format("%s Chicken-Talk",talkmessage));
    }
}
