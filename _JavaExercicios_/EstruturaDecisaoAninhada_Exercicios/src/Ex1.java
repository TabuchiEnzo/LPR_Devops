import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m                 Tamanho de ovos                 \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do ovo em mm: ");
        double tamanho_ovo = input.nextDouble();

        System.out.println("O seu ovo é lindo e " + Verificador(tamanho_ovo));
    }
    public static String Verificador(double tamanho_ovo) {

        if (tamanho_ovo < 30) {
            return "Pequeno 😔";

        } else if (tamanho_ovo >= 30 && tamanho_ovo <= 40) {
            return "Médio 👌";

        } else if (tamanho_ovo > 40) {
            return "Bem Grandão !! 😎🐣";

        } else {
            return "Algo está errado ";
        }
    }
}