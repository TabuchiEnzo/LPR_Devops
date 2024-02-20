import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m              Salário de um funcionário          \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int salario_pessoa;

        System.out.println("Digite o nome do funcionário que quer saber se terá um aumento:");
        String nome_funcionario = input.nextLine();

        System.out.println("Digite o salário de " + nome_funcionario + ": ");
        salario_pessoa = input.nextInt();

        double novoSalario = calculoSalario(salario_pessoa);

        System.out.printf("O seu salario agora é de R$%.2f", novoSalario);
    }
    public static double calculoSalario(double salario_pessoa) {
        if (salario_pessoa < 1000) {
            return (salario_pessoa * 10 / 100) + salario_pessoa;

        } else {
            return (salario_pessoa * 5 / 100) + salario_pessoa;
        }
    }
}