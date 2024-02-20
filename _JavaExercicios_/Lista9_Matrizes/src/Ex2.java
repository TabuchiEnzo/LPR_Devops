import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int linhas = 3;
        int colunas = 3;

        int[][] matrizNum = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizNum[i][j] = aleatorio.nextInt(10);
            }
        }

        System.out.println("Valores da matriz original:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%8d", matrizNum[i][j]);
            }
            System.out.println();
        }

        int[] somaLinhas = new int[linhas];

        for (int i = 0; i < linhas; i++) {
            int soma = 0;
            for (int j = 0; j < colunas; j++) {
                soma += matrizNum[i][j];
            }
            somaLinhas[i] = soma;
        }

        // Imprime as somas das linhas
        for (int i = 0; i < linhas; i++) {
            System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
        }
    }
}