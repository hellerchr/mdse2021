# Übung 1: Docker Basics

Diese Übung geht davon aus, dass sie Docker erfolgreich installiert haben. Stellen Sie sicher, dass Docker gestartet wurde. Prüfen Sie hierfür ob das Dockericon (Walfisch) im Benachrichtungsbereich angezeigt wird ([Hilfe](https://docs.docker.com/docker-for-windows/install/#start-docker-for-windows)). 

Die folgenden Übungen finden in Ihrer *Kommandozeile* statt, bitte öffnen Sie diese.

### 1. Hello World

1. Tippen Sie `docker pull hello-world` ein um das Docker Image `hello-world` herunterzuladen.
	
2. Listen Sie mit `docker images` alle lokal installierten Images auf.	
	Welche Dateigröße hat das gesamte *hello-world*	Image?
	
3. Starten Sie einen Container auf Basis des Images mit: `docker run hello-world`.


### 2. Echo
Tippen Sie `docker run alpine echo "hello world"` ein um *hello world* auf der Kommandozeile anzuzeigen.

Folgende Dinge sind hier passiert:

1. Falls das Image "alpine" lokal noch nicht verfügbar war, wird Docker automatisch einen *pull* ausgeführt haben um das Image zu laden.

2. Mit dem Befehl *echo "hello world"* wurde spezifisch angegeben, welche executable (*echo*) mit welchem Parameter (*"hello world"*) ausgeführt werden soll.

	Was denken Sie: Warum wusste Docker selbst welche exectuable ausgeführt werden sollte in Übung 1?

### 3. Shell
Führen Sie `docker run -it alpine sh` um innerhalb des Containers eine Shell auszuführen. 

Hinweis: Der Parameter `-it` öffnet eine Terminalsession mit dem Container. Der Befehl `sh` startet die Shell innerhalb des Containers.

Tippen sie nun `ls` ein. Was sehen Sie? 

Beenden Sie die Shell mit `ctrl+c`.
		
	