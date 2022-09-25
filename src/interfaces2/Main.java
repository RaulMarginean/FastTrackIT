package org.fasttrackit.interfaces2;

public class Main {
    public static void main(String[] args) {
        Custom custom = new Custom();

        Rebel rebel = new Rebel(18,"Mike");

        Romanian romanian = new Romanian(18, "Joe",1231234, "Romania");

        RomanianOmvWorker Monica = new RomanianOmvWorker(35,"Monica",54234, "Anglia",5000);

        custom.addToQueue(romanian);
        custom.addToQueue(Monica);
       // custom.addToQueue(Rebel);
        // Nu respecta criteriile
    }
}
