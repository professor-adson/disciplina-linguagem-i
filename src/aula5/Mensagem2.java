package aula5;

public class Mensagem2 {
    String data;
    String autor;
    String texto;

    static void configurar() {
        System.out.println("Configuração realizada");
    }

    public Mensagem2() {
    }

    public Mensagem2(String data, String autor, String texto) {
        this.data = data;
        this.autor = autor;
        this.texto = texto;
    }

    public void enviar() {
        System.out.println("Olá " + this.autor + ", sua mensagem com o texto " + this.texto + " foi enviada em " + this.data);
    }
}

