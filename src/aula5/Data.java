package aula5;

public class Data {
  private int dia = -1;

  public Data(int dia) {
    if (dia > 0 && dia <= 31) {
      this.dia = dia;
    } else {
      System.out.println("dia inválido");
    }
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }
}
