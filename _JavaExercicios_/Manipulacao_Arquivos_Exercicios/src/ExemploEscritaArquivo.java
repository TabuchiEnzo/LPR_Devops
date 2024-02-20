import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class ExemploEscritaArquivo {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        String caminhoArquivo = "teste.txt";
        try {
            FileWriter fileWriter = new FileWriter(caminhoArquivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Este é um exemplo de texto que será salvo no arquivo");
            printWriter.println("Você pode adicionar quantas linhas quiser");

            printWriter.close();
            System.out.println("Texto salvo com sucesso no arquivo");
        } catch (IOException ioe) {
            System.out.println("Ocorreu um erro ao salvar o arquivo " + ioe.getMessage());
        }
    }
}