import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("Divisão de números pela subtração");
        System.out.println("---------------------------------");
        Scanner tabuchi = new Scanner(System.in);

        System.out.print("Digite um número para ser o numerador: ");
        int numDig1 = tabuchi.nextInt();

        System.out.print("Digite outro número para ser o denominador: ");
        int numDig2 = tabuchi.nextInt();

        int resultado = numDig1 - numDig2;
        int i = 0;
        while (resultado > 0) {
            resultado -= numDig2;
            i++;
        }

        System.out.println("A divisão com subtração de " + numDig1 + "/" + numDig2 + " é de: " + i);
    }
}