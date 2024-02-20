import java.util.Arrays;

public class Ex1 {

    private String[] elementos;
    private int tamanho;

    public Ex1(int tamanho) {
        this.elementos = new String[tamanho];
        this.tamanho = 0;
    }
    public void inserir(String elemento) {
        verificarCapacidade();
        this.elementos[tamanho] = elemento;
        tamanho++;
    }
    public String retirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        tamanho--;
        String elementoRemovido = this.elementos[tamanho];
        this.elementos[tamanho] = null;
        return elementoRemovido;
    }
    public String retornarTopo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return this.elementos[tamanho - 1];
    }
    public boolean estaVazia() {
        return tamanho == 0;
    }
    private void verificarCapacidade() {
        if (tamanho == elementos.length) {
            elementos = Arrays.copyOf(elementos, tamanho * 2);
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < this.tamanho; i++) {
            s += String.valueOf(this.elementos[i]) + " ";
        }
        return s;
    }
}