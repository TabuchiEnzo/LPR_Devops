import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {

        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m              Sucessor e Antecessor               \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        double num_int, num_ante, num_suces;

        System.out.println("Digite um número inteiro que aparecer em tua cabeça: ");
        num_int = input.nextDouble();

        num_ante = num_int - 1;
        num_suces = num_int + 1;

        System.out.println("\033[93m--------------------------------------------------\033[m");

        System.out.println("O número sucessor de " + num_int + " é: \033[92m" + num_suces + "\033[m");

        System.out.println("\033[93m--------------------------------------------------\033[m");

        try {Thread.sleep(2000);} catch (InterruptedException ex) {};

        System.out.println("O número antecessor de " + num_int + " é: \033[92m" + num_ante + "\033[m");

    }
}