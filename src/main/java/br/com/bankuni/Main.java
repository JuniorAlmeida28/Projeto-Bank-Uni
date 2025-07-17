package main.java.br.com.bankuni;

import main.java.br.com.bankuni.model.Account;
import main.java.br.com.bankuni.model.CheckingAccount;
import main.java.br.com.bankuni.model.Client;
import main.java.br.com.bankuni.model.SavingsAccount;
import main.java.br.com.bankuni.service.ServiceBank;
import main.java.br.com.bankuni.service.ServiceClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        ServiceBank bank = new ServiceBank();
        ServiceClient serviceClient = new ServiceClient();

        Client c1 = new Client("Junior", "55", "12");
        Account ac1 = new CheckingAccount("123", c1);

        serviceClient.newClient(c1);
        bank.newAccount(ac1);

        bank.deposit("123", 55);
        bank.consultBalance("123");

        int op = 0;
        while (op < 6){
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Saldo");
            System.out.println("6. Sair");

            int option = en.nextInt();

            switch (option){
                case 1:
                    System.out.println("========== Cadastro cliente ==========");
                    System.out.print("Nome: ");
                    String name = en.next();
                    System.out.print("CPF: ");
                    String cpf = en.next();
                    System.out.print("Telefone: ");
                    String phone = en.next();
                    Client client = new Client(name, cpf, phone);
                    System.out.println("Cliente cadastrado com sucesso!");

                    System.out.println("========== Criar conta ==========");
                    System.out.println("Escolha o tipo de conta:");
                    System.out.println("1 - Conta corrente");
                    System.out.println("2 - Conta Poupança");
                    int type = en.nextInt();
                    en.nextLine();
                    System.out.print("Número da conta: ");
                    String number = en.nextLine();

                    Account account;

                    if (type == 1){
                        account = new CheckingAccount(number, client);
                    }else if (type == 2){
                        account = new SavingsAccount(number, client);
                    }else {
                        System.out.println("Opção inválida");
                        return;
                    }
                    bank.newAccount(account);
                    serviceClient.newClient(client);
                    System.out.println("Conta criada com sucesso!");
                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.println("========== Deposito ===========");
                    System.out.print("Informe o número da conta que deseja depositar: ");
                    number = en.next();
                    System.out.print("Digite o valor do depositar: ");
                    double value = en.nextDouble();
                    bank.deposit(number, value);
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println("==============================");
                    break;
                case 3:
                    System.out.println("========== Saque =============");
                    System.out.print("Informe o número da conta: ");
                    number = en.next();
                    System.out.print("Informe o valor de saque: ");
                    value = en.nextDouble();
                    bank.withdraw(number, value);
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("==============================");
                    break;
                case 4:
                    System.out.println("========== Transferir =============");
                    System.out.print("Informe o número da conta de origem: ");
                    String origin = en.next();
                    System.out.print("Informe o número da conta de destino: ");
                    String destination = en.next();
                    System.out.print("Digite o valor a ser transferido: ");
                    value = en.nextDouble();
                    bank.transfer(origin, destination, value);
                    System.out.println("===================================");
                    break;
                case 5:
                    System.out.println("========== Saldo =============");
                    System.out.print("Informe o Número da conta: ");
                    number = en.next();
                    bank.consultBalance(number);
                    System.out.println("==============================");
                    break;
                case 6:
                    op = 5;
                    break;
            }
        }
        en.close();
    }
}