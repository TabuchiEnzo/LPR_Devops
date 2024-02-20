import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        System.out.println("\u001b[35m------------------------------------------\u001b[m");
        System.out.println("\u001b[32m     Leitor de dados de um funcionário \u001b[m");
        System.out.println("\u001b[35m------------------------------------------\u001b[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário da empresa: ");
        String nome_funcionario = input.nextLine();

        System.out.println("Digite o número de horas que " + nome_funcionario + " trabalha por semana:");
        int num_horas_trabalhadas = input.nextInt();

        System.out.println("Digite o número de dependentes que " + nome_funcionario + " tem: ");
        int num_dependentes = input.nextInt();

        System.out.println("Digite o valor pago por hora semanal trabalhada por " + nome_funcionario + ":");
        double val_pago_hr_sem = input.nextDouble();

        System.out.println("Digite o valor mensal pago por dependente de " + nome_funcionario + ":");
        double val_men_dependente = input.nextDouble();

        double val_men_funcionario = val_pago_hr_sem * 4.0 + val_men_dependente;

        System.out.println("\u001b[34mO funcionário " + nome_funcionario + " ganha mensalmente R$ " + val_pago_hr_sem + "\u001b[m");
    }
}