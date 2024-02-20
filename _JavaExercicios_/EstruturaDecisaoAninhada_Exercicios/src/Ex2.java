import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m               Percentual de dívida               \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu percentual: ");
        double valor_recebido = input.nextDouble();

        System.out.println("Sua dívida é " + Verificador(valor_recebido));
    }
    public static String Verificador(double valor_recebido) {
        if (valor_recebido < 30){
            return "Péssima 😔";

        } else if (valor_recebido >= 30 && valor_recebido < 70) {
            return "Regular 👌";

        } else if (valor_recebido >= 70) {
            return "Muito Boa 😎";

        } else {
            return "Algo de errado está errado";
        }
    }
}