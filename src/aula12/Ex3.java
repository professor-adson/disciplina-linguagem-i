package aula12;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o número X: ");
    int x = s.nextInt();

    int[] nums = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.println("Digite um número: ");
      nums[i] = s.nextInt();
    }

    int maior = 0, menor = 0, igual = 0;
    for (int i = 0; i < 10; i++) {
      if (nums[i] > x) maior++;
      else if (nums[i] < x) menor++;
      else igual++;
    }

    System.out.println("Maiores " + maior);
    System.out.println("Menores " + menor);
    System.out.println("Iguais " + igual);
  }
}
