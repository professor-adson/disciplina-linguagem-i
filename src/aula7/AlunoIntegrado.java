package aula7;

public class AlunoIntegrado extends Matriculado {
    String nome;
    String telefone;

    public AlunoIntegrado(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;

        this.notas = new double[]{0, 0, 0};
    }

    public void setNota(int index, double nota) {
        this.notas[index] = nota;
    }

    @Override
    public double calcularMedia() {
        double n1 = this.notas[0];
        double n2 = this.notas[1];
        double n3 = this.notas[2];

        return (0.3 * n1 + 0.3 * n2 + 0.4 * n3) / 3;
    }
}
