import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ausgabe {

    public static void zahlEingeben() {
        System.out.println("---------------------------------");
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }

    public static void keineZahl () {
        System.out.println("---------------------------------");
        System.out.println(" Es wurde keine Zahl eingegeben!");
    }

    public static void zahlOutofBounds () {
        System.out.println("---------------------------------");
        System.out.println(" Die eingegebene Zahl liegt außerhalb des erlaubten Bereichs!");
    }

    public static void menschGewinnt () {
        //Print if computer has to take the last matchstick
        System.out.println("---------------------------------");
        System.out.println("Mensch gewinnt!");
    }

    public static void computerGewinnt () {
        System.out.println("---------------------------------");
        System.out.println("Computer gewinnt!");
    }

    public static void zugNichtMoeglich () {
        //print if users tries to take more matchsticks than available
        System.out.println("---------------------------------");
        System.out.println("Zug nicht möglich!");
    }

    public static void spielstand (int anzahl) {
        System.out.println("---------------------------------");
        System.out.println("Es befinden sich noch " + anzahl + " "
                + (anzahl == 1 ? "Holz" : "Hoelzer") + " auf dem Tisch.");

    }

    public static void menschZug (int gezogen, int verbleibend) {
        System.out.println("---------------------------------");
        System.out.println("Sie nehmen " + gezogen + " " + (gezogen == 1 ? "Holz" : "Hoelzer") +
                " und es bleiben noch " + verbleibend + " " + (verbleibend == 1 ? "Holz" : "Hoelzer") + " uebrig.");
    }



    public static void computerZug (int gezogen, int verbleibend) {
        System.out.println("---------------------------------");
        System.out.println("Der Computer nimmt " + gezogen + " " + (gezogen == 1 ? "Holz" : "Hoelzer") +
                " und es bleiben noch " + verbleibend + " " + (verbleibend == 1 ? "Holz" : "Hoelzer") + " uebrig.");

    }
}
