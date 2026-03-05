public class Telefone {
    int DDD;
    String num_telefone;

    Telefone(int DDD, String num_telefone) {
        this.DDD = DDD;
        this.num_telefone = num_telefone;
    }

    public String toString() {

        return "\nTelefone:" + "\nDDD: " + DDD
                + "\nNúmero: " +
                num_telefone;
    }
}
