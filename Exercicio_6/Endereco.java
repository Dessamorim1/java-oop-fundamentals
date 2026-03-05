public class Endereco {
    String logradouro;
    int numero_Casa;
    String bairro;
    String cidade;
    String estado;

    Endereco(String logradouro, int numero_Casa, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero_Casa = numero_Casa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return "\nEndereço: " + "\nLogradouro: " +
                logradouro +
                "\nNúmero da casa: " +
                numero_Casa + "\nBairro: " + bairro +
                "\nCidade: " + cidade + "\nEstado: " +
                estado;
    }

}
