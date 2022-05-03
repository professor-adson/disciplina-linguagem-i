package aula14;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[][] n = new int[3][10];

        for (int x = 0; x < n.length; x++) {
            for (int y = 0; y < n[x].length; y++) {
                n[x][y] = y;
            }
        }

        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n[i].length; j++) {
//                System.out.print(n[i][j]);
//            }
//            System.out.println("");
            System.out.println(Arrays.toString(n[i]));
        }
    }
}
