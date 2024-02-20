import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m                 Promoção da loja                \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int valor_total_compra, produtos_comp;

        System.out.println("Digite o nome da pessoa que está comprando na loja: ");
        String nome = input.nextLine();

        System.out.println("Digite quantos produtos o(a) " + nome + " está comprando: " );
        produtos_comp = input.nextInt();

        System.out.println("Digite o preço total de todos os produtos: ");
        valor_total_compra = input.nextInt();

        double valorComDesconto = calculoSalario(valor_total_compra, produtos_comp);

        System.out.printf("O valor da sua compra agora é de R$%.2f", valorComDesconto);

    }
    public static double calculoSalario(double valor, double comprados) {
        if (comprados >= 3 && valor >=500) {
            return valor - (valor * 20 / 100);

        } else if (comprados >= 3 && valor < 500) {
            return valor - (valor * 10 / 100);

        } else {
            return valor;

        }
    }
}