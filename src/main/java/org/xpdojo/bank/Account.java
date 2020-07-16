package org.xpdojo.bank;

public class Account {
    private int balance;
    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int checkBalance() {
        return balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }


    public int withdraw(int amount) {
        balance -=amount;
        return balance;
    }

}
