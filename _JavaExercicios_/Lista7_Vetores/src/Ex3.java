import java.util.Random;
public class Ex3 {
    public static void main(String[] args) {
        Random tabaleatorio = new Random();
        double[] vetNum = new double[30];

        // For para mostrar os valores dos vetores
        for (int i = 0; i < vetNum.length; i++) {
            vetNum[i] = tabaleatorio.nextDouble(-10, 35);
            System.out.printf("\n\033[93mVetor [" + i + "] \033[m \033[94mValor " + (i + 1) + "\033[m: %.2f", vetNum[i]);
        }
        double maior_temp = vetNum[0];

        // For para calcular a maior temperatura
        for (int i = 1; i < vetNum.length; i++) {
            if (vetNum[i] > maior_temp) {
                maior_temp = vetNum[i];
            }
        }

        // For para calcular a menor temperatura
        double menor_temp = vetNum[0];
        for (int i = 0; i < vetNum.length; i++) {
            if (menor_temp > vetNum[i]) {
                menor_temp = vetNum[i];
            }
        }

        // Mostrando a maior e a menor temperatura
        System.out.printf("\n\nA maior temperatura é de: \033[92m%.2f", maior_temp + "\033[m");
        System.out.printf("\nA menor temperatura é de: \03392m%.2f", menor_temp + "\033m");
    }
}