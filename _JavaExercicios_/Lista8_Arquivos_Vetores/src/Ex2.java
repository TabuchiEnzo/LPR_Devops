import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex2 { // Início da classe
    public static void main(String[] args) {
        String caminhoArquivo = "Inteiros.txt";
        int[] vetInteiros = new int[50];
        int cont = 0;

        try {

            // Criação do caminho do arquivo e do vetor
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

        Scanner tabuchi = new Scanner(System.in);

        // Perguntar para o usuário digitar
        boolean a = false;
        do {
            try {
                System.out.println("Número 1: Ordem dos números direta");
                System.out.println("Número 2: Ordem dos números inversa");
                System.out.print("Digite um código [1/2]: ");
                int codDig = tabuchi.nextInt();
                if (codDig == 1) {
                    for (int elemento : vetInteiros) {
                        System.out.print(elemento + " ");
                    }
                    System.out.println();
                } else if (codDig == 2) {
                    for (int i = vetInteiros.length - 1; i >= 0; i--) {
                        System.out.print(vetInteiros[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Código indefinido !! 😐");
                }
                a = true;
            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas os números 1 e 2 --> " + ime);
                tabuchi.nextLine();
            } catch (NegativeArraySizeException nase) {
                System.out.println("Digite apenas os números 1 e 2 --> " + nase);
                tabuchi.nextLine();
            } // Fim do Try-Catch
        } while (!a); // Fim Do-While
    }
} // Fim da classe