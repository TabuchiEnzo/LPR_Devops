import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\033[94m----------------------------------------------------------------\033[m");
        System.out.println("\033[93m                  Conversor de horas para minutos               \033[m");
        System.out.println("\033[94m----------------------------------------------------------------\033[m");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};
        Scanner input = new Scanner(System.in);
        int valorhora, valormin, resultado;

        System.out.println("Digite a hora:");
        valorhora = input.nextInt();

        System.out.println("Digite os minutos:");
        valormin = input.nextInt();

        resultado = minutos(valorhora,valormin);

        System.out.printf("Valores: %d h e %d minutos\nResultado: %d min",valorhora,valormin, resultado);

    }
    public static int minutos(int horas,int min) {
        return min+(horas*60);

    }
}