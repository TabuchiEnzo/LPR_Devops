import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex1 {
    public static void ex1 () {
        Scanner input = new Scanner(System.in);

        int lado_a = 0, lado_b = 0, lado_c = 0;
        boolean a = false;

        do {
            try {

                System.out.println("Digite o 1° lado: ");
                lado_a = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ex) {}

                System.out.println("Digite o 2° lado: ");
                lado_b = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ex) {}

                System.out.println("Digite o 3° lado: ");
                lado_c = input.nextInt();

                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                a = true;

            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números reais -> " + ime);
                input.nextLine();
            }

        } while (!a); {

            if (lado_a == lado_b && lado_a == lado_c)
                System.out.println("As somas dos lados se transformam em um triângulo \033[92mEquilatero\033[m");

            else if (lado_a == lado_b || lado_a == lado_c || lado_b == lado_c)
                System.out.println("As somas dos lados se transformam em um triângulo \033[92mIsosceles\033[m");

            else {
                System.out.println("As somas dos lados se transformam em um triângulo \033[92mEscaleno\033[m");

            }
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
    }
}
