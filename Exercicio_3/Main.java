package Exercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o lado do seu quadrado: ");
        int lado = s.nextInt();

        Quadrado q1 = new Quadrado(lado);
        String mensagem = String.format(
                "O quadrado tem %.2f de área.",
                q1.area());
        System.out.println(mensagem);
        System.out.println("O quadrado possui " + q1.comprimento() + " de comprimento.");
        System.out.println("Desenho do quadrado :");
        q1.desenha();

        s.close();
    }
}