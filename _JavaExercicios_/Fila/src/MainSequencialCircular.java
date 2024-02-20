import java.util.Scanner;

public class MainSequencialCircular {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        FilaSequencialCircular fila = new FilaSequencialCircular(10);
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
                    System.out.print("\nQual o valor que você deseja adicionar: ");
                    String valor = tabuchi.nextLine();
                    fila.offer(valor);
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