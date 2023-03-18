package aula7;

public class Gerente extends Funcionario {
  String localDeLotacao;

  public Gerente(String nome, String matricula, double salarioBase, String localDeLotacao) {
    super(nome, matricula, salarioBase);
    this.localDeLotacao = localDeLotacao;
  }
}
