import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        double vetPrecos[] = new double [7];

        vetPrecos [0] = 10.60;
        vetPrecos [1] = 9.90;
        vetPrecos [2] = 87.60;

        System.out.printf("Preço 1: R$ %.2f", vetPrecos[0]);
        System.out.printf("\nPreço 2: R$ %.2f", vetPrecos[1]);
        System.out.printf("\nPreço 3: R$ %.2f", vetPrecos[2]);
    }
}