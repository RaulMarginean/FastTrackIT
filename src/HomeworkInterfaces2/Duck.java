package HomeworkInterfaces2;

public class Duck implements Behavior{
    @Override
    public void walk(String walkmessage) {
        System.out.println(String.format("%s Duck-Walk",walkmessage));
    }

    @Override
    public void eat(String eatmessage) {
        System.out.println(String.format("%s Duck-Eat",eatmessage));
    }

    @Override
    public void talk(String talkmessage) {
        System.out.println(String.format("%s Duck-Talk",talkmessage));
    }
}
