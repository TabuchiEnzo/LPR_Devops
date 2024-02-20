import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m             Calculo de salário mínimo            \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double salario_usuario, salario_minimo, quant_salar_min_usua;

        System.out.println("Digite o nome da pessoa que quer ver quantos salários mínimos ele ganha por mês: ");
        String nome = input.nextLine();

        try {Thread.sleep(1000);} catch (InterruptedException ex) {};

        System.out.println("Digite quanto que " + nome + " ganha mensalmente: ");
        salario_usuario = input.nextDouble();

        System.out.println("\033[93m--------------------------------------------------\033[m");
        try {Thread.sleep(1000);} catch (InterruptedException ex) {};

        salario_minimo = 1302;
        quant_salar_min_usua = salario_usuario / salario_minimo;

        System.out.println("\033[93m--------------------------------------------------\033[m");

        System.out.println("A quantidade de salários mínimos que " + nome + " possui é de: \033[92m" + quant_salar_min_usua + "\033[m sálarios mínimos");

    }
}