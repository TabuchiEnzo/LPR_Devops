import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex7 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Erros.txt";
        int[] vetPaginas = new int[170];
        int cont = 0;

        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}

        try {
            // Criação do caminho do arquivo
            File Inteiros = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Inteiros);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextInt()) {
                int linha = tabuchi.nextInt();
                vetPaginas[cont] = linha;
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        // For para mostrar os valores do vetores
        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}
        for (int i = 0; i < vetPaginas.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetPaginas[i]);
        }

        Scanner tabuchi = new Scanner(System.in);

        // Criando vetores com mais erros e com 0 erros
        int maxErro = vetPaginas[0];
        int zero = vetPaginas[0];

        int pag=0;

        // For que encontra a página com mais erros
        for (int i = 0; i < vetPaginas.length; i++) {
            if (vetPaginas[i] > maxErro) {
                maxErro = vetPaginas[i];
            }
        }

        // For para achar as páginas com mais erros
        for (int i=0; i< vetPaginas.length;i++){
            if (vetPaginas[i] == maxErro) {
                pag=i+1;
            }
        }
        System.out.println("\n\nA página com mais erros é a página " + pag + " em que seu vetor se localiza na posição [" + (pag + 1) + "]");

        // For que encontra o segundo menor número
        for (int i = 0; i < vetPaginas.length; i++) {
            if (vetPaginas[i] > 10) {
                maxErro = vetPaginas[i];
            }
        }

        System.out.println("\nAs páginas que contém mais de 10 erros são: ");
        // For para achar a página com mais erros
        for (int i = 0; i < vetPaginas.length; i++){
            if (vetPaginas[i] == maxErro) {
                zero = i+1;
                System.out.print("\033[92m " + zero + "\033[m");
            }
        }

        // For que encontra a página com 0 erros
        for (int i = 0; i < vetPaginas.length; i++) {
            if (vetPaginas[i] == 0) {
                maxErro = vetPaginas[i];
            }
        }

        System.out.println("\n\nAs páginas que contém 0 erros são: ");
        // For para achar a página com mais erros
        for (int i = 0; i < vetPaginas.length; i++){
            if (vetPaginas[i] == maxErro) {
                zero = i + 1;
                System.out.print("\033[92m" + zero + "\033[m ");
            }
        }
    }
}