public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Matrizes:");
        int[][] matrizA = {
                {1, 2},
                {4, 5}};

        // FOR PARA MOSTRAR OS NÚMEROS DA MATRIZ
        System.out.println("\nMatriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("%8d", matrizA[i][j]);
            }
            System.out.print("\n");
        }

        int[][] matrizB = {
                {7, 8},
                {9, 10}};

        // FOR PARA MOSTRAR OS NÚMEROS DA MATRIZ
        System.out.println("\nMatriz B: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("%8d", matrizB[i][j]);
            }
            System.out.print("\n");
        }

        try {
            int[][] resultMatriz = MultiplicacaoMatriz(matrizA, matrizB);
            for (int[] row : resultMatriz) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[][] MultiplicacaoMatriz ( int[][] matrizA, int[][] matrizB){
        int tamA = matrizA.length;
        int tam0A = matrizA[0].length;
        int tamB = matrizB.length;
        int tam0B = matrizB[0].length;

        if (tam0A != tamB) {
            throw new IllegalArgumentException("As matrizes não são compatíveis para a multiplicação");
        }

        int[][] result = new int[tamA][tam0B];

        for (int i = 0; i < tamA; i++) {
            for (int j = 0; j < tam0B; j++) {
                int soma = 0;
                for (int k = 0; k < tam0A; k++) {
                    soma += matrizA[i][k] * matrizB[k][j];
                }
                result[i][j] = soma;
            }
        }

        return result;
    }
}