import java.util.Scanner;
public class Ex4 {
    public static void main (String[] args) {
        System.out.println("\033[93m-------------------------------------------------\033[m");
        System.out.println("\033[92m              Pessoa a doar sangue               \033[m");
        System.out.println("\033[93m-------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        double peso_pessoa;

        System.out.println("Digite o nome da pessoa que deseja verificar se pode doar sangue: ");
        String nome_pessoa = input.nextLine();

        System.out.println("Digite o sexo de " + nome_pessoa + " [F/M]: ");
        String genero_pessoa = input.nextLine();

        System.out.printf("Digite o peso de " + nome_pessoa + ": ");
        peso_pessoa = input.nextDouble();

        System.out.println("Olha... o(a)" + nome_pessoa + Verificador(genero_pessoa, peso_pessoa) + " a doar sangue");
    }
    public static String Verificador (String genero_pessoa, double peso_pessoa) {

        if (genero_pessoa.equals("M") && peso_pessoa >= 50) {
            return " está apto";
        } if (genero_pessoa.equals("F") && peso_pessoa >= 40) {
            return " está apta";
        } if (genero_pessoa.equals("M") && peso_pessoa < 50) {
            return " não está apto";
        } if (genero_pessoa.equals("F") && peso_pessoa < 40) {
            return " não está apta";
        } else {
            return "talvez esteja apto(a)";
        }
    }
}