import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList();

        System.out.println("Digite 10 elementos que serão inseridos no final da lista...");
        String valor = null;
        for (int i = 0; i < 10; i++) {
            valor = tabuchi.nextLine();
            lista.addLast(valor);
        }

        System.out.println("\nExcluindo o 5° elemento da lista...");
        System.out.println("Excluindo o elemento: " + lista.get(5));
        lista.remove(4);

        System.out.print("\nDigite um elemento para ser inserido na 7° posição: ");
        String valor2 = tabuchi.nextLine();
        lista.add(6, valor2);

        System.out.println("Lista: " + lista);

        System.out.println("\nExcluindo elemento da 3° posição...");
        lista.remove(2);

        System.out.println("\nPrimeiro elemento da lista: " + lista.getFirst());
        System.out.println("Último elemento da lista: " + lista.getLast());

        System.out.print("\nDigite um elemento para ser inserido no começo da lista: ");
        String valor3 = tabuchi.nextLine();
        lista.addFirst(valor3);

        System.out.print("\nDigite um índice para ser excluído um valor nele: ");
        int indice = tabuchi.nextInt();
        lista.remove(indice);

        System.out.println("\nSubstituindo o 6° elemento por 'novo'...");
        lista.set(5, "novo");

        System.out.println("\nExistem " + lista.size() + " elementos na lista");

        System.out.println("\nLista: " + lista);
    }
}