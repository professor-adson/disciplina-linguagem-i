package aula13;

import java.util.Arrays;

public class Agenda {
  Pessoa[] pessoas;
  int incluidas;

  public Agenda() {
    this.pessoas = new Pessoa[10];
    incluidas = 0;
  }

  void armazenaPessoa(String nome, int idade, float altura) {
    if (incluidas < 10) {
      this.pessoas[incluidas] = new Pessoa(nome, idade, altura);
      incluidas++;
    }
  }

  void removePessoa(String nome) {
// FAZER
  }

  int buscaPessoa(String nome) {
    int index = -1;
    for (int i = 0; i < this.pessoas.length; i++) {
      if (this.pessoas[i] != null && this.pessoas[i].nome == nome) {
        index = i;
      }
    }
    return index;
  }

  void imprimeAgenda() {
    System.out.println(Arrays.toString(this.pessoas));
  }

  void imprimePessoa(int index) {
    if (this.pessoas[index] != null) {
      System.out.println(this.pessoas[index].toString());
    }
  }
}
