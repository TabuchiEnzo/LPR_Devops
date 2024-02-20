import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m         Valor do bônus dos funcionários          \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double salario_funcionario;
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        System.out.println("Digite o nome do funcionário que quer ver a quantidade de bônus: ");
        String nome_funcionario = input.nextLine();

        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        System.out.println("Digite o salário de " + nome_funcionario + ": ");
        salario_funcionario = input.nextDouble();

        if (salario_funcionario <= 5000) {
            System.out.println("O(A) " + nome_funcionario + " terá R$ 600,00 de bônus");

        } else if (salario_funcionario >= 5001) {
            System.out.println("O(A) " + nome_funcionario + " terá R$ 300,00 de bônus");

        } else if (salario_funcionario < 0) {
            System.out.println("Me desculpa, ganhar dinheiro negativo não é muito normal");
        }
    }
}