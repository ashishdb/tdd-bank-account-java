package org.xpdojo.bank;

public class Account {
    private int balance=0;
    public int checkBalance() {
        return balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
}
