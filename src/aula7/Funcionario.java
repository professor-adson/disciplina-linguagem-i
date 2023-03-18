package aula7;

public class Funcionario {
  String nome;
  String matricula;
  private double salarioBase;

  public Funcionario(String nome, String matricula, double salarioBase) {
    this.nome = nome;
    this.matricula = matricula;
    this.salarioBase = salarioBase;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
        "nome='" + nome + '\'' +
        ", matricula='" + matricula + '\'' +
        ", salarioBase=" + salarioBase +
        '}';
  }
}
