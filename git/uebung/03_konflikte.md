# Übung 3: Konflikte auflösen mit Git

1. Bilden Sie Zweiergruppen.
2. Einigen Sie sich darauf wessen Repository Sie verwenden.
3. Stellen Sie sicher das Sie beide schreib rechte auf das github repository haben. 
3. Nutzen Sie ggf. **`git clone`** damit beide das gleiche Repository ausgecheckt haben.
4. Nutzen Sie beide **`git pull`** um den aktuellsten Stand zu erhalten.
5. Prüfen Sie ob beide auf dem gleichen HEAD sind (Branch + Commit)

### Aktualisieren der Readme
Führen Sie Bitte folgende Schritte jeweils einzeln an ihrem Rechner aus:

1. Fügen Sie eine Sektion **"### Erwartungen an das Studium"** in der Datei readme.md hinzu. 
2. Erstellen Sie mehrere Zeilen mit Erwartungen, die Sie an ihr Studium haben. Beginnen Sie jede Zeile mit einem "* ". Der Stern wird von Markdown als Bulletpoint intrepretiert. 
3. Fügen Sie die neue Datei dem Staging Bereich hinzu.
4. Commiten Sie Ihre Änderung, notieren Sie sich Commit Id und Message.

### Pushen der Änderungen
Machen Sie diesen Teil der Aufgabe bitte gemeinsam:

1. Pushen Sie die Änderungen von Ihreren Rechnern. 
	
	Beim Versuch die Änderung des zweiten Rechners zu pushen werden  Sie eine Fehlermeldung erhalten. Dies geschieht, da Ihr lokales repository nicht alle Referenzen aus dem Remote Repository verfügbar hat. 
3. Führen Sie ein **`git fetch `** durch um die Referenzen zu akualisieren.

	```
	remote: Enumerating objects: 5, done.
	remote: Counting objects: 100% (5/5), done.
	remote: Compressing objects: 100% (3/3), done.
	remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
	Unpacking objects: 100% (3/3), done.
	From github.com:PatrikSteuer/myfirstrepo
	   774da85..1b72bf0  master     -> sshorigin/master
	```

4. Führen Sie ein **`git rebase`** durch um die Änderungen aus dem Remote Repository auf ihr Arbeitsverzeichnis anzuwenden.

	```
	rebase in progress; onto 1b72bf0
	You are currently rebasing branch 'master' on '1b72bf0'.
	  (fix conflicts and then run "git rebase --continue")
	  (use "git rebase --skip" to skip this patch)
	  (use "git rebase --abort" to check out the original branch)
	
	Unmerged paths:
	  (use "git reset HEAD <file>..." to unstage)
	  (use "git add <file>..." to mark resolution)
	        both modified:   Readme.md
	```

5. Schauen Sie sich die Readme.md an, was stellen Sie fest? Was bedeuten die Zeichen?
6. Lösen Sie den Konflikt in der Readme.md auf. 
7. Fügen Sie die Readme.md dem Staging Bereich hinzu.
8. Führen Sie **`git rebase --continue`** aus.
9. Pushen Sie ihre Änderung.

### Betrachten der Änderung
1. Nutzen Sie **`git log --graph`** um die Historie Ihrer Commits zu betrachten. 
2. Vergleichen Sie die Commit Ids mit den zuvor notierten Ids. Was fällt Ihnen auf?
3. Betrachten Sie Ihre Änderung auf Github.com.

### Aktualisieren der Readme 
Wiederholen Sie die Übung mit folgenden Änderungen:

* Fügen Sie eine Sektion mit **"### Erwartungen an die Vorlesung"** hinzu. 
* Anstelle eines **`git rebase`** machen Sie bitte ein **`git merge`**. 

Wie unterscheiden sich die Ergebnisse?
