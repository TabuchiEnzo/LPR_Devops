import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {

        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m      Leitor da nota média anual de um aluno      \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        System.out.println("Digite o nome do aluno que quer ver a nota da média anual: ");
        String nome_aluno = input.nextLine();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite a nota do aluno " + nome_aluno + " que tirou no QUIZ do 1° semestre: ");
        double nota_quiz_aluno_1sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou nas Práticas Avaliativas do 1° semestre: ");
        double nota_PA_aluno_1sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou nos Trabalhos no 1° semestre: ");
        double nota_trab_aluno_1sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou no Projeto Interdisciplinar do 1° semestre: ");
        double nota_proj_inter_aluno_1sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou na Avaliação Individual dos Trabalhos em Grupo do 1° semestre: ");
        double nota_aval_ind_trab_grup_1sem = input.nextDouble();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};

        System.out.println("Digite a nota do aluno " + nome_aluno + " que tirou noo QUIZ do 2° semestre: ");
        double nota_quiz_aluno_2sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou nas Práticas Avaliativas do 2° semestre: ");
        double nota_PA_aluno_2sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou nos Trabalhos no 2° semestre: ");
        double nota_trab_aluno_2sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou no Projeto Interdisciplinar do 2° semestre: ");
        double nota_proj_inter_aluno_2sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou no Projeto do Livro no 2° semestre: ");
        double nota_proj_livro_aluno_2sem = input.nextDouble();

        System.out.println("Digite a nota que o aluno " + nome_aluno + " tirou na Avaliação Individual dos Trabalhos em Grupo do 2° semestre: ");
        double nota_aval_ind_trab_grup_2sem = input.nextDouble();

        // Cálculos

        double media_N1_aluno_1sem = (nota_quiz_aluno_1sem * 0.3) + (nota_PA_aluno_1sem * 0.7);
        double media_N2_aluno_1sem = (nota_trab_aluno_1sem * 0.3) + (nota_proj_inter_aluno_1sem * 0.2) + (nota_aval_ind_trab_grup_1sem * 0.5);
        double media_N1_aluno_2sem = (nota_quiz_aluno_2sem * 0.3) + (nota_PA_aluno_2sem * 0.7);
        double media_N2_aluno_2sem = (nota_trab_aluno_2sem * 0.3) + (nota_proj_inter_aluno_2sem * 0.2) + (nota_proj_livro_aluno_2sem * 0.2) + (nota_aval_ind_trab_grup_2sem * 0.3);
        double media_sem1 = (media_N1_aluno_1sem + media_N2_aluno_1sem) / 2;
        double media_sem2 = (media_N1_aluno_2sem + media_N2_aluno_2sem) / 2;
        double media_anual = (media_sem1 + (media_sem2 * 2)) / 3;

        // Base Final

        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota das Atividades Individuais (N1) do 1° semestre do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_N1_aluno_1sem + "\033[m" );
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota das Atividades em Grupo (N2) do 1° semestre do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_N2_aluno_1sem + "\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota das Atividades Individuais (N1) do 2° semestre do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_N1_aluno_2sem + "\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota das Atividades em Grupo (N2) do 2° semestre do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_N2_aluno_2sem + "\033[m" );
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota Média do 1° Semestre do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_sem1 + "\033[m" );
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota Média do 2° Semestre do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_sem2 + "\033[m" );
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("A nota média A-N-U-A-L do aluno \033[92m" + nome_aluno + "\033[m é de: \033[92m" + media_anual + " !!!! \033[m");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {};
        System.out.println("\033[93m------------------------------------------------------------------------------------------------------------------------------------------------\033[m");
        try { Thread.sleep (8000); } catch (InterruptedException ex) {};

        if (media_anual >= 7.0 && media_anual <= 10.0) {
            System.out.println("\033[92mMeus Parabéns, o(a) aluno(a) " + nome_aluno + " foi Aprovado(a) direto!!!! 😎\033[m");

        } else if (media_anual <= 6.9 && media_anual >= 0.0) {
            System.out.println("\033[31mMe desculpe o(a) aluno(a)" + nome_aluno + "ficou de recuperação 😔\033[m");
        }
    }
}