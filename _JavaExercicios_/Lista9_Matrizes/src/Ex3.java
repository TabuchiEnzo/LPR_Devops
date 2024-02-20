import java.util.Random;
public class Ex3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int linhas = 3;
        int colunas = 3;

        int[][] matrizNum = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizNum[i][j] = aleatorio.nextInt(100);
            }
        }

        System.out.println("Valores da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%8d", matrizNum[i][j]);
            }
            System.out.println();
        }

        int maximoValor = valorMax(matrizNum);
        System.out.println("O valor máximo na matriz é: " + maximoValor);
    }
        public static int valorMax(int[][] matriz) {
            int valorMaximo = Integer.MIN_VALUE;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] > valorMaximo) {
                        valorMaximo = matriz[i][j];
                    }
                }
            }

            return valorMaximo;
        }
    }
