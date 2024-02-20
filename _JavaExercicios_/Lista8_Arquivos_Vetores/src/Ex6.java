import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex6 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Deputados.txt";
        int[] vetDeputados = new int[80];
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Inteiros = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Inteiros);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextInt()) {
                int linha = tabuchi.nextInt();
                vetDeputados[cont] = linha;
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        // For para mostrar os valores do vetor
        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < vetDeputados.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetDeputados[i]);
        }

        Scanner tabuchi = new Scanner(System.in);
        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}
        System.out.print("\n\033[94mDigite o número do deputado na qual desejas votar: \033[m") ;
        int numDigitadoDeputado = tabuchi.nextInt();

        boolean achou = false;
        // For para ver se o valor digitado está no vetor
        for (int i = 0; i < vetDeputados.length; i++) {
            if (vetDeputados[i] == numDigitadoDeputado) {
                achou = true;
            }
        }

        // If/else para ver se a votação foi aceita ou não
        if (achou == true) {
            System.out.println("\n\033[92mVotação feita com sucesso!! \033[m😎");
        } else {
            System.out.println("\n\033[91mNão temos este deputado em nossa lista \033[m😔");
        }
    }
}