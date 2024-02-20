public class Ex6 {
    public static void main(String[] args) {
        int[][] diagonalMatriz = {
                {1, 0, 0},
                {0, 5, 0},
                {0, 0, 3}
        };

        int[][] diagonalMatrizNao = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("É matriz diagonal?");
        System.out.println("\nMatriz 1 --> " + MatrizDiagonal(diagonalMatriz));
        // FOR PARA MOSTRAR OS NÚMEROS DA MATRIZ
        for (int i = 0; i < diagonalMatriz.length; i++) {
            for (int j = 0; j < diagonalMatriz[i].length; j++) {
                System.out.printf("%8d", diagonalMatriz[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("\nMatriz 2 --> " + MatrizDiagonal(diagonalMatrizNao));
        // FOR PARA MOSTRAR OS NÚMEROS DA MATRIZ
        for (int i = 0; i < diagonalMatrizNao.length; i++) {
            for (int j = 0; j < diagonalMatrizNao[i].length; j++) {
                System.out.printf("%8d", diagonalMatrizNao[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static boolean MatrizDiagonal(int[][] matrix) {
        int matrizTam = matrix.length;
        int matrizTam0 = matrix[0].length;

        // Verificar se a matriz não é quadrada
        if (matrizTam != matrizTam0) {
            return false;
        }

        // Verificar elementos fora da diagonal principal
        for (int i = 0; i < matrizTam; i++) {
            for (int j = 0; j < matrizTam0; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}