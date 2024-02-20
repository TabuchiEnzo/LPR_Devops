import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha;
        try { Thread.sleep (2000); } catch (InterruptedException ignored) {}
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();
        Ex5 ex5 = new Ex5();
        Ex6 ex6 = new Ex6();

        do {
            System.out.println("""
                    \nEscolha o exercício  que desejas fazer:\s
                    \033[94m-------------------------------------\033[m
                    \033[91m[0] Sair\033[m
                    \033[92m[1] Comissão\033[m
                    \033[93m[2] Triângulo\033[m
                    \033[92m[3] Loja\033[m
                    \033[93m[4] Trabalhador\033[m
                    \033[92m[5] \033[m
                    \033[93m[6] \033[m
                    \033[94m-------------------------------------\033[m""");
            escolha = input.nextInt();

            try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

            switch (escolha) {
                case 1 -> {
                    ex1.ex1();
                }
                case 2 -> {
                    ex2.ex2();
                }
                case 3 -> {
                    ex3.ex3();
                }
                case 4 -> {

                    }
                }

            } while (escolha != 0); {
        }
    }
}