# Tag 5 – Abschlussprojekt: Taschenrechner

## Lernziele

Heute kombinierst du alles, was du in den letzten 4 Tagen gelernt hast, zu
einem echten Projekt: einem **Konsolen-Taschenrechner**. Kein grafisches
Frontend nötig – die Bedienung erfolgt komplett über Texteingaben im
Terminal.

## Was soll der Taschenrechner können?

- Ein **Menü** anzeigen, das sich wiederholt, bis der Nutzer "Beenden"
  wählt.
- Die vier Grundrechenarten: **Addition, Subtraktion, Multiplikation,
  Division**.
- Fehler abfangen: ungültige Eingaben (Text statt Zahl) und Division durch
  0.
- Den **Verlauf** aller Berechnungen speichern und auf Wunsch anzeigen
  (mit einem Array oder einer `ArrayList`).

## Architektur

Wir teilen das Projekt in zwei Klassen auf – das ist gute Praxis
(Objektorientierung!):

| Klasse             | Verantwortung                                             |
|--------------------|-------------------------------------------------------------|
| `Rechner`          | Enthält die Rechenlogik (`addiere`, `subtrahiere`, ...) und den Verlauf |
| `Taschenrechner`   | Enthält die `main`-Methode, das Menü und die Nutzerinteraktion |

Das ist dasselbe Prinzip wie bei der `Bruch`-Klasse aus Tag 4: Die
Rechenlogik ist von der Ein-/Ausgabe getrennt.

## Beispielablauf

```
=== Taschenrechner ===
1) Addieren
2) Subtrahieren
3) Multiplizieren
4) Dividieren
5) Verlauf anzeigen
6) Beenden
Auswahl: 1
Erste Zahl: 5
Zweite Zahl: 3
Ergebnis: 5.0 + 3.0 = 8.0

=== Taschenrechner ===
...
Auswahl: 4
Erste Zahl: 10
Zweite Zahl: 0
Fehler: Division durch 0 ist nicht erlaubt!

=== Taschenrechner ===
...
Auswahl: 5
--- Verlauf ---
5.0 + 3.0 = 8.0

=== Taschenrechner ===
...
Auswahl: 6
Auf Wiedersehen!
```

## Schritt-für-Schritt-Anleitung

Öffne die Dateien im Paket
`src/main/java/de/schulung/tag5/uebung/`:

1. **`Rechner.java`** – Hier definierst du die Rechenlogik:
   - Methoden `addiere`, `subtrahiere`, `multipliziere`, `dividiere`
     (alle nehmen zwei `double`-Werte und geben ein `double` zurück).
   - `dividiere` soll bei `b == 0` eine `IllegalArgumentException` werfen
     (wie an Tag 4 gelernt).
   - Eine Liste/ein Array (`ArrayList<String>` empfohlen), in dem jede
     Berechnung als Text gespeichert wird (z.B. `"5.0 + 3.0 = 8.0"`).
   - Eine Methode `zeigeVerlauf()`, die alle gespeicherten Berechnungen
     ausgibt.

2. **`Taschenrechner.java`** – Hier steht die `main`-Methode:
   - Zeigt das Menü in einer Schleife (`while (true)` mit `break`, wenn
     "Beenden" gewählt wird).
   - Liest die Auswahl mit `Scanner` ein (`switch`-Anweisung passt gut!).
   - Fragt bei den Rechenoperationen die beiden Zahlen ab.
   - Ruft die passende Methode aus `Rechner` auf.
   - Fängt Fehler mit `try`/`catch` ab (`InputMismatchException` für
     falsche Eingaben, `IllegalArgumentException` für Division durch 0).

## Tipps

- Fange klein an: Bringe zuerst die Addition zum Laufen, bevor du die
  restlichen Operationen ergänzst.
- Teste dein Programm nach jedem Schritt – kompiliere und starte es
  regelmäßig.
- Nutze `scanner.nextLine()` nach `scanner.nextInt()`/`nextDouble()`, um
  den übrig gebliebenen Zeilenumbruch "aufzuräumen" (wie an Tag 1 gelernt).
- Wenn ein Fehler auftritt (z.B. Division durch 0), soll das Programm
  **nicht abstürzen**, sondern eine Fehlermeldung zeigen und im Menü
  weiterlaufen.

## Bonus-Ideen (freiwillig)

- Ergänze weitere Operationen: Potenzieren, Quadratwurzel (`Math.sqrt`),
  Prozentrechnung.
- Runde das Ergebnis auf 2 Nachkommastellen (`Math.round(x * 100) / 100.0`).
- Speichere den Verlauf in einer Datei (fortgeschritten).

## Kompilieren und Starten

Führe im Projekt-Hauptordner (dort, wo `pom.xml` liegt) aus:

```
mvn compile
mvn exec:java -Dexec.mainClass="de.schulung.tag5.uebung.Taschenrechner"
```

Wenn dein Taschenrechner fertig ist, kannst du auch ein ausführbares Jar
bauen und starten:

```
mvn package
java -jar target/java-schulung.jar
```

(Das Jar startet standardmäßig die Musterlösung `de.schulung.tag5.loesung.Taschenrechner`
– passe dazu bei Bedarf die `mainClass` in der `pom.xml` an, um deine
eigene `uebung`-Version zu starten.)

Wenn du fertig bist oder nicht mehr weiterkommst, schau dir die
Musterlösung im Paket
`src/main/java/de/schulung/tag5/loesung/` an. Aber versuche es zuerst
unbedingt selbst – das ist dein Abschlussprojekt! 🎉🎉
