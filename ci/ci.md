---
title: Methoden und Werkzeuge des Software Engineering
theme: gaia
size: 16:9
class:
marp: true
---
# Formate
---
## XML
* E**X**tended **M**arkup **L**anguage
	* Markup: **markieren** eines Textes
* 1998 veröffentlicht
* W3C Standard   
* Umfangreich
---
## XML
```
  <Engineer>
    <name>Linus Torvalds</name>
    <age>48</age>
    <software>
      <software>
        <name>Linux</name>
        <license>GPL v2</license>
      </software>
      <software>
        <name>Git</name>
        <license>GPL v2</license>
      </software>
    </software>
  </Engineer>
```
---

### XML: Bestandteile
* XML - **Element**: 	
	```
	<person>...</person>
	```
	
* XML - **Tag**: 	
	```
	<person>
	```
	Starttags werden durch Endttags geschlossen. 
   Außer: Leerelemente

---
### XML: Bestandteile
* XML - **Text**:
	```
	<message>Hi, wie geht`s?</message>
	```	

* XML - **Attribut**:
	```
	<person "age"="40">...</person>
	```	

* Kommentare:
	```
	<!-- Das ist ein Kommentar -->
	```
---
#### XSD: XML Schema Definition
Definiert und validiert die Struktur eines XML Dokumentes.
```
<xs:schema xmlns:xs = "http://www.w3.org/2001/XMLSchema">
   <xs:element name = 'class'>
      <xs:complexType>
         <xs:sequence>
             <xs:element name = 'student' type = 'StudentType' minOccurs = '0' 
                maxOccurs = 'unbounded' />
         </xs:sequence>
      </xs:complexType>
   </xs:element>
   <xs:complexType name = "StudentType">
      <xs:sequence>
         <xs:element name = "firstname" type = "xs:string"/>
         <xs:element name = "lastname" type = "xs:string"/>
      </xs:sequence>
   </xs:complexType>			 
</xs:schema>
```
---
#### XSD: XML Schema Definition
```
<class>  
   <student>
      <firstname>Max</firstname>    
      <lastname>Muster</lastname>
   </student>   
   <student>
      <firstname>Lisa</firstname>    
      <lastname>Müller</lastname>
   </student>
<class>
```
---
### XML: Weitere Informationen

* [www.selfhtml.org/wiki/XML/](https://wiki.selfhtml.org/wiki/XML/Regeln/Tags,_Attribute,_Wertzuweisungen_und_Kommentare)
* [www.tutorialspoint.com/de/xml/](https://www.tutorialspoint.com/de/xml/xml_syntax.htm)
* [www.tutorialspoint.com/xsd/](https://www.tutorialspoint.com/xsd/xsd_validation.htm)

---
## Übung: 
### Aufgabe 1 + Aufgabe 2.1 (XML)

---
## JSON
* **J**ava**S**cript **O**bject **N**otation
* Beispiel:

---
## JSON
```
{
  "name" : "Linus Torvalds",
  "age" : 48,
  "software" : [ 
    {
      "name" : "Linux",
      "license" : "GPL v2"
    }, {
      "name" : "Git",
      "license" : "GPL v2"
    } 
  ]
}
```
---
### JSON: Spezifikation
* Spezifiziert von Douglas Crockford (kompakt genug für eine Visitenkarte).

![](images/json_business_card.png)

---
### JSON: Bestandteile
* **object**: 	
	```
	{ <pair>, .. }
	```
	
	Beispiel:
	```
	{"name" : "Max", .. }
	```
---
### JSON: Bestandteile
  
* **pair** (auch property gennant): 	
	```
	<key>:<value>
	```
	
* **value**:
	* **array**: ``["adidas", "nike", "asics"]``
	* **string**: ``"Max"``
	* **number**: ``2.1``
	* **true**, **false**, **null**
	* oder (!): **object**

---
### JSON Schema
```
{
   "type" : "object",
   "properties" : {
      "students" : {
         "type" : "array",
         "items" : {
            "type" : "object",
            "properties" : {
               "firstname" : {
                  "type" : "string",
                  "pattern" : "[a-zA-Z]+"
               },
               "lastname": {
                  "type" : "string",
                  "pattern" : "[a-zA-Z]+"
               }
            }
         }
      }
   }
}
```

```
{
   "students": [ {
         "firstname" : "Max",
         "lastname" : "Muster"
      } , {
         "firstname" : "Lisa",
         "lastname" : "Müller"
      }
   ]
}
```
---
### JSON: Weitere Informationen
* [json.org](https://www.json.org)
* [json-schema.org](https://json-schema.org/)

---
## Übung: 
### Aufgabe 2.2 (JSON)

---
## YAML
* „YAML Ain’t Markup Language“ (ursprünglich „Yet Another Markup Language“).

```
name: "Linus Torvalds"
age: 48
software:
- name: "Linux"
  license: "GPL v2"
- name: "Git"
  license: "GPL v2"
```
---
## YAML Bestandteile:
* YAML ist ein *superset* von JSON.

* **Scalar** (JSON: value): 	
	* string z.B. ``"hallo"`` oder ohne quotes(!) ``hallo``
	* number z.B. ``2.91``

* **Sequence** (JSON: array)
	* Beispiel:

		```
		- milk
		- cheese
		- coke
		```
	* Oder *inline* 
		
	```
	[milk, cheese, coke]
	```

---
## YAML Bestandteile #2
* **Mapping** (JSON: pair/property)
	* Beispiel:
	```
	name: Stefan
	age: 28
	```
	
	* Oder *inline* 
	
	```
	{name: Stefan, age: 28}
	```
  
* **Comment**:
	
```
# settings
power: 50	
```
---
### YAML: Weitere Informationen
* [tutorialspoint.com/yaml](https://www.tutorialspoint.com/yaml/yaml_basics.htm)

---
## Übung: 
### Aufgabe 2.3 (YAML)

---
## End