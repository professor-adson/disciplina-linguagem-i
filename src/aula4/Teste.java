package aula4;

public class Teste {
    public static void main(String[] args) {
        Mensagem2 m2 = new Mensagem2();
        Mensagem2 m3 = new Mensagem2("01/01", "adson", "");

        System.out.println(m2.autor);
        System.out.println(m3.autor);
    }
}
