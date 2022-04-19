package aula10;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e = new Empregado("E1", "Rua 1", "0000000", 1, 1000, 0.1);
        System.out.println(e.getNome());
        System.out.println(e.calcularSalario());
    }
}
