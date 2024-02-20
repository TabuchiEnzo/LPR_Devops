import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        Random tabaleatorio = new Random();
        int[] vetNum = new int[50];
        int valor, i;
        boolean a = false;

        // For para mostrar os valores do vetores
        for (i = 0; i < vetNum.length; i++) {
            vetNum[i] = tabaleatorio.nextInt(1, 100);
            System.out.println("\033[93mVetor [" + i + "] \033[m: R$" + vetNum[i]);
        }

        // Pergunta para o usuário
        System.out.print("\033[95mDigite um número para ver em qual vetor ele está: \033[m");
        valor = tabuchi.nextInt();

        boolean achou = false;
        int posicao = -1;

        // For para ver em qual vetor está o valor digitado pelo usuário
        for (i = 0; i < vetNum.length; i++) {
            if (vetNum[i] == valor) {
                achou = true;
                posicao = i;
            }
        }
        if (achou) {
            System.out.println("O valor \033[93m" + valor + "\033[m está no vetor \033[92m" + posicao + "\033[m");
        } else {
            System.out.printf("O valor \03391m%d\033[m não está em nenhum vetor.", valor);
        }
    }
}