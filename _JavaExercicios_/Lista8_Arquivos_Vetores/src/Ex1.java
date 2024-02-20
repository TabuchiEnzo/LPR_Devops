import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex1 { // Início da classe
    public static void main(String[] args) {

        // Criação do caminho do arquivo e do vetor
        String caminhoArquivo = "Temperaturas.txt";
        double[] vetTemperaturas = new double[30];

        try {
            File Temperaturas = new File(caminhoArquivo);
            Scanner tabuchi = new Scanner(Temperaturas);

            int i = 0;

            // Pegando as coisas do arquivo e levando para o vetor
            while (tabuchi.hasNextDouble()) {
                double linha = tabuchi.nextDouble();
                vetTemperaturas[i] = linha;
                System.out.println(vetTemperaturas[i]);
                i+=1;
            }
            tabuchi.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado 😔 --> " + e.getMessage());
        }

        // For para calcular a maior temperatura
        double maior_temp = vetTemperaturas[0];
        for (int cont1 = 1; cont1 < vetTemperaturas.length; cont1++) {
            if (vetTemperaturas[cont1] > maior_temp) {
                maior_temp = vetTemperaturas[cont1];
            }
        }

        // For para calcular a menor temperatura
        double menor_temp = vetTemperaturas[0];
        for (int cont2 = 0; cont2 < vetTemperaturas.length; cont2++) {
            if (menor_temp > vetTemperaturas[cont2]) {
                menor_temp = vetTemperaturas[cont2];
            }
        }

        // Mostrando a maior e a menor temperatura
        System.out.println("\n\nA maior temperatura é de: \033[92m" + maior_temp + "°\033[m");
        System.out.println("\nA menor temperatura é de: \033[92m" + menor_temp + "°\033[m");
    }
}