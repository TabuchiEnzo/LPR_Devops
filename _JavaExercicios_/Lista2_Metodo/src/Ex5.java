import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorCompra, parcela, resultado;

        System.out.println("Digite o valor da compra:");
        valorCompra= input.nextDouble();

        System.out.println("Digite a quantidade de parcelas:");
        parcela= input.nextInt();

        resultado = CalculaParc(valorCompra, parcela);

        System.out.printf("O Preço de cada parcela será: R$ %.2f ", resultado);

    }
    public static double CalculaParc(double parcela,double valorCompra) {
        return parcela* 1.05 / valorCompra;

    }
}