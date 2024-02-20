import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m             Números divisíveis por 7            \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver os que são divisíveis por 7: ");
        int num = input.nextInt();

        for (int div = 1; num >= div; div ++) {
            if (div % 14 == 0) {
                System.out.println(div);
            }
        }
    }
}