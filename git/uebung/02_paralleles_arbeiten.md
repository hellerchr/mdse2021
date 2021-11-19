# Übung 2: Paralleles Arbeiten mit Git

1. Bilden Sie Zweiergruppen. 
2. Einigen Sie sich darauf wessen Repository Sie verwenden.
3. Gewähren Sie Ihren Kommiltonen Zugriff auf ihr `github.com` Repository. Öffnen Sie das Repository auf github.com. Fügen Sie den Account Ihres Kommilitonen unter Settings>Collaborators hinzu.
4. Nutzen Sie **`git clone`** damit beide das gleiche Repository ausgecheckt haben. Bitte verwenden Sie dabei **nicht** HTTPS! 
5. Nutzen Sie beide **`git pull`** um den aktuellsten Stand zu erhalten.
6. Prüfen Sie ob beide auf dem gleichen HEAD sind (Branch + Commit)

##### Kommilitone-1: Aktualisieren der Readme
1. Fügen Sie folgende Zeile der readme.md hinzu:
    ```
    [Contributer](./contributer.md)
    ```
2. Fügen Sie die Änderung dem Staging Bereich hinzu.
3. Commiten Sie Ihre Änderung, ohne diese auf das remote repository zu pushen.

##### Kommilitone-2: Hinzufügen der Contributer.md
1. Erstellen Sie eine Datei Namens contributer.md, welche Ihren Namen, Spiztnamen, oder Matrikel Nummern enthält.
2. Fügen Sie die neue Datei dem Staging Bereich hinzu.
3. Commiten Sie Ihre Änderung.
4. Pushen Sie Ihre Änderung.

##### Kommilitone-1: Aktualisieren des Remote Repositories
1. Versuchen Sie nun Ihre Änderung zu pushen, dabei wird folgende Fehlermeldung entstehen:

	```
	git push origin master
	To github.com:<Nutzer>/myfirstrepo.git
	 ! [rejected]        master -> master (fetch first)
	error: failed to push some refs to 'git@github.com:<Nutzer>/myfirstrepo.git'
	hint: Updates were rejected because the remote contains work that you do
	hint: not have locally. This is usually caused by another repository pushing
	hint: to the same ref. You may want to first integrate the remote changes
	hint: (e.g., 'git pull ...') before pushing again.
	hint: See the 'Note about fast-forwards' in 'git push --help' for details.
	```

2. Aktualisieren Sie ihre lokale Änderung mit **`git pull origin master`**, dadurch erhalten Sie folgende Meldung:

	```
	git pull origin master
	From https://github.com/<Nutzer>/myfirstrepo
	 * branch            master     -> FETCH_HEAD
	Merge made by the 'recursive' strategy.
	 contributer.md | 2 ++
	 1 file changed, 2 insertions(+)
	 create mode 100644 contributer.md
	```

	Der Lokale Git Client hat die Änderungen automatisch für uns zusammengeführt. Dies funktioniert da wir unterschiedliche Dateien verändert haben. Bei Änderungen an gleichen Dateien müssten Sie den Konflikt manuell auflösen. 

