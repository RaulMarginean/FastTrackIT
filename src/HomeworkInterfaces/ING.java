package HomeworkInterfaces;

public class ING implements BankAccount{
    @Override
    public void account(String message) {
        System.out.println(String.format("Are you looking for a new money managing sistem,let ING banking sistem help, %s ", message));
    }
}
