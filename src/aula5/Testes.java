package aula5;

public class Testes {
    public static void main(String[] args) {
        Mensagem3 m3 = new Mensagem3("01/01", "Adson", "oi");
        Mensagem3 m4 = new Mensagem3("02/01", "João", "ei");

        System.out.println(m3.getData());
        System.out.println(m3.getAutor());
        System.out.println(m3.getTexto());

        System.out.println(m4.getData());
        System.out.println(m4.getAutor());
        System.out.println(m4.getTexto());
    }
}
