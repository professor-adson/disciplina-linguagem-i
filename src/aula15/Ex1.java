package aula15;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Linhas:");
    int linhas = s.nextInt();

    System.out.println("Colunas:");
    int colunas = s.nextInt();

    double[][] matriz = new double[linhas][colunas];
    double maior = Double.NEGATIVE_INFINITY;
    double valor;

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.println("Valor:");
        valor = s.nextDouble();
        matriz[i][j] = valor;
        if (valor > maior) {
          maior = valor;
        }
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }
    System.out.println("Maior: " + maior);
  }
}
