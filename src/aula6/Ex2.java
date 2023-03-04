package aula6;

import java.util.Arrays;

public class Ex2 {
  public static void main(String[] args) {
    double[][] n = new double[5][10];

    for (int x = 0; x < n.length; x++) {
      for (int y = 0; y < n[x].length; y++) {
        n[x][y] = Math.pow(y, 2);
      }
    }

    for (int i = 0; i < n.length; i++) {
      System.out.println(Arrays.toString(n[i]));
    }
  }
}
