# Tag 2 – Kontrollstrukturen

## Lernziele

- Du kannst Entscheidungen mit `if`, `else if` und `else` treffen.
- Du kennst Vergleichs- und logische Operatoren.
- Du kannst `switch`-Anweisungen verwenden.
- Du kannst Schleifen (`for`, `while`, `do-while`) einsetzen, um Code zu
  wiederholen.

## 1. Vergleichsoperatoren

| Operator | Bedeutung          |
|----------|--------------------|
| `==`     | gleich             |
| `!=`     | ungleich           |
| `>`      | größer als         |
| `<`      | kleiner als        |
| `>=`     | größer oder gleich |
| `<=`     | kleiner oder gleich|

⚠️ **Achtung:** Bei `String`-Vergleichen nutzt man **nicht** `==`, sondern
`.equals(...)`:

```java
String antwort = "ja";
if (antwort.equals("ja")) {
    System.out.println("Alles klar!");
}
```

## 2. Logische Operatoren

| Operator | Bedeutung | Beispiel                  |
|----------|-----------|----------------------------|
| `&&`     | UND       | `alter >= 16 && hatAusweis`|
| `\|\|`   | ODER      | `istFeiertag \|\| istSonntag` |
| `!`      | NICHT     | `!istFertig`               |

## 3. `if` / `else if` / `else`

```java
int note = 2;

if (note == 1) {
    System.out.println("Sehr gut!");
} else if (note <= 3) {
    System.out.println("Gut gemacht.");
} else if (note <= 4) {
    System.out.println("Bestanden.");
} else {
    System.out.println("Nicht bestanden.");
}
```

## 4. `switch`-Anweisung

Eine Alternative zu vielen `else if`, wenn man einen Wert mit mehreren
festen Möglichkeiten vergleicht:

```java
int wochentag = 3;
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
```

## 5. Schleifen

### `for`-Schleife

Wird benutzt, wenn man die Anzahl der Wiederholungen vorher kennt:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("Zahl: " + i);
}
```

- `int i = 1` – Startwert
- `i <= 10` – Bedingung, solange wiederholt wird
- `i++` – was nach jedem Durchlauf passiert (hier: `i` wird um 1 erhöht)

### `while`-Schleife

Wird benutzt, wenn man die Anzahl der Wiederholungen nicht kennt, sondern
nur eine Bedingung hat:

```java
int zahl = 1;
while (zahl <= 5) {
    System.out.println(zahl);
    zahl++;
}
```

### `do-while`-Schleife

Wird mindestens einmal ausgeführt, auch wenn die Bedingung von Anfang an
falsch ist:

```java
int eingabe;
do {
    System.out.print("Gib eine Zahl zwischen 1 und 10 ein: ");
    eingabe = scanner.nextInt();
} while (eingabe < 1 || eingabe > 10);
```

## 6. `break` und `continue`

- `break` beendet die Schleife sofort.
- `continue` überspringt den restlichen Durchlauf und geht direkt zum
  nächsten.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue; // 5 wird übersprungen
    }
    if (i == 8) {
        break; // Schleife stoppt bei 8
    }
    System.out.println(i);
}
```

## Zusammenfassung

- `if`/`else if`/`else` für Entscheidungen, `switch` für viele feste Fälle.
- `&&`, `||`, `!` verknüpfen Bedingungen.
- `for` bei bekannter Anzahl an Wiederholungen, `while`/`do-while` bei
  unbekannter Anzahl.

---

## Hausaufgabe

Öffne
`src/main/java/de/schulung/tag2/uebung/Aufgabe2.java`
und bearbeite alle `// TODO`-Stellen:

1. **Notenrechner:** Frage eine Punktzahl (0–100) ab und gib mit `if`/`else`
   die passende Schulnote aus (z.B. ≥90 = "Sehr gut", ≥75 = "Gut", ≥60 =
   "Befriedigend", ≥50 = "Ausreichend", sonst "Nicht bestanden").
2. **Einmaleins:** Frage eine Zahl ab und gib mit einer `for`-Schleife das
   kleine Einmaleins dieser Zahl aus (1x bis 10x).
3. **Zahlenraten:** Erzeuge mit `(int) (Math.random() * 100) + 1` eine
   Zufallszahl zwischen 1 und 100. Lass die Nutzerin/den Nutzer in einer
   `do-while`-Schleife so lange raten, bis die Zahl erraten wurde. Gib nach
   jedem Versuch aus, ob die gesuchte Zahl größer oder kleiner ist.

Kompilieren & starten (aus dem Projekt-Hauptordner):

```
mvn compile
mvn exec:java -Dexec.mainClass="de.schulung.tag2.uebung.Aufgabe2"
```

Vergleiche danach mit
`src/main/java/de/schulung/tag2/loesung/Aufgabe2.java`.
