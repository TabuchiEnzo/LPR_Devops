import java.io.*;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        String caminhoArquivo = "Salarios.txt";
        double[] vetSalario = new double[5];

        try {
            // Criação do caminho do arquivo
            File salario = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(salario);

            // Pegando as coisas do arquivo e levando para o vetor
            for (int i = 0; i < 5; i++) {
                if (tabuchi.hasNextDouble()) {
                    double linha = tabuchi.nextDouble();
                    vetSalario[i] = linha;
                }
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        }

        // For para mostrar os valores do vetores
        for (int i = 0; i < vetSalario.length; i++) {
            System.out.printf("\n\033[93mSalario [" + (i + 1) +"] \033[m: R$%.2f", vetSalario[i]);
        }

        Scanner tabuchi = new Scanner(System.in);

        // Fazendo a pergunta para o usuário dizer qual o percentual de aumento para cada salário
        System.out.print("\nDigite o percentual de aumento para os salários visto acima: ");
        double percentualAumento = tabuchi.nextDouble();

        double[] vetSalarioTotal = new double[10];

        // For que faz o salário total dos funcionário com o percentual de aumento
        for (int i = 0; i < vetSalario.length; i++) {
            vetSalarioTotal[i] = vetSalario[i] + (vetSalario[i] * percentualAumento / 100);
        }

//        // For para mostrar os valores do vetor após colocar o percentual de aumento
//        for (int i = 0; i < vetSalarioTotal.length; i++) {
//            System.out.printf("\n\033[93mSalário total Func [" + (i + 1) + "]: R$%.2f", vetSalarioTotal[i]);
//        }

        // Adicionando os salários com o percentual de desconto em outro arquivo
        String caminhoArquivo2 = "SalariosComPercentual.txt";

        try {
            FileWriter fileWriter = new FileWriter(caminhoArquivo2);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < vetSalarioTotal.length; i++) {
                printWriter.println(vetSalarioTotal[i]);
            }

            printWriter.close();
            System.out.println("Texto salvo com sucesso no arquivo (" + caminhoArquivo2 + ")");
        } catch (IOException ioe) {
            System.out.println("Ocorreu um erro ao salvar o arquivo " + ioe.getMessage());
        }
    }
}