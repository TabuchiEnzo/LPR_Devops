import java.io.*;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        String caminhoArquivo = "alunos.csv.txt";
        File arquivo = new File(caminhoArquivo);
        String[] vetAluno = new String[3];
        String elemento[];
        double media = 0;

        try {
            // Criação do caminho do arquivo
            Scanner tabuchi = new Scanner(arquivo);
            FileWriter fileWriter = new FileWriter("mediaAlunos.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < vetAluno.length; i++) {
                if (tabuchi.hasNextLine()) {
                    vetAluno[i] = tabuchi.nextLine();
                    elemento = vetAluno[i].split(",");

                    for (int j = 0; j < elemento.length; j++) {
                        if (j == 1 || j == 2 || j == 3) {
                            media = Integer.parseInt(elemento[j]);
                        }
                    }
                    printWriter.print(elemento[0] + " ");
                    printWriter.printf("%.2f\n", media/3);
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }
    }
}