import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex4 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Notas.txt";
        double[] vetNotas = new double[100];
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Notas = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Notas);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextDouble()) {
                double linha = tabuchi.nextDouble();
                vetNotas[cont] = linha;
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }
        // For para mostrar os valores do vetores
        for (int i = 0; i < vetNotas.length; i++) {
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetNotas[i]);
        }
        Scanner tabuchi = new Scanner(System.in);
        int quantAprovados = 0;
        int quantNaoAprovados = 0;
        for (int i  = 0; i < (vetNotas.length - 50); i++) {
            if (vetNotas[i] >= 7 ) {
                quantAprovados+=1;
            } else if (vetNotas[i] <= 4) {
                quantNaoAprovados+=1;
            }
        }
        System.out.println("A quantidade de alunos aprovados é de: " + quantAprovados);
        System.out.println("A quantidade de alunos não aprovados é de: " + quantNaoAprovados);
    }
}