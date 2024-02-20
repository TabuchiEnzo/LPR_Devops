public class ListaSequencial {
    private double[] vetor;
    private int armazenados;

    public ListaSequencial (int tamanho) {
        vetor = new double[tamanho];
        this.armazenados = 0;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < armazenados; i++) {
            s += String.valueOf(vetor[i]) + " | ";
        }
        return s;
    }

    public int quantidade () {
        return this.armazenados;
    }

    public boolean inserir (double valor) {
        if (armazenados < vetor.length) {
            vetor[armazenados] = valor;
            armazenados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean inserir (double valor, int posicao) {
        if (armazenados < vetor.length) {
            if (posicao < armazenados) {
                for (int i = armazenados; i > posicao; i--) {
                    vetor[i] = vetor[i - 1];
                }
            } else if (posicao > armazenados) {
                posicao = armazenados;
            }
            vetor[posicao] = valor;
            armazenados++;
            return true;
        } else {
            return false;
        }
    }

    public double descobrir (int posicao) {
        return vetor[posicao];
    }

    public boolean existe (int posicao) {
        return (posicao < armazenados);
    }

    public int procurar (double procurado) {
        for (int i = 0; i < armazenados - 1; i++) {
            if (vetor[i] == procurado) {
                return i;
            }
        }
        return -1;
    }

    public double remover (int posicao) {
        double temp = vetor[posicao];
        for (int i = posicao; i < armazenados; i++) {
            vetor[i] = vetor[i + 1 ];
        }
        armazenados--;
        return temp;
    }
}