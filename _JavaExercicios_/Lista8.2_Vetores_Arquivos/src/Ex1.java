import java.io.*;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        String caminhoArquivo = "NomeProduto.txt";
        String caminhoArquivo2 = "PrecoProduto.txt";

        String[] vetNome = new String[4];
        double[] vetPreco = new double[vetNome.length];

        try {
            // Criação do caminho do arquivo
            File Nome = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Nome);

            // Pegando as coisas do arquivo e levando para o vetor
            for (int i = 0; i < 4; i++) {
                if (tabuchi.hasNextLine()) {
                    String linha = tabuchi.nextLine();
                    vetNome[i] = linha;
                }
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        try {
            // Criação do caminho do arquivo
            File Preco = new File(caminhoArquivo2);
            Scanner tabuchi1 = new Scanner(Preco);

            // Pegando as coisas do arquivo e levando para o vetor
            for (int cont = 0; cont < 4; cont++) {
                if (tabuchi1.hasNextDouble()) {
                    double linha = tabuchi1.nextDouble();
                    vetPreco[cont] = linha;
                }
            }
            tabuchi1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        // For para mostrar os valores do vetores
        for (int i = 0; i < vetNome.length; i++) {
            System.out.printf("\033[93m" + vetNome[i] + "\033[m: R$%.2f \n", vetPreco[i]);
        }

        Scanner tabuchi = new Scanner(System.in);
        boolean a = false;

        do {
            System.out.print("\nDigite um produto que desejas comprar: ");
            String nomeProduto = tabuchi.nextLine();

            // Mostrando o nome do produto digitado
            // Pesquisar no vetor de produtos usando um loop for
            boolean encontrado = false;
            for (int i = 0; i < vetNome.length; i++) {
                if (vetNome[i].equalsIgnoreCase(nomeProduto)) {
                    System.out.printf("Produto encontrado: " + vetNome[i] + " R$%.2f", vetPreco[i]);
                    encontrado = true;
                }
            }
            // Exibir resultado
            if (!encontrado) {
                System.out.println("Produto não encontrado.");
            }

            // Perguntando se o usuário deseja digitar outro produto
            System.out.print("\n\nDesejas digitar mais um produto? [s/n]: ");
            String digOutroProd = tabuchi.nextLine();

            if (digOutroProd.equals("s")) {
                a = false;
            } else if (digOutroProd.equals("n")) {
                a = true;
            }
        } while (!a);
    }
}