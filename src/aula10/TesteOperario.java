package aula10;

public class TesteOperario {
    public static void main(String[] args) {
        Operario o = new Operario("O1", "Rua 1", "0000000", 1, 1000, 0.1,  60, 0.1);
        System.out.println(o.getNome());
        System.out.println(o.calcularSalario());
    }
}
