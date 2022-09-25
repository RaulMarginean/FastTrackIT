package HomeworkInterfaces;

public class BT implements BankAccount{
    @Override
    public void account(String message) {
        System.out.println(String.format("Are you looking for a new money managing sistem,let BT banking sistem help %s ", message));
    }


}
