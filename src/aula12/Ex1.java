package aula12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite a quantidade de números: ");
    int n = s.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Digite um número: ");
      nums[i] = s.nextInt();
    }

    System.out.println("Vetor original");
    System.out.println(Arrays.toString(nums));

    int[] inv = new int[n];
    for (int i = n - 1, j = 0; i >= 0; i--, j++) {
      inv[j] = nums[i];
    }

    System.out.println("Vetor invertido");
    System.out.println(Arrays.toString(inv));
  }
}
