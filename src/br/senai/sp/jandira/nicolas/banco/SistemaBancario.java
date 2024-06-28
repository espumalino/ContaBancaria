package br.senai.sp.jandira.nicolas.banco;
import br.senai.sp.jandira.nicolas.banco.model.Agencia;
import br.senai.sp.jandira.nicolas.banco.model.Cliente;
import br.senai.sp.jandira.nicolas.banco.model.Conta;
import br.senai.sp.jandira.nicolas.banco.model.TipoDeConta;

public class SistemaBancario {

    public static void main(String[] args) {


        Agencia agency01 = new Agencia();
        agency01.setNumber("1234-06");
        agency01.setAddress("Av. Brasil, 600 - Jandira/SP");
        agency01.setManager("Silvio Santos");

        Cliente client01 = new Cliente();
        client01.setName("Nicolas Henrique");
        client01.setTelephone("(11)98754-5676");
        client01.setCpf("323.756.239-89");

        Cliente client02 = new Cliente();
        client02.setName("Luana da Silva");
        client02.setTelephone("(11)96342-4659");
        client02.setCpf("432.556.332.26");

        Conta account01 = new Conta();
        account01.setClient(client01);
        account01.setAgency(agency01);
        account01.setNumber("456-09");
        account01.deposit(600);
        account01.setAccountType(TipoDeConta.CHAIN);

        Conta account02 = new Conta();
        account02.setClient(client02);
        account02.setAgency(agency01);
        account02.setNumber("456-09");
        account02.deposit(100);
        account02.setAccountType(TipoDeConta.SAVINGS);

        System.out.println("------------------------------------------------------");

        // ACCOUNT01'S OWNER
        System.out.printf("USUÁRIO: %s \n", client01.getName());

        // SHOW ACCOUNT01'S BALANCE
        // System.out.printf("SALDO: %s \n", account01.getBalance());

        // WITHDRAW FROM ACCOUNT01
        // account01.withdraw(80);

        // System.out.printf("SALDO: %s \n", account01.getBalance());

        // DEPOSIT ON ACCOUNT01
        // account01.deposit(50);

        //System.out.printf("SALDO: %s \n", account01.getBalance());

        account01.transfer(100, account02);

        System.out.println("------------------------------------------------------");

        // ACCOUNT02'S OWNER
        System.out.printf("USUÁRIO: %s \n", client02.getName());

        // SHOW ACCOUNT02'S BALANCE
        // System.out.printf("SALDO: %s \n", account02.getBalance());

        // WITHDRAW FROM ACCOUNT02
        // account02.withdraw(80);

        // System.out.printf("SALDO: %s \n", account02.getBalance());

        // DEPOSIT ON ACCOUNT02
        // account02.deposit(50);

        System.out.printf("SALDO: %s \n", account02.getBalance());

    }

}
