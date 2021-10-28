# Übung 3: Pipes & Streams

Die folgenden Übungen werden mit der Anwendung *Terminal* innerhalb Ihrer Ubuntu VM durchgeführt:

1. Starten Sie Ihre Ubuntu VM über Virtualbox.
2. Starten Sie *Terminal*:
	* Klicken Sie im Ubuntu Desktop in der Seitenleiste auf das unterste Icon *Anwendungen anzeigen*.
	* Schreiben Sie "Terminal" in das Suchfeld und starten die *Terminal* Anwendung.
	* Tipp: Der Shortcut `Ctrl + Alt + T` kann ebenfalls genutzt werden um das Terminal zu starten.

### Ausgaben filtern mit `grep`

1. Navigieren Sie in Ihren Benutzerordner mit  `cd` (alternativ: `cd ~` oder `cd $HOME`).
2. Geben Sie den Inhalt der Datei *.bash_history* mit dem Befehl `cat .bash_history` aus.
3. Nutzen Sie nun den Pipe Operator **|** um die Ausgabe des *cat* Befehls an *grep* weiterzuleiten und diese mit *grep* zu filtern. Lassen Sie sich Ihre kürzlichen *mkdir* Befehle anzeigen mit: `cat .bash_history | grep "mkdir"`.
4. Geben Sie die Anzahl der Zeilen in *.bash_history* aus: `cat .bash_history | wc -l`.
5. Wie oft haben Sie in letzter Zeit den `mkdir` Befehl ausgeführt? Erweitern Sie den Befehl aus dem letzten Schritt mit einem `grep` Filter um dies zu beantworten.

### Prozesse anzeigen und beenden

1. Starten Sie "Thunderbird E-Mail Client" und minimieren Sie die gestartete Anwendung. Ziel in den folgenden Schritten soll es sein diesen Prozess per Kommandozeile zu beenden.
2. Zeigen Sie alle laufenden Prozesse des aktuellen Benutzers mit dem Befehl `ps -u` an.
3. Filtern Sie die Ausgabe mit `grep` um nur den relevanten Prozess *thunderbird* zu sehen.
4. Warum wird zusätzlich der eigentliche *grep* Befehl mit angezeigt? Versuchen Sie den Filterparamter mit eckigen Klammern anzupassen: `.. | grep "[t]hunderbird". Warum wird nun nur noch ein Prozess angezeigt?
5. Die zweite Spalte der Prozessausgabe ist die sog. Process ID. Pipen Sie die Ausgabe in das Tool *awk* um nur diese anzuzeigen. `ps -u | grep "[t]hunderbird" | awk '{ print $2 }'`
6. Beenden Sie nun den Prozess indem Sie die Process ID dem Befehl  `kill -9 ` als Parameter anhängen.
7. Können Sie den Prozess mit einer Zeile finden und beenden? Tipp: kombinieren Sie die Befehle mit xargs.