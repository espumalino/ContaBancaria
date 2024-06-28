package br.senai.sp.jandira.nicolas.banco.model;

public class Conta {

    private Agencia agency;
    private String number;
    private double balance;
    private Cliente client;
    private TipoDeConta accountType;

    public Agencia getAgency() {
        return agency;
    }

    public void setAgency(Agencia agency) {
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public TipoDeConta getAccountType() {
        return accountType;
    }

    public void setAccountType(TipoDeConta accountType) {
        this.accountType = accountType;
    }

    public boolean withdraw(double value) {
        if (balance >= value && value > 0) {
            balance = balance - value;
            System.out.printf("SACANDO R$ %s DA CONTA %s.\n", value, client.getName());
            System.out.printf("SAQUE REALIZADO COM SUCESSO.\n");
            System.out.printf("SALDO: %s \n \n", balance);
            return true;
        } else {
            System.out.println("VALOR INCORRETO.");
            return false;
        }
    }

    public void deposit(double value) {
        if (value > 0) {
            balance = balance + value;
            System.out.printf("DEPOSITANDO R$ %s NA CONTA %s.\n", value, client.getName());
            System.out.printf("DEPÓSITO REALIZADO COM SUCESSO.\n \n");
        } else {
            System.out.println("VALOR INCORRETO.");
        }
    }

    public void transfer(double value, Conta destinationAccount) {
        System.out.printf("TRANSFERINDO R$ %s DA CONTA %s PARA A CONTA %s \n",value, client.getName(), destinationAccount.getClient().getName());
        if (withdraw(value)) {
            destinationAccount.deposit(value);
        } else {
            System.out.println("SALDO INSUFICIENTE.");
        }


    }

}
