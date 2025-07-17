package main.java.br.com.bankuni.model;

public class Client {

    private String name;
    private String cpf;
    private String phone;

    public Client(String name, String cpf, String telefone) {
        this.name = name;
        this.cpf = cpf;
        this.phone = telefone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
