# Übung 1: Setup

### SSH Key generieren
1. Open a terminal
2. [Generate SSH Key](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/#generating-a-new-ssh-key)

### Optional*: SSH Key zum SSH Agent hinzufügen

*nur notwendig falls der SSH Key passwortgeschützt wurde

[Add SSH Key](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/#adding-your-ssh-key-to-the-ssh-agent)

### Git Config
```
git config --global user.name "Mona Lisa"
git config --global user.email "mona.lisa@example.com"
```

## Anlegen eines lokalen Git Repository

### Projekt anlegen
```
mkdir myfirstrepo
cd myfirstrepo
ls -al
git init
```

### Was ist passiert?
```
git status
ls -al
cd .git
ls -al
cat config
cat HEAD
cd ..
```
Damit ist das Repository angelegt, allerdings nur lokal!

### Erster Commit
```
git status
echo "# My First Readme" > readme.md
git status
git add readme.md
git commit -m "Mein erster Commit"
```

## Verbinden mit Github
Erstellen sie einen Account auf [GitHub](www.github.com)

### SSH Key hinzufügen
1. Gehen Sie auf [github.com](www.github.com).
2. Gehen Sie auf "Your profile", rechts oben.
3. Edit Profile
4. SSH and GPG Keys
5. New SSH Key
6. Kopieren Sie den Inhalt des Public SSH Keys (*.pub) aus dem .ssh Ordner in ihrem Home Verzeichnis (Tipp: `cat ~/.ssh/id_rsa.pub`).

### Repositories synchronisieren
1. Erstellen Sie ein **leeres** Repository of Github.com (New Repository). Vergeben Sie lediglich einen Namen, z.B. myfirstrepo.
2. Synchronisieren der Repositories:

	```
	git remote add origin git@github.com:<YourUser>/myfirstrepo.git
	git push --set-upstream origin master
	```