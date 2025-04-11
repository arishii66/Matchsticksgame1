import java.util.Scanner;


public class Eingabe {
    private static Scanner scanner = new Scanner(System.in);

    public static int leseZahl () {

        while (true) {
            Ausgabe.zahlEingeben();
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                Ausgabe.keineZahl();
            }

        }

    }

    public static void zahlOutofBounds () {
        System.out.println("---------------------------------");
        System.out.println(" Die eingegebene Zahl liegt außerhalb des erlaubten Bereichs!");
    }

    public static int leseMatchsticks () {
        while(true) {
            int zahl = leseZahl();
            if (zahl >= 1 && zahl <= 3) {
                return zahl;
            } else {
                Ausgabe.zahlOutofBounds();
            }
        }
    }



}
