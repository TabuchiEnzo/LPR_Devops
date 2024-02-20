import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) { // INÍCIO DA CLASSE
        Random aleatorio = new Random();
        Scanner input = new Scanner(System.in);

        // QUANTIDADE DE LINHAS QUE O USUÁRIO DESEJA COLOCAR
        System.out.print("Digite quantas linhas deseja colocar na matriz: ");
        int linhas = input.nextInt();

        // QUANTIDADE DE COLUNAS QUE O USUÁRIO DESEJA COLOCAR
        System.out.print("Digite quantas colunas deseja colocar na matriz: ");
        int colunas = input.nextInt();

        int[][] matrizNum = new int[linhas][colunas]; // CRIANDO A MATRIZ DOS NÚMEROS

        System.out.print("\n\n");

        // FOR PARA COLOCAR NÚMERO INTEIROS ALEATORIOS NA MATRIZ E MOSTRÁ-LOS
        for (int i = 0; i < linhas; i++) {
            System.out.print("Linha " + (i));

            for (int j = 0; j < colunas; j++) {
                matrizNum[i][j] = aleatorio.nextInt(0, 99);
                System.out.printf("%8d", matrizNum[i][j]);
            }
            System.out.print("\n");
        }

        // FOR PARA ENCONTRAR O MAIOR NÚMERO DA MATRIZ E AS COORDENADAS DELE
        int[] numeroMaior = encontrarMaiorNumero(matrizNum);
        System.out.println("O maior número é: " + Arrays.toString(numeroMaior));

        Coordenada coordenadaMaximo = encontrarMaximoCoordenada(matrizNum);
        System.out.println("A coordenada do maior número é: : (linha " + coordenadaMaximo.linha + " coluna " + coordenadaMaximo.coluna + ")");

    }

    public static int[] encontrarMaiorNumero(int[][] matriz) {
        int[] maiorNum = new int[1];

        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > maiorNum[0]) {
                    maiorNum[0] = ints[j];
                }
            }
        }
        return maiorNum;
    }

    public static Coordenada encontrarMaximoCoordenada(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return null;
        }

        int maxValor = matriz[0][0];
        int maxLinha = 0;
        int maxColuna = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] > maxValor) {
                    maxValor = matriz[linha][coluna];
                    maxLinha = linha;
                    maxColuna = coluna;
                }
            }
        }
        return new  Coordenada(maxLinha, maxColuna);
    }
}

class Coordenada {
    int linha;
    int coluna;

    public Coordenada(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
}
