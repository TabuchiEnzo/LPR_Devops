public class Ex2 {
    private int capacidade;
    private int topo;
    private Produto[] vetor;

    public Ex2(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.vetor = new Produto[capacidade];
    }

    public boolean push (Produto x) {
        if (topo + 1 == capacidade) {
            return false;
        } else {
            this.topo += 1;
            this.vetor[this.topo] = x;
            return true;
        }
    }
    public Produto pop () {
        int temp = this.topo;
        this.topo--;
        return this.vetor[temp];
    }
    public Produto peek() {
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
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < this.topo; i++) {
            s.append(String.valueOf(this.vetor[i])).append(" ");
        }
        return s.toString();
    }
}
