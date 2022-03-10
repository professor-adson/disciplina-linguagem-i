package aula4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = s.nextLine();

        System.out.println("Digite a idade:");
        int idade = s.nextInt();

        System.out.println("Digite a data de matrícula no formato dd/mm/aaaa:");
        String dataMatriculaStr = s.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataMatricula = LocalDate.parse(dataMatriculaStr, formatter);

        Aluno a1 = new Aluno(nome, idade, dataMatricula);
        a1.eMaior();
    }
}
