import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) { // INÍCIO DA CLASSE

        String caminhoArquivo = "NotasAlunos.txt";
        int numeroAlunos = 25;
        int qntProvas = 4;
        double[][] matrizNotas = new double[numeroAlunos][qntProvas];

        try {
            // Criação do caminho do arquivo
            File Nome = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Nome);

            // Pegando as coisas do arquivo e levando para o vetor
            for (int i = 0; i < matrizNotas.length; i++) {
                System.out.printf("Aluno " + (i + 1));
                for (int j = 0; j < matrizNotas[i].length; j++) {
                    if (tabuchi.hasNextLine()) {
                        String linha = tabuchi.nextLine();
                        matrizNotas[i][j] = Double.parseDouble(linha);
                        System.out.printf("%8.1f", matrizNotas[i][j]);
                    }
                }
                System.out.printf("\n");
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        // FOR PARA CALCULAR A MÉDIA DE CADA ALUNO
        double[] vetMediaAluno = new double[numeroAlunos];
        for (int i = 0; i < numeroAlunos; i++) {
            double somaNotasAlunos = 0;
            for (int j = 0; j < qntProvas; j++) {
                somaNotasAlunos += matrizNotas[i][j];
            }
            vetMediaAluno[i] = somaNotasAlunos / qntProvas;
        }
        System.out.print("\n");

        System.out.println("\n\033[94mMÉDIA DE CADA ALUNO:\033[m");
        // FOR PARA MOSTRAR A MÉDIA DE CADA ALUNO
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.printf("\nAluno " + (i + 1) + " (média): %.1f", vetMediaAluno[i]);
        }

        // FOR PARA CALCULAR A MÉDIA DE CADA PROVA
        double vetMediaProva[] = new double[qntProvas];
        for (int i = 0; i < qntProvas; i++) {
            double somaNotasProva = 0;
            for (int j = 0; j < numeroAlunos; j++) {
                somaNotasProva += matrizNotas[j][i];
            }
            vetMediaProva[i] = somaNotasProva / numeroAlunos;
        }

        // MOSTRANDO A MÉDIA DE CADA PROVA

        System.out.println("\n\n\033[93mMÉDIA DE CADA PROVA:\033[m");
        for (int i = 0; i < qntProvas; i++) {
            System.out.printf("\n\033[92mProva " + (i + 1) + ": %.1f\033[m", vetMediaProva[i]); // MOSTRANDO A MÉDIA DA SALA
        }
    }
}
