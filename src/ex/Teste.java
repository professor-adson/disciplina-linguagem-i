package ex;

public class Teste {
  public static void main(String[] args) {
    Condimento farinha = new Condimento("farinha", 2.5);
    Condimento ovo = new Condimento("ovo", 2);

    Condimento[] condimentos = {farinha, ovo};
    Produto bolo = new Produto("bolo", condimentos);
  }
}
