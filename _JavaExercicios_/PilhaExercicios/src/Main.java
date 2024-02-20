import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ex1 pilha1 = new Ex1(10);
        Scanner tabuchi = new Scanner(System.in);
        boolean sair1 = false;
        boolean sair2 = false;
        boolean sair3 = false;

        do {
            System.out.print("--Digite o exercício--\n" +
                    "[ 1 ] pilha sem capacidade\n" +
                    "[ 2 ] pilha produto\n" +
                    "[ 3 ] Sair\n" +
                    "digite aqui: ");
            int escolha1 = tabuchi.nextInt();

            switch (escolha1) {
                case 1 -> {
                    do {
                        System.out.print("\nO que você deseja fazer:\n" +
                                "[ 1 ] Inserir Valor\n" +
                                "[ 2 ] Excluir Valor\n" +
                                "[ 3 ] Verificar se Pilha está vazia\n" +
                                "[ 4 ] Ver o Topo\n" +
                                "[ 5 ] Mostrar a Pilha\n" +
                                "[ 6 ] Sair\n" +
                                "");
                        int opcao = tabuchi.nextInt();

                        switch (opcao) {
                            case 1 -> {
                                System.out.print("Digite um elemento: ");
                                String elemento = tabuchi.next();

                                pilha1.inserir(elemento);
                                break;
                            }
                            case 2 -> {
                                if (pilha1.estaVazia()) {
                                    pilha1.retirar();
                                    System.out.println("\nValor excluído com sucesso!");
                                }
                                break;
                            }
                            case 3 -> {
                                if (pilha1.estaVazia()) {
                                    System.out.println("\nA pilha está vazia!");
                                } else {
                                    System.out.println("\nA pilha não está vazia!");
                                }
                                break;
                            }
                            case 4 -> {
                                System.out.println("\nO topo da pilha é: " + pilha1.retornarTopo());
                                break;
                            }
                            case 5 -> {
                                System.out.println("\nPilha: " + pilha1);
                                break;
                            }
                            case 6 -> {
                                sair2 = true;
                                break;
                            }
                        }
                    } while (!sair2);
                }
                case 2 -> {
                    System.out.print("Digite o tamanho da pilha: ");
                    int tamanho = tabuchi.nextInt();

                    Ex2 pilha2 = new Ex2(tamanho);

                    do {
                        System.out.print("\nO que você deseja fazer:\n" +
                                "[ 1 ] Inserir Produto\n" +
                                "[ 2 ] Excluir Produto\n" +
                                "[ 3 ] Verificar se Pilha está vazia\n" +
                                "[ 4 ] Ver o Topo\n" +
                                "[ 5 ] Mostrar a Pilha\n" +
                                "[ 6 ] Sair\n" +
                                "");
                        int opcao = tabuchi.nextInt();

                        switch (opcao) {
                            case 1 -> {
                                System.out.print("Digite o nome do produto: ");
                                String nome = tabuchi.next();

                                System.out.print("Digite o código do produto: ");
                                int codigo = tabuchi.nextInt();

                                System.out.print("Digite o preço do produto: ");
                                double preco = tabuchi.nextDouble();

                                pilha2.push(new Produto(codigo, nome, preco));
                                break;
                            }
                            case 2 -> {
                                if (pilha2.isEmpty()) {
                                    pilha2.pop();
                                    System.out.println("\nValor excluído com sucesso!");
                                }
                                break;
                            }
                            case 3 -> {
                                if (pilha2.isEmpty()) {
                                    System.out.println("\nA pilha está vazia!");
                                } else {
                                    System.out.println("\nA pilha não está vazia!");
                                }
                                break;
                            }
                            case 4 -> {
                                System.out.println("\nO topo da pilha é: " + pilha2.peek());
                                break;
                            }
                            case 5 -> {
                                System.out.println("\nPilha: " + pilha2);
                                break;
                            }
                            case 6 -> {
                                sair3 = true;
                                break;
                            }
                        }
                    } while (!sair3);

                    break;
                }
                case 3 -> {
                    sair1 = true;
                    break;
                }
            }
        } while (!sair1);
    }
}