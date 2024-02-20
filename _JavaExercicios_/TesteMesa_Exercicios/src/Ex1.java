import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex1 {
    public void ex1 () {
        Scanner input = new Scanner(System.in);

        double vendas = input.nextDouble();
        double comissao;
        boolean a = false;

        do {
            try {
                System.out.println("Digite o valor total da venda: ");
                vendas = input.nextInt();

                try {Thread.sleep(1000);} catch (InterruptedException ignored) {}
                a = true;

            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números reais -> " + ime);
                input.nextLine();

            }
        } while (!a);

            if (vendas < 999) {
                comissao = vendas * 0.01;
                System.out.printf("Sua comição é de R$" + comissao);

            } else if (vendas >= 1000 && vendas <= 9999) {
                comissao = ((vendas - 999) * 0.05) + 999 * 0.01;
                System.out.printf("Sua comição é de R$" + comissao);

            } else if (vendas >= 10000 && vendas <= 999999) {
                comissao = 999 * 0.01 + (9999 * 0.05) + ((15000 - 9999) * 0.10);
                System.out.printf("Sua comição é de R$" + comissao);

            } else {
                comissao = 9.99 + 450 + 9000;
                System.out.println("Sua comissão é de: " + comissao);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
        }
    }
}
