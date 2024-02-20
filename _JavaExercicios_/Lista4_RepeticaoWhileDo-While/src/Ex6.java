import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m                  Um Número até 0                 \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int cont = 1;
        int num;

        System.out.println("Digite um número: ");
        num = input.nextInt();

        while (num > 0){
            System.out.print(num - 1);
            num -= cont ;
        }
    }
}