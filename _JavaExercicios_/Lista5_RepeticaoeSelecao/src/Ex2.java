import java.util.Random;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Notas de 25 alunos");
        System.out.println("------------------");
        Random aleatorio = new Random();

        for (int i = 0; i < 25; i++) {
            double trabGrup = aleatorio.nextDouble(0,10);
            double exer = aleatorio.nextDouble(0, 10);
            double avaliacaoIndiv = aleatorio.nextDouble(0, 10);
            System.out.printf("\nAluno " + (i + 1) + ": " +
                    "\nTrabalho em Grupo: %.1f" +
                    "\nExercícios: %.1f" +
                    "\nAvaliação Individual: %.1f", trabGrup, exer, avaliacaoIndiv);

            double mediaAluno = (trabGrup * 0.2) + (exer * 0.3) + (avaliacaoIndiv * 0.5);
            System.out.printf("\nMédia Aluno " + (i + 1) + ": %.1f", mediaAluno);

            if (mediaAluno >= 7) {
                System.out.println("\n\033[92mAluno Aprovado ! 😎\033[m");
            } else if (mediaAluno >= 5 && mediaAluno < 7) {
                System.out.println("\n\033[93mAluno de Recuperação !! 😐\033[m");
            } else if (mediaAluno < 5 && mediaAluno >= 0) {
                System.out.println("\n\033[91mAluno Reprovado !!! 😔\033[m");
            } else {
                System.out.println("\nAlgo deu errado, me desculpa !");
            }
        }
    }
}