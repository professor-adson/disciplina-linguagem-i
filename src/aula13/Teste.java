package aula13;

public class Teste {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    agenda.armazenaPessoa("P1", 18, 1.8f);
    agenda.armazenaPessoa("P2", 19, 1.75f);
    agenda.armazenaPessoa("P3", 20, 1.7f);

    agenda.imprimeAgenda();

    int i = agenda.buscaPessoa("P2");
    agenda.imprimePessoa(i);
  }
}
