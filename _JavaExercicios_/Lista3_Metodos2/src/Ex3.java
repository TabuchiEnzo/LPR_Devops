import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m              Currículo dos alunos               \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int ano_pessoa, quant_idiomas;

        System.out.println("Qual o nome do aluno que quer verificar o currículo: ");
        String nome_aluno = input.nextLine();

        System.out.println("Digite em que ano o(a) " + nome_aluno + " está: ");
        ano_pessoa = input.nextInt();

        System.out.println("Digite a quantidade de idiomas que o(a)" + nome_aluno + " fala: ");
        quant_idiomas = input.nextInt();

    }
}