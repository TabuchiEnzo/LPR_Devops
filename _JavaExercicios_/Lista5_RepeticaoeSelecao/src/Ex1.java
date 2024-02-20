import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[93m---------------------------------------------------\033[m");
        System.out.println("\033[92m              Potência da base expoente            \033[m");
        System.out.println("\033[93m---------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int valor_base = input.nextInt();

        System.out.println("Digite o valor do expoente: ");
        int valor_expoente = input.nextInt();

        int result = 1;

        if (valor_expoente < 0) {
            System.out.println("\033[91mAlgo de errado está errado !\033[m");
        } else
            for (int i = 0; i < valor_expoente; i++)
                result *= valor_base;

        System.out.println("A base " + valor_base + " e o expoente " + valor_expoente + " se resultam em " + result);
    }
}