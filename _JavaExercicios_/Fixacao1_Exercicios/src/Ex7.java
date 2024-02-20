import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m       Impressão de saldo com reajuste de 1%      \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o saldo que deseja calcular: ");

        double saldo = input.nextDouble();
        double saaldo = saldo * 0.01;
        double saldo_fin = saldo+saaldo;

        System.out.println("O saldo final com o reajuste de 1% é de: \033[92m" + saldo_fin + "\033[m");

    }
}