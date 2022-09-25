package HomeworkInterfaces2;

public class Homework7Ex3 {
    public static void main(String[] args) {
        Animal cat = new Animal(new Cat());
        System.out.println("This is a cat and this is it behavior.");
        cat.thisAnimalEats();
        cat.thisAnimalWalks();
        cat.thisAnimalTalks();

        Animal dog = new Animal(new Dog());
        System.out.println("This is a dog and this is it behavior.");
        dog.thisAnimalEats();
        dog.thisAnimalWalks();
        dog.thisAnimalTalks();

        Animal mouse = new Animal(new Mouse());
        System.out.println("This is a mouse and this is it behavior.");
        mouse.thisAnimalEats();
        mouse.thisAnimalWalks();
        mouse.thisAnimalTalks();

        Animal chicken = new Animal(new Chicken());
        System.out.println("This is a chicken and this is it behavior.");
        chicken.thisAnimalEats();
        chicken.thisAnimalWalks();
        chicken.thisAnimalTalks();

        Animal duck = new Animal(new Duck());
        System.out.println("This is a duck and this is it behavior.");
        duck.thisAnimalEats();
        duck.thisAnimalWalks();
        duck.thisAnimalTalks();


    }

}
