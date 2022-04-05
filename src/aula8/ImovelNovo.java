package aula8;

public class ImovelNovo extends Imovel {
    private double valorAdicional;

    public ImovelNovo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + this.valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
