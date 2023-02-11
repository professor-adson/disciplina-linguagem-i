package aula2;

import java.util.Locale;

public class Teste {
  public static void main(String[] args) {
//    Aluno a1 = new Aluno();
//    a1.nome = "Adson";
//    a1.genero = "Masculino";
//    a1.idade = 40;
//
//    Aluno a2 = new Aluno();
//    a2.nome = "Maria";
//    a2.genero = "Feminino";
//    a2.idade = 20;
//
//    System.out.println(a1.nome +"\n"+ a2.nome);

    System.out.println("-------------");
    int n = gerarIdade(20, 50);
    Aluno a3 = new Aluno();
    a3.idade = n;
    a3.nome = passarParaMaiuscula("Pedro");
    System.out.println(n);
  }

  public static int gerarIdade(int min, int max) {
    int i = (int)(Math.random() * (max - min)) + min;
    return i;
  }

  public static String passarParaMaiuscula(String nome) {
    return nome.toUpperCase(Locale.ROOT);
  }
}
