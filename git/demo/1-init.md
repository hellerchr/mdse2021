---
title: Methoden und Werkzeuge des Software Engineering
theme: gaia
size: 16:9
class:
  - lead
marp: true
---
# Demo
--- 
## Initiales Setup eines Git Repository
---
### Projekt anlegen
```
mkdir myfirstrepo
cd myfirstrepo
ls -al
git init
```

---
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

---
### Erster Commit
```
git status
vim readme.md
git status
git add readme.md
git commit -m "Mein erster Commit"
```

---
### Connect to GitHub
1. Erstellung eines Account auf [GitHub](www.github.com)
2. Erstellung eines leeren Repositories
3. Verbinden der Repositories 
```
git remote add origin https://github.com/<youruser>/myfirstrepo.git
git push --set-upstream origin master
```
