import java.io.*;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        String caminhoArquivo = "Nomes.txt";
        String[] vetNomes = new String[6];
        int cont = 0;

        try {
            // Criação do caminho do arquivo
            File Nomes = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Nomes);

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextLine()) {
                String linha = tabuchi.nextLine();
                vetNomes[cont] = linha;
                cont += 1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        String aux = " ";
        int valor1 = 0, valor2 = 0;

        // For para ordenar os nomes em ordem afabética
        for(int i = vetNomes.length;i > 0 ;i--){
            for(int j = 1;j < vetNomes.length; j++){
                valor1 = vetNomes[j].charAt(0);
                valor2 = vetNomes[j-1].charAt(0);

                if(valor2 > valor1){
                    aux = vetNomes[j-1];
                    vetNomes[j-1] = vetNomes[j];
                    vetNomes[j] = aux;
                }
            }
        }

        // Mostrando os nomes em ordem alfabética
        System.out.println("\033[92mNomes em ordem alfabética: \033[m");
        for(int i = 0; i < vetNomes.length; i++){
            System.out.println(" " + vetNomes[i]);
        }
        // Adicionando os salários com o percentual de desconto em outro arquivo
        String caminhoArquivo2 = "Nomes.txt";

        try {
            FileWriter fileWriter = new FileWriter(caminhoArquivo2);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < vetNomes.length; i++) {
                printWriter.println(vetNomes[i]);
            }

            printWriter.close();
            System.out.println("Texto salvo com sucesso no arquivo (" + caminhoArquivo2 + ")");
        } catch (IOException ioe) {
            System.out.println("Ocorreu um erro ao salvar o arquivo " + ioe.getMessage());
        }
    }
}