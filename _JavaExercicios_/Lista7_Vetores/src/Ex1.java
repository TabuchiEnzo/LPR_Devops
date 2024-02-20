import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        Random tabaleatorio = new Random();
        int[] vetNum = new int[7];
        int numDigit;
        boolean a = false;

        // For para mostrar os valores dos vetores
        for (int i = 0; i < vetNum.length; i++) {
            vetNum[i] = tabaleatorio.nextInt(1, 100);
            System.out.println("\033[93mVetor [" + i + "] \033[m: " + vetNum[i]);
        }

        // Pergunta para o usuário com exceções
        do {
            try {
                System.out.println("\033[95mDigite um número de vetor para ver qual número temos dentro dele: \033[m");
                numDigit = tabuchi.nextInt();

                int numDentroVetor = vetNum[numDigit];

                System.out.println("O número dentro do vetor \033[92m" + numDigit + "\033[m é: \033[94m" + numDentroVetor + "\033[m");
                a = true;
            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números inteiros -> " + ime);
                tabuchi.next();
            } catch (NegativeArraySizeException nase) {
                System.out.println("Digite apenas números inteiros positivos -> " + nase);
                tabuchi.next();
            }
        } while (!a);
    }
}