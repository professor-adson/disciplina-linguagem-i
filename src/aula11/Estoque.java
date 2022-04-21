package aula11;

public class Estoque {
    int min;
    int max;

    public Estoque(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public double media() {
        return (double) (min + max)/2;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
