import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m        Quanto tempo uma pessoa tem de vida       \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int quant_cigarro, conversor, temp_menos_vida, temp_de_vicio,dias;

        System.out.println("Digite quantos cigarros fuma no dia:");
        quant_cigarro= input.nextInt();

        System.out.println("Digite quantos anos fuma:");
        temp_de_vicio= input.nextInt();

        dias = temp_de_vicio * 365;
        conversor = (quant_cigarro * 11) * dias;
        temp_menos_vida = conversor/1440;

        System.out.println("Seu tempo de vida perdido é de: " + temp_menos_vida + " dias ou " + temp_menos_vida/365 + " ano(s)");

    }
}