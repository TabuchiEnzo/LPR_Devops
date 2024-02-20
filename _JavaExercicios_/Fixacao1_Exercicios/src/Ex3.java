import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m            Cálculos em dois inteiros             \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        double numint1, numint2, escolha, soma, produto, diferenca, divisao;
        Scanner input = new Scanner(System.in);

        System.out.println("\033[96mDigite um número inteiro: \033[m");
        numint1 = input.nextDouble();

        try {Thread.sleep(1000);} catch (InterruptedException ex) {};

        System.out.println("\033[96mDigite outro número inteiro: \033[m");
        numint2 = input.nextDouble();

        try {Thread.sleep(1000);} catch (InterruptedException ex) {};
        System.out.println("\033[93m-----------------------------------------------------------------------------\033[m");

        soma = (numint1 + numint2);
        produto = (numint1 * numint2);
        diferenca = (numint1 - numint2);
        divisao = (numint1 / numint2);

        System.out.println("\033[32mEscolha o cálculo que desejas fazer: \033[m");
        System.out.println("\033[93m-----------------------------------------------------------------------------\033[m");

        System.out.println("\033[32m[1] Soma\033[m");
        System.out.println("\033[32m[2] Produto\033[m");
        System.out.println("\033[32m[3] Diferença\033[m");
        System.out.println("\033[32m[4] Divisão\033[m");
        escolha = input.nextInt();

        System.out.println("\033[93m-----------------------------------------------------------------------------\033[m");

        if (escolha == 1) {
            System.out.println("A soma entre " + numint1 + " e " + numint2 + " se resulta em: \033[92m" + soma + "\033[m");

        } else if (escolha == 2) {
            System.out.println("O produto entre " + numint1 + " e " + numint2 + "se resulta em: \033[92m" + produto + "\033[m");

        } else if (escolha == 3) {
            System.out.println("A diferença entre " + numint1 + " e " + numint2 + " se resulta em: \033[92m" + diferenca + "\033[m");

        } else if (escolha == 4) {
            System.out.println("O quociente entre " + numint1 + " e " + numint2 + " se resulta em: \033[92m" + divisao + "\033[m");

        } else if (escolha >= 5) {
            System.out.println("Me desculpa, algo errado 😔");

        }
    }
}