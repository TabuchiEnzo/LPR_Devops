import java.util.Scanner;
public class Ex5 {
    public static void ex5 () {
        Scanner input = new Scanner(System.in);
        int contaDigitos = 0, y = 1;

        System.out.print("Digite um valor inteiro: ");
        int valor = input.nextInt();

        while (valor != 0) {
            contaDigitos = contaDigitos + 1;
            valor = valor / 10;
        }
        int maior = valor;
        for (int i = 0; i <= contaDigitos; i++) {
            if (valor > maior) {
                maior = valor;
            }
        }

        System.out.println("\nTemos " + contaDigitos + " dígitos dentro deste número");
        System.out.println("\nO maior número desses dígitos é " + maior);

    }
}
