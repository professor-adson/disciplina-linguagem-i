package aula4;

import java.time.LocalDate;

public class Aluno {
    String nome;
    int idade;
    LocalDate dataMatricula;

    public Aluno(String nome, int idade, LocalDate dataMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.dataMatricula = dataMatricula;
    }

    public void eMaior() {
        String situacao = this.idade >= 18 ? "maior" : "menor";
        System.out.println(situacao);
    }
}
