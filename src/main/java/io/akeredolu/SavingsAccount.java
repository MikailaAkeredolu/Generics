package io.akeredolu;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class SavingsAccount implements Account {
    private int initialBalance;

    public SavingsAccount(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void withdraw(int amount) {
        initialBalance = initialBalance - amount;
    }

    public void deposit(int amount) {
        initialBalance = (2/100)*amount + amount + initialBalance;
    }
}
