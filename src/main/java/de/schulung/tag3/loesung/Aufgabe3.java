package de.schulung.tag3.loesung;

import java.util.Scanner;

/**
 * Tag 3 - Musterloesung: Methoden und Arrays
 */
public class Aufgabe3 {

    public static int quadriere(int zahl) {
        return zahl * zahl;
    }

    public static boolean istGerade(int zahl) {
        return zahl % 2 == 0;
    }

    public static int summe(int[] werte) {
        int summe = 0;
        for (int wert : werte) {
            summe += wert;
        }
        return summe;
    }

    public static double durchschnitt(int[] werte) {
        return (double) summe(werte) / werte.length;
    }

    public static int maximum(int[] werte) {
        int maximum = werte[0];
        for (int wert : werte) {
            if (wert > maximum) {
                maximum = wert;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5 zum Quadrat: " + quadriere(5));
        System.out.println("Ist 7 gerade? " + istGerade(7));
        System.out.println("Ist 8 gerade? " + istGerade(8));

        int[] zahlen = new int[10];
        System.out.println("Bitte gib 10 Zahlen ein:");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Zahl " + (i + 1) + ": ");
            zahlen[i] = scanner.nextInt();
        }

        System.out.println("Summe: " + summe(zahlen));
        System.out.println("Durchschnitt: " + durchschnitt(zahlen));
        System.out.println("Maximum: " + maximum(zahlen));

        scanner.close();
    }
}
