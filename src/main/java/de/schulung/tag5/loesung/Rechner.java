package de.schulung.tag5.loesung;

import java.util.ArrayList;
import java.util.List;

/**
 * Tag 5 - Musterloesung: Rechenlogik des Taschenrechners
 */
public class Rechner {

    private final List<String> verlauf = new ArrayList<>();

    public double addiere(double a, double b) {
        double ergebnis = a + b;
        verlauf.add(a + " + " + b + " = " + ergebnis);
        return ergebnis;
    }

    public double subtrahiere(double a, double b) {
        double ergebnis = a - b;
        verlauf.add(a + " - " + b + " = " + ergebnis);
        return ergebnis;
    }

    public double multipliziere(double a, double b) {
        double ergebnis = a * b;
        verlauf.add(a + " * " + b + " = " + ergebnis);
        return ergebnis;
    }

    public double dividiere(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt!");
        }
        double ergebnis = a / b;
        verlauf.add(a + " / " + b + " = " + ergebnis);
        return ergebnis;
    }

    public void zeigeVerlauf() {
        if (verlauf.isEmpty()) {
            System.out.println("Noch keine Berechnungen durchgefuehrt.");
            return;
        }
        System.out.println("--- Verlauf ---");
        for (String eintrag : verlauf) {
            System.out.println(eintrag);
        }
    }
}
