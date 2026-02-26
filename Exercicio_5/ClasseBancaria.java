package Exercicio_5;

public class ClasseBancaria {
    String nomeTitular;
    String numeroConta;
    double saldo;

    ClasseBancaria(String nomeTitular, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        this.saldo = saldo + valor;
        System.out.println("O valor foi depositado com sucesso!");
    }

    void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            this.saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    void exibirSaldo() {
        System.out.println("Olá " + this.nomeTitular + " registrado na conta de número " + this.numeroConta
                + " seu saldo atual é de " + this.saldo);
    }
}
