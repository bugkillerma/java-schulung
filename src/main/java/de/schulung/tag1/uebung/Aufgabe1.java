package de.schulung.tag1.uebung;

import java.util.Scanner;

/**
 * Tag 1 - Uebung: Grundlagen
 *
 * Bearbeite alle TODOs. Kompilieren & starten (mit Maven):
 *   mvn compile
 *   mvn exec:java -Dexec.mainClass="de.schulung.tag1.uebung.Aufgabe1"
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------
        // Aufgabe 1: Begruessung
        // ---------------------------------------------------------
        // TODO: Frage nach dem Namen (String) und dem Alter (int).
        // TODO: Gib eine Begruessung aus, die zeigt, wie alt die Person
        //       in 5 Jahren sein wird.
        //       Beispiel: "Hallo Max, in 5 Jahren bist du 21 Jahre alt!"


        // ---------------------------------------------------------
        // Aufgabe 2: Rechteck berechnen
        // ---------------------------------------------------------
        // TODO: Frage nach Laenge und Breite eines Rechtecks (als double).
        // TODO: Berechne die Flaeche (laenge * breite).
        // TODO: Berechne den Umfang (2 * (laenge + breite)).
        // TODO: Gib beide Werte aus.


        // ---------------------------------------------------------
        // Bonus: Mehrwertsteuer berechnen
        // ---------------------------------------------------------
        // TODO: Frage nach einem Bruttobetrag (double).
        // TODO: Berechne, wie viel Mehrwertsteuer (19%) darin enthalten ist.
        //       Tipp: mwst = betrag - (betrag / 1.19)
        // TODO: Gib den Mehrwertsteuerbetrag aus.


        scanner.close();
    }
}
