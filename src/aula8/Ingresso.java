package aula8;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println(this.valor);
    }
}
