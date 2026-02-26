package Exercicio_4;

public class Main {
    public static void main(String[] args) {
    
        Retangulo r1 = new Retangulo(2, 5);
        Retangulo r2 = new Retangulo(10, 5);
        Retangulo r3 = new Retangulo();

        System.out.println("O retângulo possui " + r1.area() + " de área.");
        System.out.println("O retângulo possui " + r2.area() + " de área.");
        System.out.println("O retângulo possui " + r3.area() + " de área (valor default).");

    }
}
