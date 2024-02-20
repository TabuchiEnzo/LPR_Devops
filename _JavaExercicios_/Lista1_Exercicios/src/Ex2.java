import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

        System.out.println("\033[35m---------------------------\033[m");
        System.out.println("\033[32m        Valor de pi        \033[m");
        System.out.println("\033[35m---------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double raio, pi, volume;

        System.out.println("Digite o valor do raio da esfera em cm: ");
        raio = input.nextDouble();

        pi = 3.1416;
        volume = 4/3 * pi * raio * raio * raio;

        System.out.println("O volume da esfera é:" + volume + "cm");
    }
}