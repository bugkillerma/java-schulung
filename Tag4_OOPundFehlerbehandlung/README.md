# Tag 4 – Objektorientierung & Fehlerbehandlung

## Lernziele

- Du verstehst die Grundidee der Objektorientierung: Klassen und Objekte.
- Du kannst eine eigene Klasse mit Attributen, Konstruktor und Methoden
  schreiben.
- Du kennst Kapselung (`private`, Getter/Setter).
- Du kannst mit `try`/`catch` auf Fehler (Exceptions) reagieren und eigene
  Exceptions werfen.

## 1. Klassen und Objekte

Eine **Klasse** ist ein Bauplan. Ein **Objekt** ist eine konkrete Instanz
davon.

```java
public class Hund {
    // Attribute (Eigenschaften)
    private String name;
    private int alter;

    // Konstruktor – wird beim Erzeugen eines Objekts aufgerufen
    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Methode
    public void bellen() {
        System.out.println(name + " sagt: Wuff!");
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }
}
```

Objekt erzeugen und benutzen:

```java
public class Main {
    public static void main(String[] args) {
        Hund hund1 = new Hund("Rex", 3);
        Hund hund2 = new Hund("Bella", 5);

        hund1.bellen();
        System.out.println(hund2.getName() + " ist " + hund2.getAlter() + " Jahre alt.");
    }
}
```

## 2. Kapselung (`private` + Getter/Setter)

Attribute werden meist `private` gemacht, damit sie nicht direkt von außen
verändert werden können. Zugriff erfolgt über öffentliche Methoden:

```java
public class Konto {
    private double kontostand;

    public Konto(double startguthaben) {
        this.kontostand = startguthaben;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
        } else {
            System.out.println("Nicht genug Guthaben!");
        }
    }
}
```

## 3. Fehlerbehandlung mit `try`/`catch`

Manche Fehler passieren erst zur Laufzeit, z.B. Division durch 0 oder eine
ungültige Eingabe. Diese Fehler heißen **Exceptions**.

```java
try {
    int ergebnis = 10 / 0; // wirft ArithmeticException
    System.out.println(ergebnis);
} catch (ArithmeticException e) {
    System.out.println("Fehler: Division durch 0 ist nicht erlaubt!");
}
```

Man kann auch mehrere `catch`-Blöcke verwenden und einen `finally`-Block,
der immer ausgeführt wird:

```java
Scanner scanner = new Scanner(System.in);
try {
    System.out.print("Gib eine Zahl ein: ");
    int zahl = scanner.nextInt();
    System.out.println("Du hast " + zahl + " eingegeben.");
} catch (InputMismatchException e) {
    System.out.println("Das war keine gueltige Zahl!");
} finally {
    System.out.println("Eingabe abgeschlossen.");
}
```

## 4. Eigene Exceptions werfen

Mit `throw` kann man selbst eine Exception auslösen, z.B. um ungültige
Eingaben in einer eigenen Methode abzufangen:

```java
public static double teile(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt!");
    }
    return a / b;
}
```

Aufruf mit `try`/`catch`:

```java
try {
    double ergebnis = teile(10, 0);
    System.out.println(ergebnis);
} catch (IllegalArgumentException e) {
    System.out.println("Fehler: " + e.getMessage());
}
```

## Zusammenfassung

- Eine Klasse beschreibt Attribute (Eigenschaften) und Methoden
  (Verhalten) eines Objekts.
- `private` + Getter/Setter schützen Attribute vor unerlaubtem Zugriff.
- `try`/`catch` fängt Laufzeitfehler ab, `throw` löst eigene Fehler aus.

---

## Hausaufgabe

Öffne
`src/main/java/de/schulung/tag4/uebung/Aufgabe4.java`
und bearbeite alle `// TODO`-Stellen:

1. Erstelle eine Klasse `Bruch` mit den privaten Attributen `zaehler` und
   `nenner` (beide `int`), einem Konstruktor und den Methoden:
   - `addiere(Bruch anderer)` – gibt einen neuen `Bruch` zurück (Summe)
   - `toString()` – gibt den Bruch als Text zurück, z.B. `"3/4"`
2. Schreibe eine Methode `teile(double a, double b)`, die eine
   `IllegalArgumentException` wirft, wenn `b == 0` ist.
3. Nutze in der `main`-Methode `try`/`catch`, um Benutzereingaben (z.B. für
   eine Division) sicher zu verarbeiten – auch wenn ungültige Werte oder
   Buchstaben statt Zahlen eingegeben werden (`InputMismatchException`).

Kompilieren & starten (aus dem Projekt-Hauptordner):

```
mvn compile
mvn exec:java -Dexec.mainClass="de.schulung.tag4.uebung.Aufgabe4"
```

Vergleiche danach mit
`src/main/java/de/schulung/tag4/loesung/Aufgabe4.java`.
