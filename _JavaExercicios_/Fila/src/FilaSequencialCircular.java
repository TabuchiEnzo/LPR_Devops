public class FilaSequencialCircular {
    private int capacidade;
    private int inicio;
    private int fim;
    private int quantidadeArmazenada;
    private String[ ] container;
    public FilaSequencialCircular(int capacidade) {
        this.capacidade = capacidade;
        quantidadeArmazenada = 0;
        container = new String[capacidade];
    }

    public boolean isEmpty() {
        if (quantidadeArmazenada == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean offer(String x) {
        if (quantidadeArmazenada == capacidade) {
            return false;
        } else {
            if (isEmpty()) {
                fim = 0;
                inicio = 0;
            }
            quantidadeArmazenada++;
            container[fim] = x;
            fim = (fim + 1) % capacidade;
            return true;
        }
    }

    public String poll() {
        String temp = container[inicio];
        quantidadeArmazenada--;
        inicio = (inicio + 1) % capacidade;
        return temp;
    }

    public String peek() {
        return container[inicio];
    }

    public int size() {
        return quantidadeArmazenada;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s = s + String.valueOf(container[(inicio + i) % capacidade]) + " ";
        }
        return s;
    }
}