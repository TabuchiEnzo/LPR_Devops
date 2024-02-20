import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        String caminhoArquivo = "numerosInteiros.txt";

        String[] vetNumerosInteirosString = new String[40]; // VETOR DOS NUMEROS INTEIROS EM STRING
        int[] vetNumerosInteiros = new int[40]; // VETOR DOS NUMEROS INTEIROS
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Nomes = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Nomes);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextLine()) {
                String linha = tabuchi.nextLine();

                // USO DO SPLIT
                vetNumerosInteirosString = linha.split(",");
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }
        Scanner tabuchi = new Scanner(System.in);

        // For para mostrar os números
        for (int i  = 0; i < vetNumerosInteirosString.length; i++) {
            System.out.println("Vetor [" + i + "] Número " + vetNumerosInteirosString[i]);
        }

        // For para converter o vetor de numeros intieros em String para um vetor inteiro
        for (int j = 0; j < vetNumerosInteiros.length; j++) {
            vetNumerosInteiros[j] = Integer.parseInt(vetNumerosInteirosString[j]);
        }

        // EXERCÍCIO (A)
        int maior_temp = vetNumerosInteiros[0];
        int menor_temp = vetNumerosInteiros[0];

        // For para calcular o maior número
        for (int i = 1; i < vetNumerosInteiros.length; i++) {
            if (vetNumerosInteiros[i] > maior_temp) {
                maior_temp = vetNumerosInteiros[i];
            }
        }

        // For para calcular o menor número
        for (int i = 0; i < vetNumerosInteiros.length; i++) {
            if (menor_temp > vetNumerosInteiros[i]) {
                menor_temp = vetNumerosInteiros[i];
            }
        }

        // Mostrando a maior e a menor temperatura
        System.out.println("\n\nO maior número do vetor é: \033[92m" + maior_temp + "\033[m");
        System.out.println("O menor número do vetor é: \033[92m" + menor_temp + "\033[m");

        // EXERCÍCIO (B)

        int somaNumVetores = 0;

        // For para encontrar a soma dos números dos vetores
        for (int a = 0; a < vetNumerosInteiros.length; a++) {
            somaNumVetores += vetNumerosInteiros[a];
        }

        // Média dos números do vetor
        int mediaNum = somaNumVetores / vetNumerosInteiros.length;
        System.out.println("A média dos números do vetor é: " + mediaNum);

        // EXERCÍCIO (C)

        // Pergunta para o usuário
        System.out.print("\033[95mDigite um número para ver em qual vetor ele está: \033[m");
        int valor = tabuchi.nextInt();

        boolean achou = false;
        int posicao = -1;

        // For para ver em qual vetor está o valor digitado pelo usuário
        for (int i = 0; i < vetNumerosInteiros.length; i++) {
            if (vetNumerosInteiros[i] == valor) {
                achou = true;
                posicao = i;
            }
        }
        if (achou) {
            System.out.println("O valor \033[93m" + valor + "\033[m está no vetor \033[92m" + posicao + "\033[m");
        } else {
            System.out.printf("O valor \03391m%d\033[m não está em nenhum vetor.", valor);
        }
    }
}