package HomeworkInterfaces2;

public class Dog implements Behavior{
    @Override
    public void walk(String walkmessage) {
        System.out.println(String.format("%s Dog-Walk",walkmessage));
    }

    @Override
    public void eat(String eatmessage) {
        System.out.println(String.format("%s Dog-Eat",eatmessage));
    }

    @Override
    public void talk(String talkmessage) {
        System.out.println(String.format("%s Dog-Talk",talkmessage));
    }
}
