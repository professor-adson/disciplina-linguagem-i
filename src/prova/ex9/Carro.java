package prova.ex9;

public class Carro extends Automovel {
    String modelo;

    public Carro(String marca, String modelo) {
        super(marca); // CHAMA O CONSTRUTOR DA SUPERCLASSE
        this.modelo = modelo;
    }
}