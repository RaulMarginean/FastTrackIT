package org.fasttrackit.HomeworkInterfaces;

public class Person {
    private BankAccount bankAccount;

    public Person(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void depositAndWithdraw(){
        bankAccount.account("You can deposit and withdraw money from us");
    }
}
