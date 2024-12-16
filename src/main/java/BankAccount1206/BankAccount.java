package BankAccount1206;

import moneyTest.Money;

public class BankAccount {

    public String accountNumber;
    public Money balance;
    public String owner;

    public BankAccount(String accountNumber,Money balance,String owner) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.owner = owner;
    }

    public void deposit(Money money) {
        balance = money.plus(balance);
    }

    public void withdraw(Money money) {
        balance = money.minus(balance);

    }
    public void getBalance() {
        System.out.println(balance);
    }
}
