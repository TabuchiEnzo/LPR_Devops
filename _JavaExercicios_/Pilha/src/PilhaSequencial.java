import java.util.Arrays;

public class PilhaSequencial {
    private int capacidade;
    private int topo;
    private double vetor[];

    public PilhaSequencial(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.vetor = new double[capacidade];
    }

    public boolean push (double x) {
        if (topo + 1 == capacidade) {
            return false;
        } else {
            this.topo += 1;
            this.vetor[this.topo] = x;
            return true;
        }
    }

    public double pop () {
        int temp = this.topo;
        this.topo--;
        return this.vetor[temp];
    }

    public double peek() {
        return this.vetor[this.topo];
    }

    public boolean isEmpty() {
        if (this.topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.topo; i++) {
            s += String.valueOf(this.vetor[i]) + " ";
        }
        return s;
    }
}
