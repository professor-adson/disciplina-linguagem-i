package aula7;

public class Peixe extends Animal {
    String caracteristica;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        System.out.println(
                this.nome +
                        this.comprimento +
                        this.numeroPatas +
                        this.cor +
                        this.ambiente +
                        this.velocidadeMedia +
                        this.caracteristica
        );
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
