import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("\033[93m---------------------------------------------------\033[m");
        System.out.println("\033[92m                  Notas de Alunos                 \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        int cont = 0;
        double nota_aluno = 0;
        int num_alunos = 10;

        while (num_alunos != 0) {
            cont++;
            System.out.println("Digite a nota do aluno: ");
            nota_aluno += nota_aluno = input.nextDouble();
            num_alunos -= 1;
        }

        double media_turma = nota_aluno / cont;

        System.out.printf("A média da sala é de %.1f.", media_turma);
    }
}