import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m            Idade de uma pessoa em dias           \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        int idade_ano, idade_mes, idade_dia, dia_tot;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa que deseja calcular a idade em dias: ");
        String nome = input.nextLine();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite a idade expressa em anos de " + nome + ": ");
        idade_ano = input.nextInt();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite a idade expressa em mês de " + nome + ": ");
        idade_mes = input.nextInt();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite a idade expressa em dias de " + nome + ": ");
        idade_dia = input.nextInt();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        dia_tot = (idade_ano*365) + (idade_mes*30) + (idade_dia);

        System.out.println("A idade de " + nome + "em dias é igual a \033[92m" + dia_tot + "\033[m");

    }
}