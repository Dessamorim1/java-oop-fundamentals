public class Circulo {

    private double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    // Encapsulamento
    public double getRaio(){
        return this.raio;
    }

    double comprimento(){
        return 2 * 3.14 * this.raio;
    }

    double area(){
        return 3.14 * this.raio * this.raio;
    }
}