package de.schulung.tag5.uebung;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tag 5 - Uebung: Taschenrechner (Hauptprogramm)
 *
 * Kompilieren & starten (mit Maven):
 *   mvn compile
 *   mvn exec:java -Dexec.mainClass="de.schulung.tag5.uebung.Taschenrechner"
 */
public class Taschenrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rechner rechner = new Rechner();

        // TODO: Baue eine Schleife (z.B. while (true)), die:
        //       1. Das Menue anzeigt (siehe README.md fuer ein Beispiel)
        //       2. Die Auswahl (int) einliest
        //       3. Mit switch/case je nach Auswahl reagiert:
        //          1 -> addiere: Zahlen abfragen, rechner.addiere() aufrufen,
        //               Ergebnis ausgeben
        //          2 -> subtrahiere: analog
        //          3 -> multipliziere: analog
        //          4 -> dividiere: analog, dabei IllegalArgumentException
        //               abfangen (Division durch 0!)
        //          5 -> rechner.zeigeVerlauf() aufrufen
        //          6 -> Schleife mit break beenden und "Auf Wiedersehen!"
        //               ausgeben
        //
        //       Denk daran, Eingabefehler (z.B. Buchstaben statt Zahlen)
        //       mit try/catch (InputMismatchException) abzufangen, damit
        //       das Programm nicht abstuerzt!


        scanner.close();
    }
}
