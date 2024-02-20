import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ex3 {
    public static void main(String[] args) {

        // Chamando os arquivos
        String arquivo0 = "PessoaNome.txt";
        String arquivo1 = "PessoaIdade.txt";
        String arquivo2 = "PessoaCPF.txt";

        Object[] pessoa = new Object[3]; // Vetor de objetos

        try (BufferedReader nomesReader = new BufferedReader(new FileReader(arquivo0));
             BufferedReader idadesReader = new BufferedReader(new FileReader(arquivo1));
             BufferedReader cpfsReader = new BufferedReader(new FileReader(arquivo2))) {

            String nome = nomesReader.readLine();
            int idade = Integer.parseInt(idadesReader.readLine());
            String cpf = cpfsReader.readLine();

            // For para adicionar nome, idade e cpf no vetor de Objetos
            for (int i = 0; i < pessoa.length; i++) {
                pessoa[i] = new Object[] {nome, idade, cpf};
            }

            // For para mostrar o vetor de objetos
            for (int i = 0; i < pessoa.length; i++) {
                System.out.print(pessoa[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}