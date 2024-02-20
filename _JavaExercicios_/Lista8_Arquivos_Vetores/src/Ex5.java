import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex5 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Valores.txt";
        int[] vetValores = new int[120];
        int[] vetValoresA = new int[vetValores.length];
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Inteiros = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Inteiros);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextDouble()) {
                int linha = tabuchi.nextInt();
                vetValores[cont] = linha;
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}
        // For para mostrar os valores do vetor 'vetValores'
        System.out.println("Valores do 'vetValores' ");
        for (int i = 0; i < vetValores.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetValores[i]);
        }

        // For para passar os valores inteiros so 'vetValores' para o 'vetValoresA'
        for (int i = 0; i < vetValores.length; i++) {
            vetValoresA[i] = vetValores[i];
        }

        // For para mostrar os valores do vetor 'vetValoresA'
        System.out.println("\n\nMostrando os valores do 'vetValoresA'... ");
        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}
        for (int i = 0; i < vetValoresA.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetValoresA[i]);
        }

        Scanner tabuchi = new Scanner(System.in);
        int[] vetValoresP = new int[120];

        // For para colocar os elementos pares do 'vetValoresA' dentro do 'vetValoresP'
        for (int i = 0; i < vetValoresA.length; i++) {
            if (vetValoresA[i] % 2 == 0) {
                vetValoresP[i] = vetValoresA[i];
            }
        }

        // For para mostrar os valores do vetor 'vetValoresP'
        System.out.println("\n\nMostrando os valores do 'vetValoresP'... ");
        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < vetValoresP.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetValoresP[i]);
        }
    }
}