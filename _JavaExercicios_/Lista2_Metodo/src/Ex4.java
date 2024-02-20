import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\033[94m-----------------------------------------------------------------\033[m");
        System.out.println("\033[93m                  Dimensões de uma caixa                         \033[m");
        System.out.println("\033[94m-----------------------------------------------------------------\033[m");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};
        Scanner input = new Scanner(System.in);
        double largura, altura, profundidade, resultado;

        System.out.println("Digite a largura:");
        largura= input.nextDouble();

        System.out.println("Digite a altura:");
        altura = input.nextDouble();

        System.out.println("Digite a profundidade:");
        profundidade = input.nextDouble();

        resultado = volume(altura,largura,profundidade);

        System.out.printf("O volume é: %.2f cm", resultado);

    }
    public static double volume(double altura,double largura, double profundidade) {
        return altura*largura*profundidade;

    }
}