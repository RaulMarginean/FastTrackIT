package HomeworkInterfaces2;

public class Mouse implements Behavior{
    @Override
    public void walk(String walkmessage) {
        System.out.println(String.format("%s Mouse-Walk",walkmessage));
    }

    @Override
    public void eat(String eatmessage) {
        System.out.println(String.format("%s Mouse-Eat",eatmessage));
    }

    @Override
    public void talk(String talkmessage) {
        System.out.println(String.format("%s Mouse-Talk",talkmessage));
    }
}
