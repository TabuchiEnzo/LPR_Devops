import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex3 {
    public void ex3 () {
        Scanner input = new Scanner(System.in);

        int quant_desconto = 0, a_quantos_anos = 0, quant_compras = 0;
        double preco_compra = 0;
        boolean a = false;

        do {
            try {
                System.out.println("Digite a quantos anos o cliente é da nossa loja: ");
                a_quantos_anos = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

                System.out.println("Digite quanto foi a compra que o cliente fez: ");
                preco_compra = input.nextDouble();

                try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

                System.out.println("Digite a quantidade de compras que o cliente fez neste mês: ");
                quant_compras = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ignored) {}
                a = true;

                System.out.println("---------------------------------------------------------------------------");

            } catch (InputMismatchException ime) {
                System.out.println("Digite um número real... " + ime);
                input.nextLine();

                try {Thread.sleep(2000);} catch (InterruptedException ignored) {}

            }
        } while (!a); {
            if (a_quantos_anos >= 10) {
                quant_desconto = quant_desconto + 15;

            } if (preco_compra > 1500) {
                quant_desconto = quant_desconto + 17;

            } if (quant_compras > 5 ) {
                quant_desconto = quant_desconto + 13;
            }
            System.out.println("A quantidade de desconto é igual a \033[92m" + quant_desconto + "%\033[m");
            try { Thread.sleep (1000); } catch (InterruptedException ignored) {}
            double valor_tot_compra = (preco_compra * quant_desconto/100) + preco_compra;
            System.out.printf("O valor total da compra é de R$%.2f", valor_tot_compra);
            try { Thread.sleep (1000); } catch (InterruptedException ignored) {}
        }
    }
}
