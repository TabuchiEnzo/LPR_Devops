import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m             Bônus dos funcionários              \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int falta_ano, quant_atra_ano, bonus_funiconario;

        System.out.println("Digite o nome do funcionário que desejas calcular seu bônus: ");
        String nome_funcionario = input.nextLine();

        System.out.println("Digite quantas faltas o " + nome_funcionario + " teve no ano: ");
        falta_ano = input.nextInt();

        System.out.println("Digite quantas vezes o " + nome_funcionario + " chegou atrasado no ano: ");
        quant_atra_ano = input.nextInt();

        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        bonus_funiconario = calculoBonus(falta_ano, quant_atra_ano);

        System.out.printf("O bônus do(a) " + nome_funcionario + " é de " + bonus_funiconario + "%");

    }

    public static int calculoBonus(int faltas, int atrasos) {
        if (faltas == 0 && atrasos <= 3) {
            return 5;

        } else {
            return 3;

        }
    }
}