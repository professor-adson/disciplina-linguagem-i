package aula3;

class Mensagem {
  String data;
  String autor;
  String texto;

  static void configurar(){
    System.out.println("Configuração realizada");
  }

  public void transfereValor(String data, String autor, String texto) {
    this.data = data;
    this.autor = autor;
    this.texto = texto;
  }

  public void enviar(){
    System.out.println("Olá "+this.autor+", sua mensagem com o texto "+this.texto+" foi enviada em "+this.data);
  }
}