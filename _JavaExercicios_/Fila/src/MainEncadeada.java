import java.util.*;

public class MainEncadeada {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        Queue<PessoaEncadeada> fila = new <PessoaEncadeada>LinkedList();
        boolean sair = false;

        do {
            System.out.print("\nO que você deseja fazer:\n" +
                    "[ 1 ] Adicionar Valor\n" +
                    "[ 2 ] Excluir Valor\n" +
                    "[ 3 ] Verificar se fila está vazia\n" +
                    "[ 4 ] Ver o Início\n" +
                    "[ 5 ] Mostrar a fila\n" +
                    "[ 6 ] Sair");
            int opcao = tabuchi.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("\nQual o nome que nome deseja adicionar: ");
                    String nome = tabuchi.nextLine();

                    System.out.print("\nQual a altura que nome deseja adicionar: ");
                    double altura = tabuchi.nextDouble();

                    fila.offer(new PessoaEncadeada(nome, altura));
                    break;
                }
                case 2 -> {
                    fila.poll();
                    System.out.println("\nValor excluído com sucesso!");
                    break;
                }
                case 3 -> {
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        System.out.println("\nA fila não está vazia!");
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("\nO início da fila é: " + fila.peek());
                    break;
                }
                case 5 -> {
                    System.out.println("\nfila: " + fila);
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