package aula10;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador a = new Administrador("A1", "Rua 1", "0000000", 1, 1000, 0.1, 10);
        Empregado e = new Empregado("E1", "Rua 1", "0000000", 1, 1000, 0.1);

        System.out.println(e.getNome());
        System.out.println(e.calcularSalario());

        System.out.println(a.getNome());
        System.out.println(a.calcularSalario());
    }
}
