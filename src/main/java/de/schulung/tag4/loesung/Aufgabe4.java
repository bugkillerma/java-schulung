package de.schulung.tag4.loesung;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tag 4 - Musterloesung: Objektorientierung und Fehlerbehandlung
 */
public class Aufgabe4 {

    // ---------------------------------------------------------
    // Aufgabe 1: Klasse "Bruch"
    // ---------------------------------------------------------
    static class Bruch {
        private final int zaehler;
        private final int nenner;

        public Bruch(int zaehler, int nenner) {
            this.zaehler = zaehler;
            this.nenner = nenner;
        }

        public Bruch addiere(Bruch anderer) {
            int neuerZaehler = this.zaehler * anderer.nenner + anderer.zaehler * this.nenner;
            int neuerNenner = this.nenner * anderer.nenner;
            return new Bruch(neuerZaehler, neuerNenner);
        }

        @Override
        public String toString() {
            return zaehler + "/" + nenner;
        }
    }

    // ---------------------------------------------------------
    // Aufgabe 2: Division mit Fehlerbehandlung
    // ---------------------------------------------------------
    public static double teile(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bruch bruch1 = new Bruch(1, 2);
        Bruch bruch2 = new Bruch(1, 3);
        Bruch summe = bruch1.addiere(bruch2);
        System.out.println(bruch1 + " + " + bruch2 + " = " + summe);

        try {
            System.out.print("Erste Zahl: ");
            double a = scanner.nextDouble();
            System.out.print("Zweite Zahl: ");
            double b = scanner.nextDouble();

            double ergebnis = teile(a, b);
            System.out.println("Ergebnis: " + ergebnis);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Fehler: Bitte gib eine gueltige Zahl ein!");
        } finally {
            System.out.println("Berechnung abgeschlossen.");
        }

        scanner.close();
    }
}
