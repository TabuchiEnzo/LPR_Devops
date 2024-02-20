import java.util.Scanner;

public class Ex6 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int cont = 0;

        do {
            System.out.println("Digite um número positivo, e um numero negativo encerra a digitação:");
            numero = input.nextInt();
            cont++;
        } while (numero >= 0);

        int media = numero/cont;
        System.out.println("\nA média dos némeros digitados é de: "+ media + "" +
                "\nForam digitados " + cont + " números." );
    }
}