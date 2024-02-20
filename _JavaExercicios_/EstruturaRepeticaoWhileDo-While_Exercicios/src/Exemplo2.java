import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chocolate = 0, creme = 0, morango = 0;
        int opcao;

        do {
            System.out.println("\033[96m==========\033[92mOPÇÕES DE SORVETE\033[m==========\n" +
                    "           [0] FINALIZAR             \n" +
                    "           [1] CHOCOLATE             \n" +
                    "           [2]   CREME               \n" +
                    "           [3]  MORANGO              \n" +
                    "=====================================\033[m\n");
            System.out.println("Digite sua opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                chocolate++;

            } else if (opcao == 2) {
                creme++;

            } else if (opcao == 3) {
                morango++;

            } else {
                break;
            }
        } while (opcao != 0);
        System.out.printf("\033[92mChocolate: %s \n" +
                "Creme: %s \n" +
                "Morango: %s \033[m\n", chocolate, creme, morango);
    }
}