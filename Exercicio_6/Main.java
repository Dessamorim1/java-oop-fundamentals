public class Main {
    public static void main(String[] args) {
      Data data = new Data(16, 05, 2006);
      Telefone telefone = new Telefone(81,"974299886");
      Endereco endereco = new Endereco("Rua padre", 666, "Boa viagem", "Olinda", "Pernambuco");
      Cliente cliente = new Cliente("Bia", "11065420", "653334812345", telefone, data, endereco);

      System.out.println(cliente);
    }
}
