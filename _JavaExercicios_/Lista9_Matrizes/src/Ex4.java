public class Ex4 {
    public static boolean Simetrico(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrizSimetrica = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        int[][] matrizNaoSimetrica = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz Simétrica " + Simetrico(matrizSimetrica)); // true
        System.out.println("Matriz não Simétrica " + Simetrico(matrizNaoSimetrica)); // false
    }
}