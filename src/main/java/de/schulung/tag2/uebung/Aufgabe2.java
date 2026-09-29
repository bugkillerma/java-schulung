package de.schulung.tag2.uebung;

import java.util.Scanner;

/**
 * Tag 2 - Uebung: Kontrollstrukturen
 */
public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------
        // Aufgabe 1: Notenrechner
        // ---------------------------------------------------------
        // TODO: Frage eine Punktzahl (0-100, int) ab.
        // TODO: Gib mit if/else if/else die passende Note aus:
        //       >= 90 -> "Sehr gut"
        //       >= 75 -> "Gut"
        //       >= 60 -> "Befriedigend"
        //       >= 50 -> "Ausreichend"
        //       sonst -> "Nicht bestanden"


        // ---------------------------------------------------------
        // Aufgabe 2: Einmaleins
        // ---------------------------------------------------------
        // TODO: Frage eine Zahl (int) ab.
        // TODO: Gib mit einer for-Schleife das kleine Einmaleins dieser
        //       Zahl aus (1x bis 10x), z.B.:
        //       "5 x 1 = 5"
        //       "5 x 2 = 10"
        //       ...


        // ---------------------------------------------------------
        // Aufgabe 3: Zahlenraten
        // ---------------------------------------------------------
        // TODO: Erzeuge eine Zufallszahl zwischen 1 und 100:
        //       int zufallszahl = (int) (Math.random() * 100) + 1;
        // TODO: Lass die Nutzerin/den Nutzer in einer do-while-Schleife
        //       raten. Gib nach jedem Versuch aus, ob die gesuchte Zahl
        //       groesser oder kleiner ist. Wiederhole, bis richtig geraten
        //       wurde.


        scanner.close();
    }
}
