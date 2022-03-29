package aula7;

public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Adson", "001", 1000);
        Assistente assistente = new Assistente("João", "002", 500);
        Vendedor vendedor = new Vendedor("Pedro", "003", 700);

        double s1 = gerente.getSalarioBase();
        double s2 = assistente.getSalarioBase();
        double s3 = vendedor.getSalarioBase();
        double soma = s1 + s2 + s3;
        System.out.println(soma);
    }
}
