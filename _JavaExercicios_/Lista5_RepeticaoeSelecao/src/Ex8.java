import java.util.Scanner;
public class Ex8 {
    public static void main (String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        int soma = 0, media = 0;

        System.out.println("Digite um número de 10 dígitos: ");
        int numeroDig = tabuchi.nextInt();

        for (int i = 0; i < numeroDig; i++) {

            int unidade = numeroDig % 10;

            numeroDig /= 10;

            soma += unidade;
            media = soma / 10;
        }

        System.out.println("A média dos números no número digitado é de: \033[94m" + media + "\033[m");
    }
}