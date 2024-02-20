import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int linhas = 3;
        int colunas = 3;

        double[][] matrizNum = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizNum[i][j] = aleatorio.nextDouble(10);
            }
        }

        System.out.println("Valores da matriz original:");
        colocarNumeros(matrizNum, linhas, colunas);

        calcularMedia(matrizNum);

        System.out.println("\nMatriz com médias substituídas:");
        colocarNumeros(matrizNum, linhas, colunas);
    }

    public static void calcularMedia(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            double[] linha = matriz[i];
            double soma = 0;

            for (double valor : linha) {
                soma += valor;
            }

            double media = soma / linha.length;

            for (int j = 0; j < linha.length; j++) {
                matriz[i][j] = media;
            }
        }
    }

    public static void colocarNumeros(double[][] matriz, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%8.2f", matriz[i][j]);
            }
            System.out.println();
        }
    }
}