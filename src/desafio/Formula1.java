package desafio;

import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Comprimento da pista em m:");
        double comprimentoPista = s.nextDouble();
        comprimentoPista /= 1000;

        System.out.println("Total de voltas:");
        double voltas = s.nextInt();

        System.out.println("Abastecimentos:");
        int abastecimentos = s.nextInt();

        System.out.println("Consumo do carro em km/l:");
        double consumo = s.nextDouble();

        double litrosPorVolta = comprimentoPista / consumo;
        int secao = (int) Math.ceil(voltas / (abastecimentos + 1));

        double litrosPorSecao = litrosPorVolta * secao;

        System.out.println("Comprimento da pista em km: " + comprimentoPista);
        System.out.println("Total de voltas: " + voltas);
        System.out.println("Abastecimentos:: " + abastecimentos);
        System.out.println("Consumo do carro em km/l: " + consumo);
        System.out.println("Seção: " + secao);
        System.out.println("Litros por secao: " + String.format("%.2f", litrosPorSecao));
    }
}
