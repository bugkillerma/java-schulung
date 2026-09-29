package de.schulung.tag5.loesung;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tag 5 - Musterloesung: Taschenrechner (Hauptprogramm)
 *
 * Kompilieren & starten (mit Maven):
 *   mvn compile
 *   mvn exec:java -Dexec.mainClass="de.schulung.tag5.loesung.Taschenrechner"
 *
 * Oder als ausfuehrbares Jar:
 *   mvn package
 *   java -jar target/java-schulung.jar
 */
public class Taschenrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rechner rechner = new Rechner();

        while (true) {
            zeigeMenue();

            int auswahl;
            try {
                System.out.print("Auswahl: ");
                auswahl = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bitte gib eine Zahl zwischen 1 und 6 ein!");
                scanner.nextLine(); // ungueltige Eingabe verwerfen
                continue;
            }

            if (auswahl == 6) {
                System.out.println("Auf Wiedersehen!");
                break;
            }

            if (auswahl == 5) {
                rechner.zeigeVerlauf();
                continue;
            }

            if (auswahl < 1 || auswahl > 4) {
                System.out.println("Ungueltige Auswahl. Bitte waehle 1-6.");
                continue;
            }

            try {
                System.out.print("Erste Zahl: ");
                double a = scanner.nextDouble();
                System.out.print("Zweite Zahl: ");
                double b = scanner.nextDouble();

                double ergebnis = switch (auswahl) {
                    case 1 -> rechner.addiere(a, b);
                    case 2 -> rechner.subtrahiere(a, b);
                    case 3 -> rechner.multipliziere(a, b);
                    case 4 -> rechner.dividiere(a, b);
                    default -> throw new IllegalStateException("Unerwartete Auswahl: " + auswahl);
                };

                System.out.println("Ergebnis: " + ergebnis);
            } catch (InputMismatchException e) {
                System.out.println("Fehler: Bitte gib gueltige Zahlen ein!");
                scanner.nextLine(); // ungueltige Eingabe verwerfen
            } catch (IllegalArgumentException e) {
                System.out.println("Fehler: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static void zeigeMenue() {
        System.out.println();
        System.out.println("=== Taschenrechner ===");
        System.out.println("1) Addieren");
        System.out.println("2) Subtrahieren");
        System.out.println("3) Multiplizieren");
        System.out.println("4) Dividieren");
        System.out.println("5) Verlauf anzeigen");
        System.out.println("6) Beenden");
    }
}
