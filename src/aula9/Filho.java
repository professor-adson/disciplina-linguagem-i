package aula9;

public class Filho extends Pai {
    private int k;

    public Filho(int k) {
        this.k = k;
    }

    public Filho(int ii, double dd, int k) {
        super(ii, dd);
        this.k = k;
    }

    public Filho(int ii, int k) {
        super(ii);
        this.k = k;
    }
}
