import java.util.Random;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        int qntItens = 0;
        Scanner tabuchi = new Scanner(System.in);
        Random ale = new Random();

        // Vetor tamanho 10
        double[] vetPreco = new double[10];

        // Criando 5 produtos aleatórios com o preço entre 10,00 a 50,00 reais
        System.out.println("\033[32m\nInserindo preço nos produtos...\033[m");

        try {Thread.sleep(3000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < (vetPreco.length - 5); i++) {
            vetPreco[i] = ale.nextDouble(10.0, 50.0);
            qntItens++;
        }

        // Mostrando todos os itens do vetor
        System.out.println("\033[92m\nValores dos produtos: \033[m");
        try {Thread.sleep(2000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < vetPreco.length; i++) {
            System.out.printf("\n\033[93mVetor [" + i + "] \033[m \033[94mProduto " + (i + 1) + "\033[m: R$%.2f", vetPreco[i]);
        }

        // Quantidade de itens no vetor
        System.out.println("\033[93m\nQuantidade de itens no vetor é: " + qntItens + "\033[m");

        // Tamanho do vetor
        System.out.println("\033[94mO tamanho do vetor é: " + vetPreco.length + "\033[m");

        // Dois preços digitado pelo usuário que serão guardados nos produtos 6 e 7
        System.out.print("\nDigite um preço que será colocado no item 6, R$");
        vetPreco[5] = tabuchi.nextDouble();

        System.out.print("Digite um preço que será colocado no item 7, R$");
        vetPreco[6] = tabuchi.nextDouble();

        // Mostrando os itens do vetor
        System.out.println("\033[92m\nValores dos produtos: \033[m");
        try {Thread.sleep(2000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < vetPreco.length; i++) {
            System.out.printf("\n\033[93mVetor [" + i + "] \033[m \033[94mProduto " + (i + 1) + "\033[m: R$%.2f", vetPreco[i]);
        }

        // Substituindo o preço do 4° item
        System.out.print("\n\n\033[95mDigite um preço que você deseja substituir no item 4, R$\033[m");
        vetPreco[3] = tabuchi.nextDouble();

        // Removendo o 2° e o 6° item do vetor
        System.out.println("\033[92m\nRemovendo o 2° e o 6° item do vetPreco...\033[m");
        vetPreco[1] = 0.0;
        vetPreco[5] = 0.0;
        qntItens -= 2;

        try {Thread.sleep(2000);} catch (InterruptedException ignored) {}

        // Mostrando todos os itens do vetor
        System.out.println("\n\033[92mValores dos produtos: \033[m");
        try {Thread.sleep(2000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < vetPreco.length; i++) {
            System.out.printf("\n\033[93mVetor [" + i + "] \033[m \033[94mProduto " + (i + 1) + "\033[m: R$%.2f", vetPreco[i]);
        }

        // Substituindo o item com valor '0' pelo da frente

        for (int i = 0; i < vetPreco.length - 1; i++) {
            if (vetPreco[i] == 0.0) {
                vetPreco[i] = vetPreco[i + 1];
                vetPreco[i + 1] = 0.0;
            }
        }

        // Mostrando todos os itens do vetor

        System.out.println("\n\nSubstituindo o item com valor '0' pelo vetor da frente...");
        System.out.println("\n\033[92mValores dos produtos: \033[m");
        try {Thread.sleep(2000);} catch (InterruptedException ignored) {}

        for (int i = 0; i < vetPreco.length; i++) {
            System.out.printf("\n\033[93mVetor [" + i + "] \033[m \033[94mProduto " + (i + 1) + "\033[m: R$%.2f", vetPreco[i]);
        }
    }
}