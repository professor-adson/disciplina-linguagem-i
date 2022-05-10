package aula15;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Linhas:");
    int linhas = s.nextInt();

    System.out.println("Colunas:");
    int colunas = s.nextInt();

    int[][] matriz = new int[linhas][colunas];
    int valor;
    double soma = 0;
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.println("Valor:");
        valor = s.nextInt();
        matriz[i][j] = valor;
        soma += valor; // soma = soma + valor
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }
    System.out.println("Soma: " + soma);
  }
}
