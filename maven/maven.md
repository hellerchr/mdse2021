---
title: Methoden und Werkzeuge des Software Engineering
marp: true
theme: gaia
size: 16:9
class:
  - lead
paginate: true
---
#  <!--fit--> Grundlegende Tools des Java Entwicklers

---
## Inhalte
1. Der Software Entwicklungsprozess
2. Maven - Grundlegendes
3. IDEs
4. Maven - Plugins
5. Arbeitsweisen

---
### Der Software Entwicklungsprozess 
##### SDLC - Software Development Life Cycle
![](http://yuml.me/diagram/scruffy;dir:LR/class/Software%20Entwicklungsprozess,[Entwurf]-&gt;[Implementierung],[Implementierung]-&gt;[Validierung],[Validierung]-&gt;[Wartung/Betrieb],[Wartung/Betrieb]-&gt;[Anforderung],[Anforderung]-&gt;[Entwurf])

---

### Java Buildmanagement Tools
---
| Veröffentlicht |Tool| Market Share | Open Source |  Based |
|---|---|---|---|---|
| 2000 | ant | 11% | ✔ | xml |
| 2004 | maven | 68 % | ✔ | xml |
| 2012 | gradle | 16 % | ✔ | DSL |

---
### Maven 
Auf Java basierendes Buildmanagement Tool. Zur Konfiguration wird die **pom.xml** verwendet. 
- Verwaltung von Abhängigkeiten (Libraries)
- Pflege von Metadaten (Lizenz Informationen, Entwickler, Webseite...)
- Versionierung
- Konfiguration des Build Prozesses

---
### Maven - Koordinaten
| Eintrag | Benötigt| Beschreibung |
|---|:---:|---|
| groupId| ✔ | Identifiziert Firma oder Bereich aus dem eine Komponente kommt|
| artifactId  | ✔ | Identifiziert das Paket | 
| version  | ✔ | Version des Artefakts, i.d.R.: Major.Minor.Patch  |
| type  | ✘ | Welches packaging wurde verwendet, z.B. jar oder war |
| classifier  | ✘ | Multiple Artefakte je Pom erstellen, z.B. JDK14 / JDK15 Builds|
<!--
Note: http://mvnrepository.com
-->

---
### Maven - Abhängigkeiten
Die eigenen Koordinaten werden wie folgt in der pom.xml innerhalb des `project` Knotens definiert.  
```
<project>
...
  <groupId>com.dhbw.mdse</groupId>
  <artifactId>ugly_project_step1</artifactId>
  <version>1.0</version>
...
</project>
```

---
### Maven - Abhängigkeiten
Java Anwendungen haben eine vielzahl von Abhängigkeiten. Diese werden in der dependency Sektion angegeben. 
```
<project>
...
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
...
</project>
```
---
| Eintrag | Beschreibung |
|---|---|
| packaging | Typ des Artefaktes, z.B. `POM`, `EAR`, `WAR` oder `JAR`, Default: jar |
| properties | Definition und Nutzung von variablen Einstellungen |
| build | Build Informationen|
| dependencies | Listet benötigte Abhängigkeiten auf |
| profiles | Definition von unterschiedliche Verhalten, z.B. zur CodeAnalyse |
| reporting | Erstellung von Reports |
| plugins | Erstellung von Reports |

---
### Maven - Default Lifecycle 

![](https://yuml.me/diagram/scruffy;dir:LR;scale:78/class/,[validate]-%3E[compile],[compile]-&gt;[test],[test]-&gt;[package],[package]-&gt;[integration-test],[integration-test]-&gt;[verify],[verify]-&gt;[install],[install]-&gt;[deploy])
Es gibt zudem einen Site und Clean Lifecycle. Diese sind auf [https://maven.apache.org](https://maven.apache.org/ref/3.6.2/maven-core/lifecycles.html) zu finden. 

---
|Phase| Beschreibung |
|---|---|
| validate | Prüfung, dass notwendige Informationen vorhanden sind |
| compile | Umwandeln des Projekts in Bytecode |
| test | Ausführen von Unit Tests |
| package | Typ des Artefaktes, z.B. `POM`, `EAR`, `WAR` oder `JAR`, Default: jar |
| verify | Ausführung von Integrations-Tests |
| install | Installieren des Artefakts im lokalen maven Repository (.m2)|
| deploy | Liefert das Artefakt in ein zentrales maven Repository um es mit anderen Entwicklern zu teilen|

---
#### Maven cli
```
mvn clean
mvn compile
mvn test
mvn package
mvn package -DskipTests
mvn install
```
<!--
Note: Demo der Befehle und pom.xml des Step1 mit Notepad zeigen
-->

---
### Maven 
- **Goals:** 
  
  Einzelne Plugins können Funktionen exponieren. Diese nennt man Goals. Goals können an Phasen gebunden werden, aber auch einzeln ausgeführt werden. Darüber können sich Maven Plugins am Lifecycle beteiligen.
- **Archetypes:**  

  Templates mit denen man Projekte ausliefern kann.

---
### Übung
#### [maven in five minutes](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
https://tiny.cc/m5minutes

---
#### IDEs 
Integrierte Entwicklungsumgebungen vereinen diverse Funktionen zur Software Entwicklung:
- Editor
- Syntax Highlighting
- Code Generierung
- Automatisierte Fehlerbehandlung
- Integration von Tools
- Debugging
- Versionskontrolle
- und und und...

---
#### IDEs
![height:15cm](https://pbs.twimg.com/media/CnUvySzW8AITLmT?format=jpg&name=large)

---
### IntelliJ IDEA 
<!--
Note: 
* IntelliJ anhand des Step1 erklären Maven in IntelliJ zeigen, pom.xml, STRG+Q Tool Tip
* Maven Tab zeigen, Maven Graph
* Projekt erklären
* Format Code, replace values by variables, extract method
* Suche (in Path, File, Search Everywhere)
-->
---
### Maven Plugins
Mit Plugins kann Maven Funktionalität erweitert werden, wie z.B.: 
- Validierung
  - Code Style (Checkstyle)
  - Security Scans (Common Vulnerabilities and Exposures - CVE)
  - Code Qualität / Static Code Analysis (PMD, SpotBugs, SonarQube)
  - Testing (Surefire)
- Reporting (JavaDocs, Test Coverage, ..)
---
### Maven Plugins
|Bezeichnung|Funktion|		
|---|---|
|Surefire|Stellt Ergebnisse der Tests als Report zur Verfügung|
|JavaDocs|Erstellt Dokumentation auf Basis der Struktur der Codes und von Kommentaren die Entwickler schreiben |
|Checkstyle|Überprüft die Formatierung des Codes|
|SpotBugs|Statische Code Analyse|
|PMD|Statische Code Analyse|
|SonarQube|Statische Code Analyse|
<!--
Note: Projekt Step2 zeigen, JavaDocs, Checkstyle, SpotBugs, Site feature 
-->

---
### JavaDocs
Kommentarblöcke die mit `"**"` beginnen, werden als JavaDocs interpretiert. Diese können an Packages, Klassen, Interfaces, Methoden, Feldern und Variablen genutzt werden.   
```
/**
* Adds the two provided values.
*
* @param var1 first input value
* @param var2 second input value
*/
 public final void add(final int var1, final int var2) {
```

---
### JavaDocs
|Annotation|Beschreibung|
|---|---|
|@author| Nennt den Author einer Klasse|
|@version| Gibt die Version der Klasse an|
|@deprecated| Gibt an das eine Methode nicht mehr zu verwenden ist|
|@param| Beschreibt die Parameter einer Methode|
|@return| Beschreibt den Rückgabewert einer Methode|
|@throws| Beschreibt die Fehler welche von einer Methode ausgelöst werden können|

---
### Checkstyle / Code style
- **Checkstyle (maven)** überprüft das Format des Codings. Regeln können durch eine xml Datei angepasst werden. 
- **Code style (IDE)** formatiert den Code.

=> Wichtig das beide Tools möglichst synchron sind.
<!--
Note: Demo
-->

---
### Unit Testing - JUnit
- Tests für möglichst kleine funktionelle Einheiten 
- Test wird auch Unit Test genannt
- Test in sich geschlossen.
- Wird in der Test Phase ausgeführt
- Von Entwicklern, für Entwickler
---
### JUnit
|Annotation|Wo|Wofür|
|---|---|---|
|@BeforeClass|Methode|Einmalige Ausführung der Methode zum Setup der Klasse|
|@AfterClass|Methode|Einmalige Ausführung der Methode zum Cleanup der Klasse|
|@Before|Methode|Ausführung der Methode zum Setup je Test in Klasse|
|@After|Methode|Ausführung der Methode zum Cleanup je Test in Klasse|
|@Test|Methode|Methode wird als Test deklariert|
<!--
Note: Demo
-->

---
### Übung 2

---
### Arbeitsweisen
- Test Driven Development
- Pair Programming
- Mob Programming

---
### TDD - Test Driven Development
![](https://yuml.me/diagram/scruffy/class/[Green%20Test]-%3E[Refactoring],[Red%20Test]-%3E[Green%20Test%7Bbg:green%7D],[Refactoring]-%3E[Red%20Test%7Bbg:red%7D])
1. Test wird entwickelt, schlägt aber fehl.
2. Programm wird minimal geändert, sodass Test erfolgreich ist. Copy Paste, oder ähnliches ist erlaubt und gewünscht. Der Aufwand muss minmal sein.
3. Refaktorierung sodass Qualität, Struktur und Architektur gut ist.

---
### Pair Programming
- 2 Entwickler, 1 Computer
- **Navigator:** sagt was gemacht wird
- **Driver:** bedient Computer
- Rollen werden regelmäßig getauscht  
- Besonders geeignet bei
  - unterschiedliche Skill Level
  - wenn Software Qualität besonders hoch sein muss

---
### Mob Programming
- 3-5 Entwickler, 1 Computer
- **Driver:** bedient Computer
- Es muss Einigkeit herrschen was getan werden soll
- Geteiltes Wissen im Team (Code Ownership)
- Keine Handys oder ähnliche Ablenkungen
- Zeitlich beschränkt, mit regelmäßigen Pausen (ca. alle 45 min)
