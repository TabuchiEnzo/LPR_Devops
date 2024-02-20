import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m               Cálculo de salário                \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double salario_funcionario;

        System.out.println("Digite o seu salário R$");
        salario_funcionario = input.nextDouble();

        try {Thread.sleep(2000);} catch (InterruptedException ex) {};

        System.out.printf("Com uma porcentagem de desconto, seu salário atual é de R$%.2f", Verificador(salario_funcionario));
    }
    public static double Verificador(double salario_funcionario) {
        if (salario_funcionario < 2000){
            return (0.15 * salario_funcionario) + salario_funcionario;

        } else if (salario_funcionario >= 2000 && salario_funcionario < 5000) {
            return (0.10 * salario_funcionario) + salario_funcionario;

        } else if (salario_funcionario >= 5000) {
            return (0.05 * salario_funcionario) + salario_funcionario;

        } else {
            return salario_funcionario;
        }
    }
}