# Tag 3 – Methoden und Arrays

## Lernziele

- Du kannst eigene Methoden mit Parametern und Rückgabewerten schreiben.
- Du verstehst den Unterschied zwischen `void`-Methoden und Methoden mit
  Rückgabewert.
- Du kannst Arrays deklarieren, befüllen und durchlaufen.
- Du kannst einfache Aufgaben wie Summe, Durchschnitt und Maximum auf einem
  Array berechnen.

## 1. Warum Methoden?

Methoden helfen, Code in wiederverwendbare, benannte Blöcke aufzuteilen –
das nennt man auch "Modularisierung". Statt Code zu kopieren, ruft man
einfach die Methode erneut auf.

## 2. Methoden ohne Rückgabewert (`void`)

```java
public static void begruesse(String name) {
    System.out.println("Hallo " + name + "!");
}

public static void main(String[] args) {
    begruesse("Anna");
    begruesse("Ben");
}
```

- `static` bedeutet, die Methode gehört zur Klasse, nicht zu einem Objekt
  (mehr dazu an Tag 4).
- `void` bedeutet: die Methode gibt keinen Wert zurück.
- `String name` ist ein **Parameter** – ein Wert, den man der Methode
  übergibt.

## 3. Methoden mit Rückgabewert

```java
public static int addiere(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    int ergebnis = addiere(3, 4);
    System.out.println(ergebnis); // 7
}
```

- Statt `void` steht hier der Typ des Rückgabewerts (`int`).
- `return` beendet die Methode und liefert den Wert zurück.

## 4. Methoden-Überladung (Overloading)

Man kann mehrere Methoden mit demselben Namen haben, solange sich die
Parameter unterscheiden:

```java
public static int addiere(int a, int b) {
    return a + b;
}

public static double addiere(double a, double b) {
    return a + b;
}
```

## 5. Arrays

Ein Array speichert mehrere Werte **desselben Typs** in einer festen
Größe.

```java
int[] zahlen = {10, 20, 30, 40, 50};
System.out.println(zahlen[0]); // 10 (Zugriff startet bei Index 0!)
System.out.println(zahlen.length); // 5 (Anzahl der Elemente)
```

Array mit fester Größe, aber ohne Werte anlegen:

```java
int[] noten = new int[5]; // 5 Plaetze, alle mit 0 vorbefuellt
noten[0] = 90;
noten[1] = 75;
```

### Array mit einer Schleife durchlaufen

```java
int[] zahlen = {10, 20, 30, 40, 50};

for (int i = 0; i < zahlen.length; i++) {
    System.out.println("Index " + i + ": " + zahlen[i]);
}

// Alternative: for-each-Schleife (einfacher, wenn man den Index nicht braucht)
for (int zahl : zahlen) {
    System.out.println(zahl);
}
```

## 6. Typische Array-Aufgaben

```java
int[] zahlen = {4, 8, 15, 16, 23, 42};

int summe = 0;
for (int zahl : zahlen) {
    summe += zahl;
}
double durchschnitt = (double) summe / zahlen.length;

int maximum = zahlen[0];
for (int zahl : zahlen) {
    if (zahl > maximum) {
        maximum = zahl;
    }
}
```

## Zusammenfassung

- Methoden machen Code wiederverwendbar und übersichtlich.
- `void` = kein Rückgabewert, sonst gibt der Typ vor der Methode an, was
  zurückgegeben wird.
- Arrays speichern mehrere Werte gleichen Typs, Zugriff über `[index]`,
  Index beginnt bei `0`.

---

## Hausaufgabe

Öffne
`src/main/java/de/schulung/tag3/uebung/Aufgabe3.java`
und bearbeite alle `// TODO`-Stellen:

1. Schreibe eine Methode `quadriere(int zahl)`, die eine Zahl quadriert
   zurückgibt.
2. Schreibe eine Methode `istGerade(int zahl)`, die `true` zurückgibt, wenn
   die Zahl gerade ist (Tipp: `zahl % 2 == 0`).
3. Fülle ein `int`-Array mit 10 Zahlen (frage sie über `Scanner` ab oder
   nutze feste Werte) und schreibe Methoden, die:
   - die **Summe** aller Zahlen berechnen,
   - den **Durchschnitt** berechnen,
   - das **Maximum** finden.
4. Gib alle Ergebnisse in der `main`-Methode aus.

Kompilieren & starten (aus dem Projekt-Hauptordner):

```
mvn compile
mvn exec:java -Dexec.mainClass="de.schulung.tag3.uebung.Aufgabe3"
```

Vergleiche danach mit
`src/main/java/de/schulung/tag3/loesung/Aufgabe3.java`.
