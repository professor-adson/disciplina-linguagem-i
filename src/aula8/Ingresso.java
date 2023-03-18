package aula8;

public class Ingresso {
  double valor;

  public Ingresso() {
    this.valor = 100;
  }

  public void imprimeValor() {
    System.out.println(this.valor);
  }

  public double getValor() {
    return this.valor;
  }
}
