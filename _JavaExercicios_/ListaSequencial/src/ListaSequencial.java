import java.security.PublicKey;
public class ListaSequencial {
    private double vetor[];
    private int armazenados;

    public ListaSequencial(int tamanho) { // Método Construtor
        vetor = new double[tamanho];
        this.armazenados = 0;
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < armazenados; i++) {
            s = s + String.valueOf(vetor[i]) + " | ";
        }
        return s;
    }
    public int quantidadeItens() {
        return this.armazenados;
    }
    public boolean inserir(double valor) {
        if (armazenados < vetor.length) {
            vetor[armazenados] = valor;
            armazenados++;
            return true;
        } else {
            return false;
        }

    }
    public boolean inserir(double valor, int posicao) {
        if (armazenados < vetor.length) {
            if (posicao < armazenados) {
                for (int i = armazenados; i > posicao; i--) {
                    vetor[i] = vetor[i - 1];
                }
            } else if (posicao > armazenados){
                posicao = armazenados;
            }
            vetor[posicao] = valor;
            armazenados++;
            return true;
        } else {
            return false;
        }
    }
    public double descobrirItem(int posicao) {
        return vetor[posicao];
    }
    public boolean existeItem(int posicao){
        return posicao < vetor.length;
    }

    public Pessoa remover(int posicao) {
        double temp = vetor[posicao];
        for (int i = posicao; i < armazenados - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
    }
//    public void removerItemPosicao(int posicao) {
//        if (posicao > vetor.length || posicao < 0) {
//            System.out.println("NÃO FOI POSSÍVEL ENCONTRAR A POSIÇÃO, VERIFIQUE SE ESTA POSIÇÃO EXISTE!");
//        } else {
//            if () {
//
//            }
//        }
//    }
}