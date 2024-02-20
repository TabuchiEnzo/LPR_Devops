import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m   Números que cabem dentro de um pela divisão   \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int num1, num2, numero = 0, contador = 0;

        System.out.println("Digite um número: ");
        num1 = input.nextInt();

        System.out.println("Digite outro número maior que o anterior: ");
        num2 = input.nextInt();

        do {
            numero += num1;
            if (numero <= num2) {
                contador++;

            } else if (numero > num2){
                break;
            }
        } while (contador != num2);
        System.out.println("O número " + num1 + " cabe " + contador + " vezes no número " + num2);
    }
}