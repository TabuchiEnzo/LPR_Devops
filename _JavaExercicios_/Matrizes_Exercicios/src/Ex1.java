import java.util.Random;
public class Ex1 {
    public static void main(String[] args) { // INÍCIO DA CLASSE
        Random aleatorio = new Random();

        int numeroAlunos = 25; // VARIÁVEL INT DO NÚMERO DE ALUNOS
        int qntProvas = 4; // VARIÁVEL INT DO NÚMERO DE PROVAS

        double[][] matrizNotas = new double[numeroAlunos][qntProvas];

        System.out.println("Aluno:      Nota1   Nota2   Nota3   Nota4   ");
        System.out.println("--------------------------------------------");

        // FOR PARA COLOCAR NÚMERO REAIS ALEATORIOS NAS NOTAS E MOSTRÁ-LOS
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Aluno " + (i + 1));
            for (int j = 0; j < qntProvas; j++) {
                matrizNotas[i][j] = aleatorio.nextDouble(0, 10);
                System.out.printf("%8.1f", matrizNotas[i][j]);
            }
            System.out.print("\n");
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
