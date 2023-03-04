package aula6;

import java.util.Arrays;

public class Ex4 {
  public static void main(String[] args) {
    double[][] n = new double[6][6];

    for (int x = 0; x < n.length; x++) {
      for (int y = 0; y < n[x].length; y++) {
        n[x][y] = -1 * ((x + 1) % 2);
      }
    }

    for (int i = 0; i < n.length; i++) {
      System.out.println(Arrays.toString(n[i]));
    }
  }
}
