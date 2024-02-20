import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m                Volume da bactéria               \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double volume_inicial, volume_atual, volume;
        int dias = 0;

        System.out.println("Digite o volume inicial da bactéria: ");
        volume_inicial = input.nextDouble();

        System.out.println("Digite o volume atual da bactéria: ");
        volume_atual = input.nextDouble();

        volume = volume_atual;

        do {
            volume_atual /= 2;
            dias += 1;
            System.out.println("Dias: " + dias);

        } while (volume_atual != volume_inicial);

        System.out.println("Passaram-se " + dias + " dias");
    }
}