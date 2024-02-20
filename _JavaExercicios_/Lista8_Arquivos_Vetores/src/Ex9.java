import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex9 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Notas.txt";
        double[] vetInteiros = new double[50];
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Inteiros = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Inteiros);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextDouble()) {
                double linha = tabuchi.nextDouble();
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
        Scanner tabuchi = new Scanner(System.in);

    }
}