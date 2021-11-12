# Übung 2: Docker Images


### Hello World Image

1. Erstellen Sie einen neuen Ordner für Ihr Dockerimage. z.B. mit dem Name "my-hello-image"
2. Öffnen Sie den Projektordner
3. Legen Sie in diesem Projektordner eine Datei *hello.sh* an.  Das Shellskript soll folgendes enthalten:

	```
	echo "hello world"
	```
4. Legen Sie im Projektordner eine *Dockerfile* Datei an. Diese definiert den "Bauplan" ihres Docker Images:
	1. Fügen Sie die Zeile `FROM alpine:latest` ein um das alpine Image als Basisimage anzugeben.
	2. Fügen Sie die Zeile `COPY hello.sh /hello.sh` an um das Shellskript in das Image zu kopieren.
	3. Setzen Sie den Standardbefehl der beim start Ihres Containers ausgeführt wird mit:
		`CMD ["sh", "hello.sh"]`
5. Speichern Sie die Datei *Dockerfile*.
6. Bauen Sie ihr Image mit dem Namen "my-hello" auf der Kommandozeile.
	
	*Hinweis*: Das aktuelle Verzeichnis muss dem Projektordner entsprechen

	`docker build . -t my-hello`
7. Führen Sie das neu gebaute Image aus mit: `docker run my-hello`. Sie sollten nun mit dem Text *hello world* begrüßt werden. 

	Herzlichen Glückwunsch zum ersten Docker Image!
