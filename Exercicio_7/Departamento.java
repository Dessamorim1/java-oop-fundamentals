package Exercicio_7;

public class Departamento {
    private int codigo;
    private String nome;
    
    Departamento(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "\nDepartamento" +  
        "\nNome: " + nome
        + "\nCódigo: " + codigo;
    }
}
