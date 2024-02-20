import java.util.Scanner;
public class Ex5 {
    public static void main (String[]args) {
        System.out.println("\033[93m---------------------------------------------------\033[m");
        System.out.println("\033[92m                  Imposto de renda                 \033[m");
        System.out.println("\033[93m---------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua renda mensal:");
        double renda_mensal = input.nextDouble();

        System.out.printf("Olha... seu imposto pago no ano é de R$ %.2f", Verificador(renda_mensal));
    }
    public static double Verificador(double renda_mensal){
        if(renda_mensal < 1903.98) {
            return 0;

        } else if (renda_mensal >= 1903.98 && renda_mensal < 2826.65) {
            return (7.5/100) * renda_mensal;

        } else if (renda_mensal >= 2826.65 && renda_mensal < 3751.05) {
            return (15.0/100) * renda_mensal;

        } else if (renda_mensal >= 3751.05 && renda_mensal < 4664.68) {
            return (22.5/100) * renda_mensal;

        } else {
            return (27.5/100) * renda_mensal;
        }
    }
}