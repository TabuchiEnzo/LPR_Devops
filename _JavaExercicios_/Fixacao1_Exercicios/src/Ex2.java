import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\033[93m--------------------------------------------------\033[m");
        System.out.println("\033[92m          Figuras usando asteriscos \033[m");
        System.out.println("\033[93m--------------------------------------------------\033[m");
        Scanner input = new Scanner(System.in);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {};

        System.out.println("********* " + "   ***    "  + "    *    " + "     *     ");
        System.out.println("*       * " + "  *   *   "  + "   ***   " + "    * *    ");
        System.out.println("*       * " + " *     *  "  + "  ****** " + "   *   *   ");
        System.out.println("*       * " + " *     *  "  + "    *    " + "  *     *  ");
        System.out.println("*       * " + " *     *  "  + "    *    " + " *       * ");
        System.out.println("*       * " + " *     *  "  + "    *    " + "  *     *  ");
        System.out.println("*       * " + " *     *  "  + "    *    " + "   *   *   ");
        System.out.println("*       * " + "  *   *   "  + "    *    " + "    * *    ");
        System.out.println("********* " + "   ***    "  + "    *    " + "     *     ");
    }
}