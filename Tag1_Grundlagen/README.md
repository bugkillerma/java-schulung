# Tag 1 – Grundlagen von Java

## Lernziele

- Du verstehst, wie ein Java-Programm aufgebaut ist.
- Du kennst die wichtigsten Datentypen und kannst Variablen deklarieren.
- Du kannst Ausgaben mit `System.out.println` machen.
- Du kannst Eingaben über die Konsole mit `Scanner` einlesen.
- Du kennst die grundlegenden Rechenoperatoren.
- Du weißt, was **Maven** ist und wie du damit ein Java-Projekt
  kompilierst und ausführst.

## 1. Aufbau eines Java-Programms

Jedes Java-Programm besteht mindestens aus einer Klasse mit einer
`main`-Methode. Das ist der Einstiegspunkt, an dem das Programm startet:

```java
public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
    }
}
```

- Der Dateiname **muss** genauso heißen wie die Klasse (`HalloWelt.java`).
- `System.out.println(...)` gibt einen Text in die Konsole aus und macht
  danach einen Zeilenumbruch. `System.out.print(...)` macht keinen
  Zeilenumbruch.

## 2. Variablen und Datentypen

Eine Variable ist ein "Behälter" für einen Wert. In Java muss man immer den
**Typ** angeben:

```java
int alter = 16;              // Ganze Zahl
double preis = 4.99;         // Kommazahl
boolean istSchueler = true;  // Wahr oder falsch
char note = 'A';             // Einzelnes Zeichen
String name = "Alex";        // Zeichenkette (Text)
```

| Typ       | Beschreibung                    | Beispielwert |
|-----------|----------------------------------|--------------|
| `int`     | Ganzzahl                         | `42`         |
| `double`  | Kommazahl (double genau)         | `3.14`       |
| `boolean` | Wahrheitswert                    | `true/false` |
| `char`    | Einzelnes Zeichen                | `'x'`        |
| `String`  | Text (kein primitiver Typ!)      | `"Hallo"`    |

Variablen, deren Wert sich nicht ändern soll, deklariert man mit `final`:

```java
final double MEHRWERTSTEUER = 0.19;
```

## 3. Kommentare

```java
// Das ist ein einzeiliger Kommentar

/* Das ist ein
   mehrzeiliger Kommentar */
```

## 4. Rechenoperatoren

| Operator | Bedeutung          | Beispiel      |
|----------|--------------------|---------------|
| `+`      | Addition           | `3 + 2 = 5`   |
| `-`      | Subtraktion        | `3 - 2 = 1`   |
| `*`      | Multiplikation     | `3 * 2 = 6`   |
| `/`      | Division           | `7 / 2 = 3`\* |
| `%`      | Modulo (Rest)      | `7 % 2 = 1`   |

\* **Achtung:** Bei zwei `int`-Werten wird bei der Division abgerundet
(Ganzzahldivision)! Für ein genaues Ergebnis muss mindestens einer der
Werte ein `double` sein: `7.0 / 2 = 3.5`.

## 5. Eingaben mit `Scanner`

Um Eingaben von der Tastatur zu lesen, benutzt man die Klasse `Scanner`:

```java
import java.util.Scanner;

public class Begruessung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = scanner.nextLine();

        System.out.print("Wie alt bist du? ");
        int alter = scanner.nextInt();

        System.out.println("Hallo " + name + ", du bist " + alter + " Jahre alt!");

        scanner.close();
    }
}
```

Wichtige Methoden von `Scanner`:

- `nextLine()` – liest eine ganze Zeile Text ein (`String`)
- `nextInt()` – liest eine ganze Zahl ein (`int`)
- `nextDouble()` – liest eine Kommazahl ein (`double`)

## 6. String-Verkettung

```java
String vorname = "Max";
int alter = 17;
System.out.println("Name: " + vorname + ", Alter: " + alter);
```

## 7. Kurze Einführung in Maven

In diesem Kurs benutzen wir **Apache Maven**, um unsere Java-Programme zu
kompilieren und auszuführen. Aber was ist Maven eigentlich?

### Was ist Maven?

Maven ist ein **Build-Tool** für Java-Projekte. Es übernimmt für dich:

- **Kompilieren** des Codes (statt jede Datei einzeln mit `javac` zu
  übersetzen).
