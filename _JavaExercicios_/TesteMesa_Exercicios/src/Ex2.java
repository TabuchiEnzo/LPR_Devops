import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex2 {
    public void ex2 () {
        Scanner input = new Scanner(System.in);

        int lado_1 = 0, lado_2 = 0, lado_3 = 0;
        boolean a = false;

        do {
            try {

                System.out.println("Digite o 1° lado:");
                lado_1 = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

                System.out.println("Digite o 2° lado:");
                lado_2 = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

                System.out.println("Digite o 3° lado:");
                lado_3 = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ignored) {}
                a = true;

            } catch (InputMismatchException ime) {
                System.out.println("\033[91mNão é possível digitar isto. Digite apenas números reais -> " + ime + "\033[m");
                input.nextLine();
            } catch (Exception negativo) {
                System.out.println("\n\033[91mDigite apenas números positivos\033[m");
            }

        } while (!a); {

            if (lado_1 == lado_2 && lado_1 == lado_3)
                System.out.println("As somas dos lados se transformam em um triângulo \033[92mEquilatero\033[m");

            else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3)
                System.out.println("As somas dos lados se transformam em um triângulo \033[92mIsosceles\033[m");

            else {
                System.out.println("As somas dos lados se transformam em um triângulo \033[92mEscaleno\033[m");

            }
            try { Thread.sleep (2000); } catch (InterruptedException ignored) {}
        }
    }
}
