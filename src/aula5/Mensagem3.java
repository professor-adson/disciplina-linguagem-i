package aula5;

public class Mensagem3 {
    private String data;
    private String autor;
    private String texto;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Mensagem3(String data, String autor, String texto) {
        this.data = data;
        this.autor = autor;
        this.texto = texto;
    }
}
