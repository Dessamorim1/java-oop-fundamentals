public class Main {

    // Sobrecarga em POO (Java) é quando uma mesma classe tem métodos
    // com o mesmo nome, mas com parâmetros diferentes,
    // permitindo comportamentos variados.

    public static void main(String[] args) {
        Circulo c = new Circulo(2);
        Circulo c2 = new Circulo(5);

        String mensagem_c = String.format(
                "A área do Circulo de raio %.2f é de %.2f e o comprimento de %.2f",
                c.getRaio(),
                c.area(),
                c.comprimento());

        String mensagem_c2 = String.format(
                "A área do Circulo de raio %.2f é de %.2f e o comprimento de %.2f",
                c2.getRaio(),
                c2.area(),
                c2.comprimento());
                
        System.out.println(mensagem_c);
        System.out.println(mensagem_c2);

    }
}