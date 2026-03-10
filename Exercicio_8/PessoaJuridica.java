package Exercicio_8;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public int getIdade() {
        return super.getIdade();
    }

    public String getNome() {
        return super.getNome();
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }
}
