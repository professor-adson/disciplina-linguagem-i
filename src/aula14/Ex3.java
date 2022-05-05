package aula14;

import java.util.Arrays;

public class Ex3 {
  public static void main(String[] args) {
    int[][] n = new int[6][6];

    for (int x = 0; x < n.length; x++) {
      for (int y = 0; y < n[x].length; y++) {
        n[x][y] = x;
      }
    }

    for (int i = 0; i < n.length; i++) {
      System.out.println(Arrays.toString(n[i]));
    }
  }
}
