package Exercicio_4;

public class Retangulo {
    int base;
    int altura;

    Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;

    }

    Retangulo() {
        this.base = 0;
        this.altura = 0;

    }

    double area() {
        return this.base * this.altura;
    }
}
