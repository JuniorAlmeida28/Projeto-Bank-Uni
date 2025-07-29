package main.java.br.com.bankuni.model;

public class CheckingAccount extends Account{

    private double tax = 6.30;
    public CheckingAccount(String number, Client client) {
        super(number, client);
    }

    @Override
    public void withdraw(double value) {
        if ((value + tax) <= balance){
            balance -= (value + tax);
        }else {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
    }
}
