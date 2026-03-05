public class Cliente {
    String nome;
    String rg;
    String cpf;
    Telefone telefone;
    Data data_nascimento; // Associação
    Endereco endereco;

    Cliente(String nome, String rg, String cpf, Telefone telefone, Data data_nascimento, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
    }

    public String toString() {
        return "Cliente: " + "\nNome: " + nome +
                "\nRG: " + rg +
                "\nCPF: " + cpf +
                "\n" + telefone + "\n" + 
                data_nascimento + "\n" +
                endereco;
    }
}
