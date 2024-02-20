import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m              Uma atleta na equipe               \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double altura_atleta;
        int idade_atleta;

        System.out.println("Digite o sexo da pessoa que deseja verificar [F/M]: ");
        String genero_atleta = input.nextLine();

        if (genero_atleta.equals("M")) {
            System.out.println("Me desculpe, só aceitamos pessoas do gênero feminino");

        } else if (genero_atleta.equals("F")) {

            try {Thread.sleep(2000);} catch (InterruptedException ex) {}


            System.out.println("Digite o nome da pessoa que quer ver se está apto a entrar para a equipe: ");
            String nome_atleta = input.nextLine();

            try {Thread.sleep(2000);} catch (InterruptedException ex) {}

            System.out.println("Digite a altura de " + nome_atleta + ": ");
            altura_atleta = input.nextDouble();

            try {Thread.sleep(2000);} catch (InterruptedException ex) {}

            System.out.println("Digite a idade de " + nome_atleta + ": ");
            idade_atleta = input.nextInt();


            if (altura_atleta >= 1.60 && altura_atleta <= 1.80 && idade_atleta >= 15 && idade_atleta <= 18) {
                System.out.println("\033[92mParabéns " + nome_atleta + ", você está na equipe! 😎\033[m");

            } else {
                System.out.println("\033[91mInfelizmente a " + nome_atleta + " não está apta a entrar na equipe! 😔\033[m");
            }
        }
    }
}