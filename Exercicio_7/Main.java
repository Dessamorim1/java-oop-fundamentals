package Exercicio_7;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(2, "T.I");
        Funcionario funcionario = new Funcionario(1040, "Andressa", departamento);

        System.out.println(funcionario);

    }
}
