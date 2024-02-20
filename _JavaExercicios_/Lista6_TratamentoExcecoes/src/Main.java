import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}

        do {
            System.out.println("\n" +
                    "\033[94m-------------------------------------------\033[m\n" +
                    "\033[95m  Escolha o exercício  que desejas fazer:  \033[m\n" +
                    "\033[94m-------------------------------------------\033[m\n" +
                    "\033[91m[0] Sair\033[m\n" +
                    "\033[92m[1] Lados Triângulo\033[m\n" +
                    "\033[93m[2] Desconto da loja\033[m\n" +
                    "\033[92m[3] Dias da semana\033[m\n" +
                    "\033[93m[4] Eletrodomésticos\033[m\n" +
                    "\033[92m[5] Quantidade de dígitos\033[m\n" +
                    "\033[93m[6] Média dos números\033[m\n" +
                    "\033[93m[7] Comprador de casas\033[m\n" +
                    "\033[93m[8] Temperatura média\033[m\n" +
                    "\033[94m-------------------------------------------\033[m");
            escolha = input.nextInt();

            try { Thread.sleep (1000); } catch (InterruptedException ex) {}

            switch (escolha) {
                case 1 -> {
                    Ex1.ex1();
                }
                case 2 -> {
                    Ex2.ex2();
                }
                case 3 -> {
                    Ex3.ex3();
                }
                case 4 -> {
                    Ex4.ex4();
                }
                case 5 -> {
                    Ex5.ex5();
                }
                case 6 -> {
                    Ex6.ex6();
                }
                case 7 -> {
                    Ex7.ex7();
                }
                case 8 -> {
                    Ex8.ex8();
                }
            }
        } while (escolha != 0);
    }
}