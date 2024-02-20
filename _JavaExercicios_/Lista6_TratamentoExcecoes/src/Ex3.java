import java.util.Scanner;

public class Ex3 {
    public static void ex3 () {
        Scanner input = new Scanner(System.in);
        int dia_semana;
        boolean a = false;

        System.out.println("\n" +
                "\033[94m-------------------------------------------\033[m\n" +
                "\033[91m[0] Encerramento do programa\033[m\n" +
                "\033[92m[1] Domingo\033[m\n" +
                "\033[93m[2] Segunda-Feira\033[m\n" +
                "\033[92m[3] Terça-Feira\033[m\n" +
                "\033[93m[4] Quarta-Feira\033[m\n" +
                "\033[92m[5] Quinta-Feira\033[m\n" +
                "\033[93m[6] Sexta-Feira\033[m\n" +
                "\033[93m[7] Sábado\033[m\n" +
                "\033[94m-------------------------------------------\033[m");

        System.out.println("Digite o dia da semana que desejas saber qual é: ");
        dia_semana = input.nextInt();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        if (dia_semana == 1) {
            System.out.println("O dia da semana é \033[92mDomingo\033[m");
        } else if (dia_semana == 2) {
            System.out.println("O dia da semana é \033[92mSegunda-Feira\033[m");
        } else if (dia_semana == 3) {
            System.out.println("O dia da semana é \033[92mTerça-Feira\033[m");
        } else if (dia_semana == 4) {
            System.out.println("O dia da semana é \033[92mQuarta-Feira\033[m");
        } else if (dia_semana == 5) {
            System.out.println("O dia da semana é \033[92mQuinta-Feira\033[m");
        } else if (dia_semana == 6) {
            System.out.println("O dia da semana é \033[92mSexta-Feira\033[m");
        } else if (dia_semana == 7) {
            System.out.println("O dia da semana é \033[92mSábado\033[m");
        }
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
}