- **Ausführen** des Programms mit einem einzigen Befehl.
- **Verwalten von Abhängigkeiten** (externe Bibliotheken, die dein
  Programm braucht) – Maven lädt sie automatisch aus dem Internet herunter.
- **Standardisieren der Projektstruktur**, damit sich jedes Maven-Projekt
  gleich anfühlt, egal wer es geschrieben hat.

### Die `pom.xml`

Jedes Maven-Projekt hat im Hauptordner eine Datei namens `pom.xml`
("Project Object Model"). Sie beschreibt, wie das Projekt heißt, welche
Java-Version benutzt wird und welche Abhängigkeiten benötigt werden:

```xml
<project>
    <groupId>de.schulung</groupId>
    <artifactId>java-schulung</artifactId>
    <version>1.0.0</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
</project>
```

Schau dir gerne die `pom.xml` im Hauptordner dieses Kursprojekts an!

### Die Standard-Ordnerstruktur

Maven erwartet, dass der Java-Quellcode an einem bestimmten Ort liegt:

```
mein-projekt/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── de/schulung/...    <- deine .java-Dateien, nach Paketen sortiert
```

Der Ordnerpfad entspricht dabei genau dem **Paketnamen** (`package`) am
Anfang jeder Datei. Zum Beispiel liegt die Klasse mit
`package de.schulung.tag1.uebung;` unter
`src/main/java/de/schulung/tag1/uebung/`.

### Die wichtigsten Maven-Befehle

Führe diese Befehle immer im Ordner aus, in dem die `pom.xml` liegt:

| Befehl                                  | Was passiert?                                          |
|------------------------------------------|-----------------------------------------------------------|
| `mvn compile`                             | Kompiliert den gesamten Quellcode                         |
| `mvn exec:java -Dexec.mainClass="..."`   | Kompiliert (falls nötig) und führt die angegebene Klasse aus |
| `mvn package`                             | Baut ein ausführbares `.jar` im Ordner `target/`           |
| `mvn clean`                                | Löscht alle erzeugten Build-Dateien (`target/`-Ordner)     |

Beispiel: Um deine Übung von heute auszuführen:

```
mvn compile
mvn exec:java -Dexec.mainClass="de.schulung.tag1.uebung.Aufgabe1"
```

## Zusammenfassung

- Jedes Programm braucht eine `main`-Methode.
- Variablen haben einen festen Typ (`int`, `double`, `boolean`, `char`, `String`).
- Mit `Scanner` kannst du Benutzereingaben einlesen.
- Grundrechenarten funktionieren fast wie in der Mathematik – aber Vorsicht
  bei der Ganzzahldivision!
- **Maven** ist unser Build-Tool: `pom.xml` beschreibt das Projekt,
  `src/main/java/...` enthält den Code, und mit `mvn compile` /
  `mvn exec:java` kompilierst und startest du dein Programm.

---

## Hausaufgabe

0. **Maven-Aufwärmübung:** Öffne ein Terminal im Projekt-Hauptordner (dort,
   wo die `pom.xml` liegt) und führe `mvn compile` aus. Schau dir danach den
   neu entstandenen `target/`-Ordner an – dort landen die kompilierten
   `.class`-Dateien.

Öffne die Datei
`src/main/java/de/schulung/tag1/uebung/Aufgabe1.java`
und bearbeite alle `// TODO`-Stellen:

1. Frage den Namen und das Alter der Nutzerin/des Nutzers ab und gib eine
   Begrüßung aus (z.B. `"Hallo Max, in 5 Jahren bist du 21 Jahre alt!"`).
2. Frage die Länge und Breite eines Rechtecks ab (als `double`) und berechne
   Fläche und Umfang. Gib beide Werte formatiert aus.
3. **Bonus:** Frage einen Geldbetrag ab und berechne, wie viel Mehrwertsteuer
   (19%) darin enthalten ist.

Kompilieren & starten (aus dem Projekt-Hauptordner):

```
mvn compile
mvn exec:java -Dexec.mainClass="de.schulung.tag1.uebung.Aufgabe1"
```

Vergleiche danach deine Lösung mit
`src/main/java/de/schulung/tag1/loesung/Aufgabe1.java`.
