public class Ex11 {
    public static int main (int decimal) {
        int resto, binario = 0, digito = 0;

        while (decimal > 0) {
            resto = decimal % 2;
            decimal = decimal / 2;
            binario += resto * Math.pow(10, digito);
            digito++;
        }
        return binario;
    }
}