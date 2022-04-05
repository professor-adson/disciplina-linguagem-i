package aula8;

public class CamaroteInferior extends Vip {
    String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprime() {
        System.out.println("Localização: " + this.localizacao);
    }
}
