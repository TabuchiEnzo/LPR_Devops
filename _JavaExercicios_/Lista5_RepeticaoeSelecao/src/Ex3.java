import java.util.Random;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Idade de 80 pessoas");
        System.out.println("------------------");
        Random aleatorio = new Random();

        int adult = 0;
        for (int i = 0; i < 80; i++) {
            int idadePessoas = aleatorio.nextInt(0, 120);
            System.out.println("Pessoa " + (i + 1) + ": " + idadePessoas + " anos");
            if (idadePessoas >= 21 && idadePessoas < 65) {
                adult += 1;
            }
        }

        System.out.println("\nExistem " + adult + " pessoas adultas dentre essas 80 pessoas");
    }
}