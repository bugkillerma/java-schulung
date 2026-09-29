package de.schulung.tag2.loesung;

import java.util.Scanner;

/**
 * Tag 2 - Musterloesung: Kontrollstrukturen
 */
public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------
        // Aufgabe 1: Notenrechner
        // ---------------------------------------------------------
        System.out.print("Punktzahl (0-100): ");
        int punkte = scanner.nextInt();

        if (punkte >= 90) {
            System.out.println("Note: Sehr gut");
        } else if (punkte >= 75) {
            System.out.println("Note: Gut");
        } else if (punkte >= 60) {
            System.out.println("Note: Befriedigend");
        } else if (punkte >= 50) {
            System.out.println("Note: Ausreichend");
        } else {
            System.out.println("Note: Nicht bestanden");
        }

        // ---------------------------------------------------------
        // Aufgabe 2: Einmaleins
        // ---------------------------------------------------------
        System.out.print("Fuer welche Zahl soll das Einmaleins ausgegeben werden? ");
        int zahl = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(zahl + " x " + i + " = " + (zahl * i));
        }

        // ---------------------------------------------------------
        // Aufgabe 3: Zahlenraten
        // ---------------------------------------------------------
        int zufallszahl = (int) (Math.random() * 100) + 1;
        int versuch;
        int anzahlVersuche = 0;

        do {
            System.out.print("Rate eine Zahl zwischen 1 und 100: ");
            versuch = scanner.nextInt();
            anzahlVersuche++;

            if (versuch < zufallszahl) {
                System.out.println("Die gesuchte Zahl ist groesser!");
            } else if (versuch > zufallszahl) {
                System.out.println("Die gesuchte Zahl ist kleiner!");
            } else {
                System.out.println("Richtig! Du hast " + anzahlVersuche + " Versuche gebraucht.");
            }
        } while (versuch != zufallszahl);

        scanner.close();
    }
}
