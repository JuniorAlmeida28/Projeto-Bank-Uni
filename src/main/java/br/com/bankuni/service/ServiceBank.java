package main.java.br.com.bankuni.service;

import main.java.br.com.bankuni.model.Account;
import main.java.br.com.bankuni.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ServiceBank {
    private final List<Account> accounts = new ArrayList<>();

    public void newAccount(Account account){
        accounts.add(account);
    }

    public Account findAccountByNumber(String number){
        for (Account ac : accounts){
            if (ac.getNumber().equals(number)){
                return ac;
            }
        }
        return null;
    }

    public void deposit(String number, double value){
        Account accounts = findAccountByNumber(number);

        if (accounts.getNumber() == null ){
            System.out.println("Conta não encontrada!");
            return;
        }
        accounts.deposit(value);
    }

    public void consultBalance(String number){
        Account account = findAccountByNumber(number);
        if (account.getNumber() == null){
            throw new IllegalArgumentException("Conta não encontrada");
        }
        System.out.println("Saldo: " + String.format("%.2f", account.getBalance()));
    }

    public void withdraw(String number, double value){
        Account account = findAccountByNumber(number);
        if (account.getNumber() == null){
            throw new IllegalArgumentException("Conta não encontrada");
        }
        account.withdraw(value);
    }

    public void transfer(String numberOrigin, String numberDestination, double value){

        Account origin = findAccountByNumber(numberOrigin);
        Account destination = findAccountByNumber(numberDestination);
        if (origin == null || destination == null){
            throw new IllegalArgumentException("Contas não encontradas!");
        }
        origin.transfer(value, destination);
    }
}
