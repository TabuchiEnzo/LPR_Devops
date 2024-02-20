import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\033[94m-----------------------------------------------------------------\033[m");
        System.out.println("\033[93m                     Conversor de dólar                          \033[m");
        System.out.println("\033[94m-----------------------------------------------------------------\033[m");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma quantia em reais que desejas converter para o dólar: ");
        double quant_reais = input.nextDouble();

        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        double quant_dolar = conversor(quant_reais);

        System.out.println("\033[92mCom R$" + quant_reais + " em dolar vale US$" + quant_dolar + "\033[m");

    }
    public static double conversor(double valor) {
        return valor * 5.19;

    }
}