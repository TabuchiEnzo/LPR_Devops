import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        System.out.println("\033[94m--------------------\033[m");
        System.out.println("\033[92m      50 alunos     \033[m");
        System.out.println("\033[94m--------------------\033[m");
        String[] vetAlunos = new String [5];
        for (int i = 0; i < vetAlunos.length; i++) {
            try { Thread.sleep (1000); } catch (InterruptedException ignored) {}
            System.out.println("Digite o nome do \033[92m" + (i + 1) + "°\033[m aluno: ");
            vetAlunos[i] = tabuchi.next();
        }

        try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

        System.out.println("\033[93m--------------------------------------------\033[m");
        System.out.println("\033[92m Nomes digitados, invertidamente invertidos \033[m");
        System.out.println("\033[93m--------------------------------------------\033[m");

        try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

        for (int i = (vetAlunos.length - 1); i > -1; i--) {
            try { Thread.sleep (1000); } catch (InterruptedException ignored) {}
            System.out.println("\nAluno " + (i + 1) + ": \033[92m" + vetAlunos[i] + "\033[m");
        }
    }
}