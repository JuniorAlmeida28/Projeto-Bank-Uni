package main.java.br.com.bankuni.model;

public class SavingsAccount extends Account{

    public SavingsAccount(String number, Client client) {
        super(number, client);
    }

    @Override
    public void withdraw(double value) {
        if (value <= balance){
            balance -= value;
        }else {
            System.out.println("Saldo Insuficiente");
            return;
        }
    }
}
