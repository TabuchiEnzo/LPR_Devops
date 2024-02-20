import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m                 Calculadora de IMC               \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        double imc, peso_em_kg, alt_em_met;
        Scanner input = new Scanner(System.in);
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite o nome da pessoa que deseja calcular o IMC: ");
        String nome = input.nextLine();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite o peso em Kg de " + nome + ": ");
        peso_em_kg = input.nextDouble();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite a altura em metros de " + nome + ": ");
        alt_em_met = input.nextDouble();

        System.out.println("\033[93m--------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        imc = peso_em_kg/(alt_em_met*alt_em_met);

        System.out.println("O IMC de " + nome + " é igual a \033[92m" + imc + "\033[m");

    }
}