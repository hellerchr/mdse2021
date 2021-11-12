# Übung 3: Docker Images - Ports & Volumes


### Static Webserver
Ziel der Übung ist es einen lokalen Webserver mit Hilfe des Docker Images [pierrezemb/gostatic](https://hub.docker.com/r/pierrezemb/gostatic/) zu starten 


1. Erstellen Sie einen neuen Ordner für Ihre Webinhalte z.B. mit dem Namen *myweb*.
2. Legen Sie dort eine neue Datei Namens *index.html* an mit dem Inhalt:

	````
	<!DOCTYPE HTML>
<html>
  <head>
    <title>My Website</title>
  </head>
  <body>
    <h1>Hello World!</h1>
  </body>
</html>

	````
2. Starten Sie das docker image *pierrezemb/gostatic* unter Verwendung des `docker run` Befehls. Geben Sie dabei mit dem Parameter `-v `den erstellten Ordner als Volume an den Container frei. Der Mountpoint innerhalb des Containers soll liegt in */srv/http*. Geben Sie zusätzlich mittels `-p` den Port 8043 des Containers an Port 80 ihres lokalen Rechner frei.

	Zusätzliche Hilfe:
	
	* [pierrezemb/gostatic](https://hub.docker.com/r/pierrezemb/gostatic/)
	* [docker run documentation](https://docs.docker.com/engine/reference/run/)

3. Prüfen Sie die erfolgreiche Freigabe Ihres Containers in dem Sie Ihren Browser auf `http://localhost` öffnen. Sie sollten hier den den Text `Hello World!` sehen können.

