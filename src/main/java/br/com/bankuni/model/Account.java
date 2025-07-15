package main.java.br.com.bankuni.model;

public abstract class Account {

    protected String number;
    protected double balance;
    protected Client client;

    public Account(String number, double balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public abstract void withdraw(double value);

    public void deposit(double value){
        balance += value;
    }

    public void transfer(double value, Account account){
        this.withdraw(value);
        account.deposit(value);
    }
}
