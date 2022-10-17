package org.FastTrackIt.Homework3;

public record Person(String name, int age, String position) {

    public boolean isManager(){
        return position.equals("manager");
    }
}
