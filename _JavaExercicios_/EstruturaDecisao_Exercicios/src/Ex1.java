import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m                 Um atleta na equipe             \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double altura_atleta, peso_atleta;

        System.out.println("Digite o nome da pessoa que quer ver se está apto a entrar para a equipe: ");
        String nome_atleta = input.nextLine();

        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        System.out.println("Digite a altura de " + nome_atleta + ": ");
        altura_atleta = input.nextDouble();

        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        System.out.println("Digite o peso de " + nome_atleta + ": ");
        peso_atleta = input.nextDouble();

        System.out.println("\033[93m------------------------------------------------------------\033[m");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        if (altura_atleta >= 1.70 && peso_atleta <= 65) {
            System.out.println("\033[92mParabéns, você está na equipe!! \033[m😎");

        } else {
            System.out.println("\033[91mMe desculpa, você não está apto a entrar para a equipe! \033[m😔");
        }
    }
}