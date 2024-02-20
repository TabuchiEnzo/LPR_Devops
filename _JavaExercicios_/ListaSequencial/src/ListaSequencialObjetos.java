public class ListaSequencialObjetos {
    private Pessoa[] vetor;

    public ListaSequencialObjetos(int tamanho) {
        vetor = new Pessoa[tamanho];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s = s + vetor[i] + " ";
        }
        return s;
    }

    public int size() {
        int cont = 0;
        while (cont < vetor.length && vetor[cont] != null) {
            cont++;
        }
        return cont;
    }

    public void inserir(Pessoa p) {
        if (size() < vetor.length) {
            vetor[size()] = p;
        }
    }

    public void inserir(Pessoa p, int posicao) {
        if (size() < vetor.length) {
            if (posicao < size()) {
                for (int i = size(); i > posicao; i--) {
                    vetor[i] = vetor[i - 1];
                }
            } else if (posicao > size()) {
                posicao = size();
            }
            vetor[posicao] = p;
        }
    }

    public Pessoa descobrirItem(int posicao) {
        return vetor[posicao];
    }

    public boolean existeItem(int posicao) {
        return posicao < size();
    }

    public int procurar(Pessoa procurado) {
        for (int i = 0; i < size(); i++) {
            if (vetor[i].equals(procurado)) {
                return i;
            }
        }
        return -1;
    }

    public Pessoa remover(int posicao) {
        if (posicao < size()) {
            Pessoa temp = vetor[posicao];
            for (int i = posicao; i < size() - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[size() - 1] = null;
            return temp;
        } else {
            return null;
        }
    }
}