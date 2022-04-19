package aula10;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("F1", "Rua 1", "00000000", 1000, 200);
        System.out.println(f.getNome());
        System.out.println(f.obterSaldo());
    }
}
