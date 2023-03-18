package aula7;

public class SubGerente extends Gerente{
  String departamento;

  public SubGerente(String nome, String matricula, double salarioBase, String localDeLotacao, String departamento) {
    super(nome, matricula, salarioBase, localDeLotacao);
    this.departamento = departamento;
  }
}
