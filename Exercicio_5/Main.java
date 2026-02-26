package Exercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasseBancaria CB = null;
        int opcao;

        do {

            System.out.println("Qual operação você deseja realizar: ");
            System.out.println("Opção 1 - Criar uma conta ");
            System.out.println("Opção 2 - Depositar um valor");
            System.out.println("Opção 3 - Sacar um valor ");
            System.out.println("Opção 4 - Exibir dados bancários");
            System.out.println("Opção 5 - Sair ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe seu nome: ");
                    String nome = sc.next();
                    System.out.print("Informe o número da conta: ");
                    String numero = sc.next();
                    System.out.print("Informe seu saldo inicial: ");
                    Double saldo = sc.nextDouble();
                    CB = new ClasseBancaria(nome, numero, saldo);
                    break;
                case 2:
                    if (CB == null) {
                        System.out.println("Crie uma conta primeiro (Opção 1).");
                        break;
                    }
                    System.out.print("Qual valor você deseja depositar : ");
                    Double valor = sc.nextDouble();
                    CB.depositar(valor);
                    break;
                case 3:
                    if (CB == null) {
                        System.out.println("Crie uma conta primeiro (Opção 1).");
                        break;
                    }
                    System.out.print("Qual valor você deseja sacar : ");
                    Double saque = sc.nextDouble();
                    CB.sacar(saque);
                    break;
                case 4:
                    if (CB == null) {
                        System.out.println("Crie uma conta primeiro (Opção 1).");
                        break;
                    }
                    System.out.print("Suas informações : ");
                    CB.exibirSaldo();
                    break;
                case 5:
                    System.out.print("Obrigada volte sempre...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 5);
        sc.close();
    }
}