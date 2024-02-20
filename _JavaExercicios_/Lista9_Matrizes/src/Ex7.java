public class Ex7 {
    public static void main(String[] args) {
        int[][] MatrizA = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] MatrizB = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 1}
        };

        System.out.println("Matrizes: ");
        System.out.println("Matriz A: " + MatrizEntidadade(MatrizA));
        // FOR PARA MOSTRAR OS NÚMEROS DA MATRIZ
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                System.out.printf("%8d", MatrizA[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Matriz B " + MatrizEntidadade(MatrizB));
        // FOR PARA MOSTRAR OS NÚMEROS DA MATRIZ
        for (int i = 0; i < MatrizB.length; i++) {
            for (int j = 0; j < MatrizB[i].length; j++) {
                System.out.printf("%8d", MatrizB[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static boolean MatrizEntidadade(int[][] matriz) {

        // Verificar elementos da diagonal principal e fora dela
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}