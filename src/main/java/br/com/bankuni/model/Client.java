package main.java.br.com.bankuni.model;

public class Client {

    private String name;
    private String cpf;
    private String telefone;

    public Client(String name, String cpf, String telefone) {
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
