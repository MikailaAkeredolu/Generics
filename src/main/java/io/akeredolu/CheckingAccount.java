package io.akeredolu;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class CheckingAccount implements Account {
    private int initialBalance;

    public CheckingAccount(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void withdraw(int amount) {
        initialBalance = initialBalance - amount;
    }

    public void deposit(int amount) {
       initialBalance = initialBalance + amount;
    }
}
