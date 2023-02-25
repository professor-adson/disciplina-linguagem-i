package aula4;

public class Animal {
  String nome;
  float comprimento;
  int numeroDePatas;
  String cor;
  String ambiente;
  float velocidadeMedia;

  public Animal(String nome,
                float comprimento,
                int numeroDePatas,
                String cor,
                String ambiente,
                float velocidadeMedia) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.numeroDePatas = numeroDePatas;
    this.cor = cor;
    this.ambiente = ambiente;
    this.velocidadeMedia = velocidadeMedia;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getComprimento() {
    return comprimento;
  }

  public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
  }

  public int getNumeroDePatas() {
    return numeroDePatas;
  }

  public void setNumeroDePatas(int numeroDePatas) {
    this.numeroDePatas = numeroDePatas;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public float getVelocidadeMedia() {
    return velocidadeMedia;
  }

  public void setVelocidadeMedia(float velocidadeMedia) {
    this.velocidadeMedia = velocidadeMedia;
  }

  public void verDados() {
    System.out.println("Animal"
        + "\n nome:" + this.nome
        + "\n comprimento: " + this.comprimento
        + "\n patas: " + this.numeroDePatas
        + "\n cor: " + this.cor
        + "\n ambiente: " + this.ambiente
        + "\n velocidade: " + this.velocidadeMedia);
  }

  @Override
  public String toString() {
    return "Animal{" +
        "nome='" + nome + '\'' +
        ", comprimento=" + comprimento +
        ", numeroDePatas=" + numeroDePatas +
        ", cor='" + cor + '\'' +
        ", ambiente='" + ambiente + '\'' +
        ", velocidadeMedia=" + velocidadeMedia +
        '}';
  }
}
