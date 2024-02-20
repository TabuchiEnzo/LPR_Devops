import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        // Criando a matriz
        int[][] matriz = {
                {6, 2},
                {4, 9}};

        // Criando a expressão
        String expressao = "{[34+(22-40)]/10}";

        // Exercício 1
        System.out.println("=====EXERCÍCIO 1=====");

        // Mostrando a matriz
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        if (verificarPares(matriz)) {
            System.out.println("\033[92mA matriz contém APENAS números pares!\033[m");
        } else {
            System.out.println("\033[94mA matriz contém números pares e ímpares!\033[m");
        }

        // Exercício 2
        System.out.println("\n====EXERCÍCIO 2====");

        // Mostrando a expressão
        System.out.println("Expressão: " + expressao);

        if (verificarCaracterBalan(expressao)) {
            System.out.println("\033[92mA expressão matemática está balanceada!\033[m");
        } else if (!verificarCaracterBalan(expressao)) {
            System.out.println("\033[91mA expressão matemática NÃO está balanceada!\033[m");
        }

    }

    // Criando os métodos para a Main
    public static boolean verificarPares (int matriz[][]) {
        int qntPares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    qntPares += 1;
                }
            }
        }
        if (qntPares == 4) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean verificarCaracterBalan(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char caracter : expressao.toCharArray()) {
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                pilha.push(caracter);
            } else if (caracter == '}' || caracter == ']' || caracter == ')') {
                if (pilha.isEmpty() || !ePar(pilha.pop(), caracter)) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
    private static boolean ePar(char caracteAbrir, char caracteFechar) {
        return (caracteAbrir == '{' && caracteFechar == '}') ||
                (caracteAbrir == '[' && caracteFechar == ']') ||
                (caracteAbrir == '(' && caracteFechar == ')');
    }
}