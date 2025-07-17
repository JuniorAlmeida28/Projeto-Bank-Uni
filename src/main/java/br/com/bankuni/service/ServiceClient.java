package main.java.br.com.bankuni.service;

import main.java.br.com.bankuni.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ServiceClient {
    private List<Client> clients = new ArrayList<>();

    public void newClient(Client client){
        clients.add(client);
    }

    public Client findclientByCpf(String cpf){
        for (Client cl : clients){
            if (cl.getCpf().equals(cpf)){
                return cl;
            }
        }
        return null;
    }
}
