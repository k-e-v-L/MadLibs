import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Game name is Mad libs
        Sõnamäng, keeleoskuse arendamiseks
         */

        Scanner scanner = new Scanner(System.in);

        String sõna1;
        String sõna2;
        String sõna3;
        String sõna4;
        double vanus;

        System.out.print("Kirjuta lahtrisse linna nimi. ");
        sõna1 = scanner.nextLine();
        System.out.print("Läksin täna " + sõna1 + " loomaaeda. ");
        System.out.print("Kirjuta, millist looma sa täna nägid loomaaias. ");
        sõna2 = scanner.nextLine();
        System.out.print("Loomaaias nägin ma " + sõna2 + ".");
        System.out.print("Kirjuta, mida ta sõi. ");
        sõna3 = scanner.nextLine();
        System.out.print("Ta sõi " + sõna3 + ".");
        System.out.print("Kirjuta tema hüüdnimi. ");
        sõna4 = scanner.nextLine();
        System.out.print("Kirjuta tema vanus ");
        vanus = scanner.nextDouble();
        System.out.print("Tema hüüdnimi oli " + sõna4 + " ja vanus oli " + vanus + ".");

        scanner.close();
    }
}