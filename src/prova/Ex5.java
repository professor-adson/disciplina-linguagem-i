package prova;

public class Ex5 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        int i1 = 1;
        int i2 = 2;

        System.out.println((i1 % i2) == 1); // V
        System.out.println(!!b1 && b2); // F
        System.out.println(b1 || !b2); // V
        System.out.println((i1 ^ i2) < 4); // V
    }
}
