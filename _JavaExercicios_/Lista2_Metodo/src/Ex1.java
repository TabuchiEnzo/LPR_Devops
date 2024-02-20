import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[94m-----------------------------------------------------------------\033[m");
        System.out.println("\033[93m             Preço de uma compra com uma porcentagem             \033[m");
        System.out.println("\033[94m-----------------------------------------------------------------\033[m");
        double valor_desc, valor_produto, valor_prod_tot;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o preço do produto? ");
        valor_produto = input.nextDouble();

        System.out.println("Qual o percentual de desconto? ");
        valor_desc = input.nextDouble();

        valor_prod_tot = inclui_desconto(valor_produto, valor_desc);

        System.out.println("O preço do produto é: " + valor_produto);
        System.out.println("O percentual de desconto é: " + valor_desc);

        System.out.println("\033[92mCom R$ " + valor_produto + " do valor da compra e " + valor_desc + "% de desconto, temos uma valor total de R$ " + valor_prod_tot + "\033[m");

    }
    public static double inclui_desconto(double valor_p, double desconto){
        return valor_p - ((desconto / 100) * valor_p);

    }
}