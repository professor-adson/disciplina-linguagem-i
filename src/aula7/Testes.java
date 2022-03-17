package aula7;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        AlunoIntegrado a1 = new AlunoIntegrado("João", "11 1111 1111");

        Scanner s = new Scanner(System.in);

        try {
            boolean continua = true;
            while (continua) {
                System.out.println("Digite o índice da nota:");
                int index = s.nextInt();

                if (index < 0 || index >= a1.getNotas().length) {
                    throw new Exception("Índice inválido");
                }

                System.out.println("Digite a nota:");
                double nota = s.nextDouble();

                if (nota < 0) {
                    throw new Exception("Nota negativa");
                }

                a1.setNota(index, nota);

                System.out.println("nota " + index + "= " + a1.getNotas()[index]);

                System.out.println("Continua?");
                continua = s.nextBoolean();
            }
            System.out.println("média " + a1.calcularMedia());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
