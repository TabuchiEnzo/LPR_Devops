import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("--------------------");
        System.out.println("Calculando descontos");
        System.out.println("--------------------");
        Scanner input = new Scanner(System.in);
        double preco, desconto, resultado;

        System.out.println("Digite o preço do produto: ");
        preco = input.nextInt();

        System.out.println("Digite o desconto: ");
        desconto = input.nextInt();

        resultado = (preco -((desconto / 100) * preco));
        double descval = (desconto / 100) + preco;

        System.out.printf("Seu desconto: R$%.2f " + descval + " que descontado do preço original é: R$%.2f" + resultado);
    }
}