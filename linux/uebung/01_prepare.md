# Übung 1: Installation der Ubuntu VM Umgebung

1. Installieren Sie VMWare Workstation Player 16: [Download](https://www.vmware.com/go/getplayer-win)
2. Downloaden Sie die neuste Ubuntu Linux Version: [Download](https://bit.ly/mdse-ubuntu)
3. Erstellen Sie im VMware Player eine neue virtuelle Maschine vom Typ Linux, Ubuntu (64 bit) mittels der heruntergeladenen ISO datei.

Nachdem die VM erfolgreich installiert wurde und Sie sich eingeloggen konnten, führen Sie bitte folgende Befehle im Terminal aus.
(Das Terminal können Sie entweder über das Menü oder über die Tastenkombination `Ctrl + Alt + T` öffnen)

* sudo apt update
* sudo apt-get install git
* sudo apt-get install maven
* sudo apt-get install openjdk-11-jdk
* sudo apt-get install docker.io
* sudo systemctl enable --now docker
* sudo usermod -aG docker <name_ihres_benutzers>
* sudo snap install intellij-idea-community --classic