import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Média dos números entra dois números");
        System.out.println("------------------------------------");
        Scanner tabuchi = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numMenor = tabuchi.nextInt();

        System.out.print("Digite outro número maior que o anterior: ");
        int numMaior = tabuchi.nextInt();

    }
}