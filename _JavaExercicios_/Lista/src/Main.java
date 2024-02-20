import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);

        System.out.print("Digite o número no qual seria o tamanho da lista: ");
        int tamanho = tabuchi.nextInt();
        ListaSequencial lista = new ListaSequencial(tamanho);
        boolean sair = false;

        do {
            System.out.print("\nDigite o que você deseja fazer: \n" +
                    "[ 1 ] Inserir item por posição\n" +
                    "[ 2 ] Inserir item na última posição\n" +
                    "[ 3 ] Remover item\n" +
                    "[ 4 ] Descobrir item\n" +
                    "[ 5 ] Verificar se existe\n" +
                    "[ 6 ] Procurar item\n" +
                    "[ 7 ] Verificar o limite do vetor\n" +
                    "[ 8 ] Verificar a quantidade de itens\n" +
                    "[ 9 ] Verificar a Lista\n" +
                    "[ 0 ] SAIR\n" +
                    "Digite: ");
            int escolha = tabuchi.nextInt();

            switch (escolha) {
                case 1 -> {
                    System.out.print("\nDigite o valor que você deseja inserir: ");
                    double valor1 = tabuchi.nextDouble();

                    System.out.print("\nDigite a posição em que você deseja inserir: ");
                    int posicao1 = tabuchi.nextInt();

                    lista.inserir(valor1, posicao1);

                    break;
                }
                case 2 -> {
                    System.out.print("\nDigite o valor que você deseja inserir: ");
                    double valor2 = tabuchi.nextDouble();

                    lista.inserir(valor2);

                    break;
                }
                case 3 -> {
                    System.out.print("\nDigite a posição em que você deseja remover: ");
                    int posicao3 = tabuchi.nextInt();

                    lista.remover(posicao3);

                    break;
                }
                case 4 -> {
                    System.out.print("\nDigite a posição em que você deseja verificar qual número à nele: ");
                    int posicao4 = tabuchi.nextInt();

                    lista.descobrir(posicao4);

                    break;
                }
                case 5 -> {
                    System.out.print("\nDigite a posição em que você deseja verificar se existe algum número: ");
                    int posicao5 = tabuchi.nextInt();

                    lista.existe(posicao5);

                    break;
                }
                case 6 -> {
                    System.out.print("\nDigite um valor no qual deseja ser procurado: ");
                    double procurado = tabuchi.nextDouble();

                    lista.procurar(procurado);

                    break;
                }
                case 7 -> {
                    System.out.println("\n O tamanho do vetor é: " + tamanho);
                    break;
                }
                case 8 -> {
                    System.out.println("\nA quantidade de itens dentro do vetor é de: " + lista.quantidade() + " itens");
                    break;
                }
                case 9 -> {
                    System.out.println("\n" + lista);
                    break;
                }
                case 0 -> {
                    sair = true;
                    break;
                }
            }
        } while (!sair);
    }
}