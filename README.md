# Java Schulung – 5-Tage-Kurs für Schüler:innen

Willkommen zu deinem 5-Tage-Einstieg in Java! Am Ende dieses Kurses hast du
alle Grundlagen gelernt, die du brauchst, um dein eigenes **Konsolen-Taschenrechner-Programm**
zu schreiben – dein persönliches Abschlussprojekt.

## Voraussetzungen

- Ein installiertes **JDK** (Java Development Kit, Version 17 oder neuer empfohlen)
- **Apache Maven** (Version 3.8+) – prüfe mit `mvn -version`
- Eine IDE wie **IntelliJ IDEA** (Community Edition reicht, erkennt Maven-Projekte automatisch) oder ein einfacher Texteditor + Terminal
- Keine Java-Vorkenntnisse nötig – wir starten bei null!

## Projektstruktur (Maven)

Dieses Projekt ist ein **Maven-Projekt**. Der komplette Java-Code liegt im
Standard-Maven-Ordner `src/main/java`, organisiert nach Tag und nach
Übung/Lösung:

```
src/main/java/de/schulung/
├── tag1/
│   ├── uebung/Aufgabe1.java
│   └── loesung/Aufgabe1.java
├── tag2/
│   ├── uebung/Aufgabe2.java
│   └── loesung/Aufgabe2.java
├── tag3/
│   ├── uebung/Aufgabe3.java
│   └── loesung/Aufgabe3.java
├── tag4/
│   ├── uebung/Aufgabe4.java
│   └── loesung/Aufgabe4.java
└── tag5/
    ├── uebung/  (Rechner.java, Taschenrechner.java)
    └── loesung/ (Rechner.java, Taschenrechner.java)
```

Für jeden Tag gibt es außerdem einen Ordner mit einer `README.md`:

| Ordner                          | Inhalt                                          |
|----------------------------------|--------------------------------------------------|
| `Tag1_Grundlagen/README.md`      | Theorie zu Tag 1 mit Beispielen und Erklärungen  |
| `Tag2_Kontrollstrukturen/README.md` | Theorie zu Tag 2                             |
| `Tag3_MethodenUndArrays/README.md`  | Theorie zu Tag 3                             |
| `Tag4_OOPundFehlerbehandlung/README.md` | Theorie zu Tag 4                         |
| `Tag5_Taschenrechner/README.md`  | Anleitung zum Abschlussprojekt                   |

- **`uebung`**-Pakete enthalten Vorlagen mit `// TODO`-Kommentaren, die du
  selbst vervollständigst.
- **`loesung`**-Pakete enthalten die fertigen Musterlösungen – schau erst
  rein, wenn du es selbst versucht hast!

## Kursplan

| Tag | Thema                                  | Theorie-Ordner                      | Java-Paket                  |
|-----|-----------------------------------------|--------------------------------------|------------------------------|
| 1   | Grundlagen: Variablen, Datentypen, Ein-/Ausgabe | `Tag1_Grundlagen`             | `de.schulung.tag1.*`         |
| 2   | Kontrollstrukturen: if/else, switch, Schleifen  | `Tag2_Kontrollstrukturen`     | `de.schulung.tag2.*`         |
| 3   | Methoden und Arrays                      | `Tag3_MethodenUndArrays`             | `de.schulung.tag3.*`         |
| 4   | Objektorientierung & Fehlerbehandlung    | `Tag4_OOPundFehlerbehandlung`        | `de.schulung.tag4.*`         |
| 5   | Abschlussprojekt: Taschenrechner          | `Tag5_Taschenrechner`                | `de.schulung.tag5.*`         |

## So arbeitest du mit dem Kurs

1. Lies die `README.md` des jeweiligen Tages komplett durch.
2. Öffne die Datei(en) im passenden `uebung`-Paket und bearbeite die
   `// TODO`-Stellen.
3. Kompiliere das gesamte Projekt mit Maven:
   ```
   mvn compile
   ```
4. Führe deine Übung aus (Beispiel für Tag 1):
   ```
   mvn exec:java -Dexec.mainClass="de.schulung.tag1.uebung.Aufgabe1"
   ```
   (oder starte die Klasse direkt über den grünen Pfeil in deiner IDE)
5. Vergleiche erst danach mit der Musterlösung im passenden `loesung`-Paket.
6. Am 5. Tag setzt du alles Gelernte in einem echten Projekt ein: einem
   Taschenrechner, der über die Konsole bedient wird (kein grafisches
   Frontend nötig). Du kannst ihn auch als ausführbares Jar bauen und
   starten:
   ```
   mvn package
   java -jar target/java-schulung.jar
   ```

Viel Erfolg und Spaß beim Programmieren! 🎉
