package aula8;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double getValor() {
        return super.getValor() + this.valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println(this.getValor() + this.getValorAdicional());
    }
}
