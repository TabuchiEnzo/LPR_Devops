import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex3 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Reais.txt";
        double[] vetInteiros = new double[100];
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

        // Pergunta para o usuário
        System.out.print("\033[94m\nDigite um número para ver em qual vetor ele está: \033[m");
        int valor = tabuchi.nextInt();

        boolean achou = false;
        int posicao = -1;

        // For para calcular em qual vetor está o valor digitado pelo usuário
        for (int i = 0; i < vetInteiros.length; i++) {
            if (vetInteiros[i] == valor) {
                achou = true;
                posicao = i;
            }
        }
        if (achou) {
            System.out.println("O valor \033[93m" + valor + "\033[m está no vetor \033[92m" + posicao + "\033[m");
        } else {
            System.out.println("O valor \03391m " + valor + "\033[m não está em nenhum vetor.");
        } // Fim do if/else
    }
} // Fim da classe