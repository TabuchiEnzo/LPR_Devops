import java.util.InputMismatchException;
import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        int vetLidos[] = new int [10];
        int opcao;
        boolean exemplos = false;

        do {
            System.out.println("Digite uma opção: \n" +
                               "[1] For (meu)\n" +
                               "[2] For (professor)\n");
            opcao = tabuchi.nextInt();

            switch (opcao) {
                case 1 -> {
                    boolean a = false;

                    do {
                        try {
                            for (int cont = 0; cont < 10; cont++) {
                                System.out.println("\033[94mDigite o valor\033[m \033[93m" + cont + "\033[m: ");
                                vetLidos[cont] = tabuchi.nextInt();
                            }
                            a = true;
                        } catch (InputMismatchException ime) {
                            System.out.println("Digite apenas números inteiros -> " + ime);
                            tabuchi.nextLine();
                        }
                    } while (!a);
                    try {Thread.sleep(2000);} catch (InterruptedException ex) {}

                    for (int cont = 0; cont < 10; cont++) {
                        System.out.println("\033[94mValor\033m " + cont + "\033[m: \033[92m" + vetLidos[cont] + "\033[m");
                    }
                }
                case 2 -> {
                    System.out.println("Digite 10 números inteiros: ");
                    for (int i = 0; i < vetLidos.length; i ++) {
                        vetLidos[i] = tabuchi.nextInt();
                    }
                    for (int i = 0;i < vetLidos.length; i++) {
                        System.out.print(vetLidos[i] + "");
                    }
                }
            }
        } while (opcao != 0);
    }
}