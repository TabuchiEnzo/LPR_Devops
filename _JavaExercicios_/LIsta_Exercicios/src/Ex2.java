import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        LinkedList<Pessoa> lista = new LinkedList<>();
        String nome = null;
        int idade = 0;

        System.out.println("Digite 20 pessoa para serem inseridos na lista...");
        for (int i = 0; i < 20; i++) {
            System.out.print("\nNome: ");
            nome = tabuchi.next();
            System.out.print("Idade: ");
            idade = tabuchi.nextInt();

            lista.addLast(new Pessoa(nome, idade));
        }

        System.out.println("\nDigite uma Pessoa para ser inserida no início da lista...");
        System.out.print("Nome: ");
        String nome2 = tabuchi.next();

        System.out.print("Idade: ");
        int idade2 = tabuchi.nextInt();

        lista.addFirst(new Pessoa(nome2, idade2));

        System.out.println("\nDigite uma Pessoa para ser inserida na 10° posição da lista...");
        System.out.print("Nome: ");
        String nome3 = tabuchi.next();

        System.out.print("Idade: ");
        int idade3 = tabuchi.nextInt();

        lista.add(9, new Pessoa(nome3, idade3));

        System.out.println("\nDigite uma Pessoa para verificar se ele existe na lista...");
        System.out.print("Nome: ");
        String nome4 = tabuchi.next();

        System.out.print("Idade: ");
        int idade4 = tabuchi.nextInt();

        lista.contains(new Pessoa(nome4, idade4));

        System.out.print("\nDigite um índice em verificaremos qual Pessoa temos neste índice: ");
        int indice = tabuchi.nextInt();

        lista.get(indice);

        System.out.println("\nPrimeira Pessoa da lista: " + lista.getFirst());
        System.out.println("Última Pessoa da lista: " + lista.getLast());

        System.out.println("\nDigite um índice e uma Pessoa para inserirmos na lista...");
        System.out.print("Índice: ");
        int indice2 = tabuchi.nextInt();

        System.out.print("Nome: ");
        String nome5 = tabuchi.next();

        System.out.print("Idade: ");
        int idade5 = tabuchi.nextInt();

        lista.set(indice2, new Pessoa(nome5, idade5));

        System.out.println("Existem " + lista.size() + " Pessoas na lista");

        System.out.println("Lista: " + lista);
        System.out.println("Excluindo o primeiro e o último elementos da lista...");
        lista.removeFirst();
        lista.removeLast();
        System.out.println("Lista: " + lista);
    }
}