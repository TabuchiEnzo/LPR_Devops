import java.util.Scanner;
import java.util.Stack;

public class MainEncadeada {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        Stack<PessoaEncadeada> pilha = new Stack<PessoaEncadeada>();
        boolean sair = false;

        do {
            System.out.print("\nO que você deseja fazer:\n" +
                    "[ 1 ] Adicionar Valor\n" +
                    "[ 2 ] Excluir Valor\n" +
                    "[ 3 ] Verificar se Pilha está vazia\n" +
                    "[ 4 ] Ver o Topo\n" +
                    "[ 5 ] Mostrar a Pilha\n" +
                    "[ 6 ] Sair");
            int opcao = tabuchi.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome: ");
                    String nome = tabuchi.nextLine();

                    System.out.print("Digite a altura: ");
                    double altura = tabuchi.nextDouble();

                    pilha.push(new PessoaEncadeada(nome, altura));
                    break;
                }
                case 2 -> {
                    if (pilha.isEmpty()) {
                        pilha.pop();
                        System.out.println("\nValor excluído com sucesso!");
                    }
                    break;
                }
                case 3 -> {
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        System.out.println("\nA pilha não está vazia!");
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("\nO topo da pilha é: " + pilha.peek());
                    break;
                }
                case 5 -> {
                    System.out.println("\nPilha: " + pilha);
                    break;
                }
                case 6 -> {
                    sair = true;
                    break;
                }
            }
        } while (!sair);
    }
}