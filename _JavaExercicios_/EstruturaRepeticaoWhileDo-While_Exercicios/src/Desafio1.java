import java.util.Random;
import java.util.Scanner;
public class Desafio1{
    public static void main(String[]args){
        System.out.println("\033[93m---------------------------------------------------\033[m");
        System.out.println("\033[92m                   Notas de Alunos                 \033[m");
        System.out.println("\033[93m---------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        double soma = 0, nota_aluno;
        int num_alunos = 10;

        while (num_alunos != 11 && num_alunos != 0){
            nota_aluno = aleatorio.nextDouble(10);
            System.out.printf("Nota aluno: %.1f", nota_aluno);
            num_alunos -= 1;
            System.out.println("\n------------------------------");
            soma += nota_aluno;
        }

        double media_sala = soma / 10;

        System.out.printf("Média da sala: %.1f", media_sala);
    }
}