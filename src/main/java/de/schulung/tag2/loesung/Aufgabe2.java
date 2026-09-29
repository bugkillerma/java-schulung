package de.schulung.tag2.loesung;

import java.util.Scanner;

/**
 * Tag 2 - Musterloesung: Kontrollstrukturen
 */
public class Aufgabe2 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                continue; // 5 wird übersprungen
            }
            if (i == 8) {
                break; // Schleife stoppt bei 8
            }
            System.out.println(i);
        }
        int num = 16;
        while(num <=15){
            System.out.println(num);
            //num = num +1;
            num++;
        }

//        do {
//            System.out.println(num);
//            num++;
//        } while (num <= 15);

        Scanner scanner = new Scanner(System.in);

        int wochentag = 7;
        String name;

        switch (wochentag) {
            case 1 -> name = "Montag";
            case 2 -> name = "Dienstag";
            case 3 -> name = "Mittwoch";
            case 4 -> name = "Donnerstag";
            case 5 -> name = "Freitag";
            default -> name = "Wochenende";
        }

        System.out.println(name);
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
        //int zahl = scanner.nextInt();

        for (int i = 20; i <= 40; i=i+5) {
            System.out.println(i);
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
