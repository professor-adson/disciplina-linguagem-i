package aula12;

public class Ex2 {
  public static void main(String[] args) {
    int[] x = {1, 2, 3};
    int[] y = {4, 5, 6};

    int result = 0;
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < y.length; j++) {
        if (i == j) {
          result += x[i] * y[j];
        }
      }
    }

    System.out.println("Produto escalar " + result);
  }
}
