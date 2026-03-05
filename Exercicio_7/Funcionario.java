package Exercicio_7;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento departamento;

    Funcionario(int matricula, String nome, Departamento departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return "\nDados do Funcionário"  +
        "\nMatrícula: " + matricula
                + "\nNome: " + nome + "\n" +
                departamento;
    }

}
