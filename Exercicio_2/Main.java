package Exercicio_2;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10, 10, 10);

        String mensagem = String.format(
                "O Perímetro do Triângulo é de %.2f",
                t1.calcPerimetro());
        System.out.println(mensagem);
        t1.tipoTriangulo();
        t1.exibirInfo();

    }
}