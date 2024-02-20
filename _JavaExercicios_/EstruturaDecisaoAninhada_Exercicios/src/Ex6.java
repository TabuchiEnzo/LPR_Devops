import java.util.Scanner;
public class Ex6{
    public static void main(String[]args){
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m           Faixa Etária de um ser vivo            \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = input.nextInt();

        System.out.println("\033[93m-------------------------------------------------\033[m");

        System.out.println("Olha, sua faixa etária é considerada como\033[92m" + Verificador(idade) + "\033[m");
    }
    public static String Verificador(int idade){
        if (idade < 2){
            return "Bebê";

        } else if(idade >= 2 && idade <= 10){
            return "Criança";

        } else if (idade > 11 && idade <= 17){
            return "Adolescente";

        } else if (idade >= 18 && idade <= 64){
            return "Adulto";

        } else if (idade >= 65){
            return "Idoso";

        } else {
            return "Algo de errado está errado";
        }
    }
}