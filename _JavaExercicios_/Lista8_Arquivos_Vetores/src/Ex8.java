import java.io.*;
import java.util.Scanner;
public class Ex8 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Retirados.txt";
        int[] vetInteiros = new int[300];
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Inteiros = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Inteiros);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextInt()) {
                int linha = tabuchi.nextInt();
                vetInteiros[cont] = linha;
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        // For para mostrar os valores do vetores
        for (int i = 0; i < vetInteiros.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetInteiros[i]);
        }

        // Pegando e colocando
        try {
            FileWriter fileWriter = new FileWriter(caminhoArquivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.close();
            System.out.println("Texto salvo com sucesso no arquivo");
        } catch (IOException ioe) {
            System.out.println("Ocorreu um erro ao salvar o arquivo " + ioe.getMessage());
        }
        Scanner tabuchi = new Scanner(System.in);

    }
}