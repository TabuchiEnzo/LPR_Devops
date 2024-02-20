import java.io.CharArrayReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaSequencialObjetos lista = new ListaSequencialObjetos(8);
        lista.inserir(new Pessoa("João", 1.75));
        lista.inserir(new Pessoa("Pedro", 1.82));
        lista.inserir(new Pessoa("Maria", 1.78));
        lista.inserir(new Pessoa("Joana", 1.55));
        lista.inserir(new Pessoa("Jorge", 1.71));

        Scanner tabuchi = new Scanner(System.in);
        boolean sair = false;

        do {
            System.out.println("\n\nDIGITE O QUE DESEJA FAZER: " +
                    "\n[ 1 ] MOSTRE A LISTA" +
                    "\n[ 2 ] MOSTRE O TAMANHO DA LISTA" +
                    "\n[ 3 ] MOSTRE QUANTOS ITENS TEM NA LISTA" +
                    "\n[ 4 ] ADICIONE ITENS NA LISTA" +
                    "\n[ 5 ] VERIFIQUE SE A LISTA ESTÁ VAZIA" +
                    "\n[ 6 ] REMOVA ITENS DA LISTA" +
                    "\n[ 0 ] SAIR");
            int esolha = tabuchi.nextInt();

            switch (esolha) {
                case 1 -> {
                    System.out.println(lista);
                    break;
                }
                case 2 -> {
                    System.out.println(lista.size());
                    break;
                }
                case 3 -> {
                    break;
                }
                case 4 -> {
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