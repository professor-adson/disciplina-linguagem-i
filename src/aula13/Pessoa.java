package aula13;

public class Pessoa {
  String nome;
  int idade;
  double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", altura=" + altura +
        '}';
  }
}
