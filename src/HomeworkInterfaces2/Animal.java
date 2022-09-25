package HomeworkInterfaces2;

public class Animal {
    private Behavior behavior;

    public Animal(Behavior behavior) {
        this.behavior = behavior;
    }
    public void thisAnimalEats(){behavior.eat("Eats like this:");}
    public void thisAnimalWalks(){behavior.walk("Walks like this:");}
    public void thisAnimalTalks(){behavior.talk("Talks like this:");}

}
