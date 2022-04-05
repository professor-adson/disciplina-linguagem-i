package aula8;

public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprime() {
        System.out.println("Ingresso normal");
    }

    @Override
    public void imprimeValor() {
        System.out.println("Ingresso normal");
    }
}
