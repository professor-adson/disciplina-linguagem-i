package aula8;

public class CamaroteSuperior extends Vip {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    @Override
    public double getValor() {
        return super.getValor() + this.getValorAdicional();
    }
}
