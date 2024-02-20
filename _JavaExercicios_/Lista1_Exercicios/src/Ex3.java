import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {

        System.out.println("\033[35m-------------------------------------\033[m");
        System.out.println("\033[32m     Conversor de seg, min e hr      \033[m");
        System.out.println("\033[35m-------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int nsegundos, segundos, minutos, horas;

        System.out.println("Digite os segundo que quer converter: ");
        nsegundos = input.nextInt();

        segundos = ((nsegundos)/60)%60;
        minutos = (nsegundos%3600)/60;
        horas = nsegundos/3600;

        System.out.println("O horário é de: " + horas + "h" + minutos + "min" + segundos + "sec");
    }
}