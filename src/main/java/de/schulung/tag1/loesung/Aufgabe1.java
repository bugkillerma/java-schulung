package de.schulung.tag1.loesung;

import java.util.Scanner;

/**
 * Tag 1 - Musterloesung: Grundlagen
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------
        // Aufgabe 1: Begruessung
        // ---------------------------------------------------------
        System.out.print("Wie heisst du? ");
        String name = scanner.nextLine();

        System.out.print("Wie alt bist du? ");
        int alter = scanner.nextInt();
        scanner.nextLine(); // Zeilenumbruch nach nextInt() "verschlucken"

        int alterInFuenfJahren = alter + 5;
        System.out.println("Hallo " + name + ", in 5 Jahren bist du "
                + alterInFuenfJahren + " Jahre alt!");

        // ---------------------------------------------------------
        // Aufgabe 2: Rechteck berechnen
        // ---------------------------------------------------------
        System.out.print("Laenge des Rechtecks (in cm): ");
        double laenge = scanner.nextDouble();

        System.out.print("Breite des Rechtecks (in cm): ");
        double breite = scanner.nextDouble();

        double flaeche = laenge * breite;
        double umfang = 2 * (laenge + breite);

        System.out.println("Flaeche: " + flaeche + " cm^2");
        System.out.println("Umfang: " + umfang + " cm");

        // ---------------------------------------------------------
        // Bonus: Mehrwertsteuer berechnen
        // ---------------------------------------------------------
        System.out.print("Bruttobetrag (in Euro): ");
        double betrag = scanner.nextDouble();

        double nettobetrag = betrag / 1.19;
        double mwst = betrag - nettobetrag;

        System.out.println("Enthaltene Mehrwertsteuer: " + mwst + " Euro");

        scanner.close();
    }
}
