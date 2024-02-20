import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m              Println e Printf \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        // Print ln
        System.out.println("\033[93m--Println--\033[m");
        System.out.println("\033[92m 1 2 3 4 \033[m");

        // Print f
        System.out.println("\033[93m--Printf--\033[m");
        System.out.printf("\033[92m %s %s %s %s \033[m", 1,2,3,4);

    }
}