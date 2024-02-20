import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        int capacidadeFila = 0;
        FilaPrioridade fila = new FilaPrioridade(capacidadeFila);
        int escolha = 0;

        Pessoa pessoa = null;
        String nome = null;
        String cpf = null;
        int idade = 0;

        boolean segue1 = false, segue2 = false, segue3 = false, seguir = false;

        do {
            try {
                System.out.println("=====MENU=====");
                System.out.println("[ 1 ] Criar Fila" +
                        "\n[ 2 ] Adicionar Cliente" +
                        "\n[ 3 ] Tamanho da Fila" +
                        "\n[ 4 ] Verificar a Fila" +
                        "\n[ 5 ] Atender Cliente" +
                        "\n[ 6 ] Capacidade da Fila" +
                        "\n[ 7 ] Ver o início e o fim da Fila" +
                        "\n[ 0 ] Sair");
                escolha = tabuchi.nextInt();

                switch (escolha) {
                    case 1 -> {
                        System.out.println("\nDigite a capacidade da fila: ");
                        capacidadeFila = tabuchi.nextInt();

                        fila = new FilaPrioridade(capacidadeFila);

                        break;
                    }
                    case 2 -> {
                        try {
                            System.out.print("\nDigite o nome da pessoa: ");
                            nome = tabuchi.next();

                            System.out.print("Digite o cpf da pessoa: ");
                            cpf = tabuchi.next();

                            System.out.print("Digite a idade da pessoa: ");
                            idade = tabuchi.nextInt();
                        } catch (InputMismatchException ime) {
                            ime.printStackTrace();
                        }
                        pessoa = new Pessoa(nome, cpf, idade);
                        fila.offer(pessoa);

                        break;
                    }
                    case 3 -> {
                        System.out.println("\nTamanho: " + fila.size());

                        break;
                    }
                    case 4 -> {
                        System.out.println("\nFila:");
                        System.out.println(fila);

                        break;
                    }
                    case 5 -> {
                        fila.poll();
                        System.out.println("Atendido: " + fila.poll());
                    }
                    case 6 -> {
                        System.out.println("Capacidade: " + capacidadeFila);

                        break;
                    }
                    case 7 -> {
                        System.out.println("Início da Fila: " + fila.getInicio() + " | " + " Fim da fila: " + fila.getFim());
                        break;
                    }
                    case 0 -> {
                        seguir = true;

                        break;
                    }
                }
            } catch (InputMismatchException ime) {
                ime.printStackTrace();
            }
        } while (!seguir);
    }
}