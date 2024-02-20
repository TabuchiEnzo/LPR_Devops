import java.io.*;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        String caminhoArquivo = "textoOriginal.txt";
        File Nomes = new File(caminhoArquivo);

        // Criando as variáveis
        int num = 0;
        int tamOriginal = 0;
        int tamComprimido = 0;

        String[] vetTextoOiginal = new String[4]; // VETOR DAS LETRAS

        try {
            // Criando coisas relacionadas ao arquivos
            Scanner tabuchi = new Scanner(Nomes);
            String caminhoArquivo2 = "textoComprimido.txt";
            FileWriter fileWriter = new FileWriter(caminhoArquivo2);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Divisão dos caracteres repetidos
            tabuchi.useDelimiter(",");
            for (int i = 0; i < vetTextoOiginal.length; i++) {
                if (tabuchi.hasNext()) {
                    vetTextoOiginal[i] = tabuchi.next();
                }
            }

            // Criação das quantidades de caracteres repetidos
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < vetTextoOiginal.length; i++) {
                char letra = vetTextoOiginal[i].charAt(0);

                for (int j = 0; j < vetTextoOiginal[i].length(); j++) {
                    num++;
                    tamOriginal++;
                }
                sb.append(num);
                num = 0;
                sb.append(letra);
                sb.append(" ");
            }

            // For para adicinar o Tamanho Comprimido
            for (int i = 0; i < vetTextoOiginal.length; i++) {
                tamComprimido++;
            }

            double taxaComp = (tamComprimido/tamOriginal) * 100; // CÁLCULO PARA A TAXA DE COMPRESSÃO

            // Pegando e colocando
            System.out.println(sb);
            printWriter.print(sb);
            fileWriter.close();
            System.out.printf("A taxa de compressão foi de: %s ", taxaComp);

        } catch (IOException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }
    }
}