import java.util.Random;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("População das cidades");
        System.out.println("---------------------");
        Random aleatorio = new Random();
        int Codo = aleatorio.nextInt(300000, 600000);
        int Imperatriz = aleatorio.nextInt(1200000, 2000000);

        System.out.println("A população de Codó é de " + Codo + " pessoas");
        System.out.println("A população de Imperatriz é de " + Imperatriz + " pessoas");

        int i = 1;
        while (Codo <= Imperatriz) {
            Codo *= (0.04 / 100) + 1;
            Imperatriz *= (0.01 / 100) + 1;
            i++;
        }

        System.out.println("\nA população de Codó levou " + i + " anos para ultrapassar a população de Imperatriz");
        System.out.println("\nPopulação de Codó: " + Codo);
        System.out.println("População de Imperatriz: " + Imperatriz);
    }
}