package de.schulung.tag4.uebung;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tag 4 - Uebung: Objektorientierung und Fehlerbehandlung
 */
public class Aufgabe4 {

    // ---------------------------------------------------------
    // Aufgabe 1: Klasse "Bruch"
    // ---------------------------------------------------------
    // TODO: Erstelle eine (innere oder separate) Klasse "Bruch" mit:
    //       - private int zaehler
    //       - private int nenner
    //       - Konstruktor Bruch(int zaehler, int nenner)
    //       - Methode addiere(Bruch anderer), die einen neuen Bruch
    //         zurueckgibt (Tipp: a/b + c/d = (a*d + c*b) / (b*d))
    //       - Methode toString(), die den Bruch als "zaehler/nenner"
    //         zurueckgibt


    // ---------------------------------------------------------
    // Aufgabe 2: Division mit Fehlerbehandlung
    // ---------------------------------------------------------
    // TODO: Schreibe eine Methode teile(double a, double b), die eine
    //       IllegalArgumentException wirft, wenn b == 0 ist, und sonst
    //       a / b zurueckgibt.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Erzeuge zwei Bruch-Objekte, addiere sie und gib das
        //       Ergebnis mit toString() aus.


        // TODO: Frage zwei Zahlen ab und nutze teile(a, b) in einem
        //       try/catch-Block. Fange sowohl IllegalArgumentException
        //       (b == 0) als auch InputMismatchException (keine gueltige
        //       Zahl eingegeben) ab und gib eine passende Fehlermeldung
        //       aus.


        scanner.close();
    }
}
