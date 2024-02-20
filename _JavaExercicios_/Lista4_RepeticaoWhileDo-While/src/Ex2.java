import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m                     Tabuada                     \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int cont = 1;
        int num;

        try { Thread.sleep (2000); } catch (InterruptedException ex) {}

        System.out.println("Digite um número: ");
        num = input.nextInt();

        while (cont <= 10){
            System.out.println(num + "." + cont + " = " + cont * num);
            cont ++;
        }
    }
}