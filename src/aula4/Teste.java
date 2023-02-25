package aula4;

public class Teste {
  public static void main(String[] args) {
    Animal animal = new Animal("cachorro", 1.5f, 4, "preto", "terrestre", 1);
    animal.verDados();
    System.out.println(animal.toString());
  }
}
