package Exercicio_2;

public class Triangulo {
    int lado1;
    int lado2;
    int lado3;

    // Construtores
    // Sobrecarga
    Triangulo(int lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    };

    Triangulo(int lado, int base) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = base;
    }

    Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Métodos

    double calcPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    void tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1 && lado3 == lado2) {
            System.out.println("O Triângulo é Equilátero");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1 && lado3 != lado2) {
            System.out.println("O Triângulo é Escaleno");
        } else {
            System.out.println("O Triângulo é Isósceles");
        }
    }

    void exibirInfo() {
        System.out.println("O Triângulo possui lados de tamanho " + this.lado1 + "," + this.lado2 + "," + this.lado3);
        System.out.print("O Triângulo é do tipo ");
        tipoTriangulo();
        System.out.print("O resultado do cálculo do Perímetro é de ");
        System.out.println(calcPerimetro());

    }

}
