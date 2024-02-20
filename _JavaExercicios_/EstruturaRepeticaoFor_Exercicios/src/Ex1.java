import java.util.Random;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m              Média da nota dos alunos            \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Random aleatorio = new Random();
        double media_sala, soma = 0, nota_aluno;
        int quant_alunos = 10;

        for (int cont = 1; cont <= quant_alunos; cont ++) {
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            nota_aluno = aleatorio.nextDouble(10);
            System.out.printf("Nota aluno: %.1f", nota_aluno);
            System.out.println("\n------------------------------");
            soma += nota_aluno;
        }

        media_sala = soma / quant_alunos;
        System.out.printf("Média da sala: %.1f", media_sala);
    }
}