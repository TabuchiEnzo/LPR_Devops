import java.util.InputMismatchException;
import java.util.Scanner;
// Criação da classe
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner tabuchi = new Scanner(System.in);
        Pessoa_ex4[] vetPessoa_ex4 = new Pessoa_ex4[5];

        String nome;
        double altura;
        boolean a = false;

        do {
            try {
                for (int cont = 0; cont < 5; cont++) {
                    System.out.println("\nDigite o nome da \033[93m" + (cont + 1) + "\033[m° pessoa: ");
                    nome = tabuchi.next();

                    System.out.println("Digite a altura: ");
                    altura = tabuchi.nextDouble();

                    vetPessoa_ex4[cont] = new Pessoa_ex4(nome, altura);
                }
                a = true;
            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números inteiros -> " + ime);
                tabuchi.nextLine();
            }
        } while (!a);

            for (int cont = 0; cont < 5; cont++) {
                System.out.println("\nNome da \033[93m" + (cont + 1) + "\033[m° pessoa é: \033[92m" + vetPessoa_ex4[cont].getNome() + "\033[m");

                System.out.println("Altura: \033[92m" + vetPessoa_ex4[cont].getAltura() + "\033[m");
            }
            double maior_altura = vetPessoa_ex4[0].getAltura();
            String maior_pessoa = vetPessoa_ex4[0].getNome();

            for (int cont = 1; cont < vetPessoa_ex4.length; cont++) {
                if (vetPessoa_ex4[cont].getAltura() > maior_altura) {
                    maior_altura = vetPessoa_ex4[cont].getAltura();
                    maior_pessoa = vetPessoa_ex4[cont].getNome();
                }
            }
            System.out.println("\nA maior altura é do(a) \033[92m" + maior_pessoa + "\033[m");
            System.out.println("Com a altura de: \033[92m" + maior_altura + "m\033[m");
    }
}