import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m             Números divisíveis por 3            \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}

        System.out.println("Digite o número que deseja ver os que são divisíveis por 3: ");
        int num = input.nextInt();

        for (int div = 0; num >= div; div ++){
            if (div % 3 == 0){
                System.out.println(div);
            }
        }
    }
}