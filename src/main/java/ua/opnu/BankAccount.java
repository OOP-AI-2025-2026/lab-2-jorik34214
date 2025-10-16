package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.0;

    void deposit(double amount) {
        // TODO: modify method body
        if (amount > 0) balance += amount;
    }

    double getBalance() {
        return balance;
    }

    boolean withdraw(double amount) {
        // TODO: modify method body
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        // TODO: modify method body
        if (this.withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        } else {
            return false;
        }
    }
}