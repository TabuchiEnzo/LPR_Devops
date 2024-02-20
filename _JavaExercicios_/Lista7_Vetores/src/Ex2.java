import java.util.Random;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        Random tabaleatorio = new Random();
        int[] vetNum = new int[7];
        int menorValor = vetNum[0];

        // For para mostrar os valores dos vetores
        for (int i = 0; i < vetNum.length; i++) {
            vetNum[i] = tabaleatorio.nextInt(1, 100);
            System.out.println("\033[93mVetor [" + i + "] \033[m \033[94mValor " + (i + 1) + "\033[m: " + vetNum[i]);
        }

        int segundoMaiorValor = menorValor;
        int maiorValor1 = menorValor;

        // For para calcular o segundo maior valor
        for (int i = 0; i < vetNum.length; i++) {
            if(vetNum[i] > maiorValor1)
                maiorValor1 = vetNum[i];
            else{
                if((vetNum[i] > segundoMaiorValor) && (vetNum[i] != maiorValor1))
                    segundoMaiorValor = vetNum[i];
            }
        }
        // Mostrando o segundo maior valor
        System.out.println("O segundo maior número é: \033[92m" + segundoMaiorValor + "\033[m");
        }
    }