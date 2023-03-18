package aula7;

public class Teste {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("A", "B", 1000);
    Gerente gerente = new Gerente("G", "G1", 2000, "L");
    Assistente assistente = new Assistente("ASSIS", "S", 1500);
    Vendedor vendedor = new Vendedor("V", "V1", 1800);

    double soma = funcionario.getSalarioBase() + gerente.getSalarioBase()
        + assistente.getSalarioBase() + vendedor.getSalarioBase();
    System.out.println(soma);
  }
}
