import java.util.Scanner;
public class Ex7{
    public static void main(String[]args){
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m                  Desontos da loja                \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double valor_compra;
        int numero_parcelas, idade_cliente, anos_cliente;

        System.out.println("Digite sua idade: ");
        idade_cliente = input.nextInt();

        System.out.println("Digite a quantos anos você é cliente de nossa loja: ");
        anos_cliente = input.nextInt();

        System.out.println("Digite o valor de sua compra: ");
        valor_compra = input.nextInt();

        System.out.println("Sua compra será à vista? [s/n]: ");
        String a_vista_or_nao = input.nextLine();

        System.out.println("Digite em quantas parcelas deseja fazer a sua compra: ");
        numero_parcelas = input.nextInt();

        System.out.println("O valor do desconto é de " + VerificadorDesconto(numero_parcelas, a_vista_or_nao, valor_compra, idade_cliente, anos_cliente) + "%");
        System.out.printf("O valor de cada parcela sem desconto seria de: R$%.2f" + VerificardorParcela(numero_parcelas, valor_compra) + " cada parcela");
        System.out.printf("O valor final de sua compra com desconto é de: R$%.2f" + VerificadorFinal(valor_compra, VerificadorDesconto(numero_parcelas, a_vista_or_nao, valor_compra, idade_cliente, anos_cliente)));

    }
    public static int VerificadorDesconto (int NumeroParcelas, String aVistaOrNao, double ValorCompra, int IdadeCliente, int AnosCliente) {
        if (NumeroParcelas <= 6) {
            return 5;
        } if (ValorCompra > 5000 || AnosCliente >= 10 || IdadeCliente >= 60) {
            return 5;
        } if (aVistaOrNao.equals("s")) {
            return 10;
        } else  {
            return 0;
        }
    }
    public static double VerificardorParcela (int NumeroParcelas1, double ValorCompra1) {
        return ValorCompra1 / NumeroParcelas1;
    }
    public static double VerificadorFinal (double ValorCompra2, int VerificadorDeDesconto) {
        return ValorCompra2 - (VerificadorDeDesconto/100);
    }
}