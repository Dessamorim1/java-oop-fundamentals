public class Data {
    int dia;
    int mes;
    int ano;

    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public String toString() {
        return "\nData de Nascimento: " + "\n" +
                dia + "/" + mes + "/" + ano;
    }
}
