# Exercice 7

Cycle de vie Maven :

**mvn clean**
- clean

La commande supprime les dossiers et fichiers de `/target`.

**mvn test**
- resources
- compile
- testResources
- testCompile
- test

La commande crée les dossiers :
- classes/
- test-classes/
- surefire-reports/
- maven-status/

**mvn package**
- resources
- compile
- testResources
- testCompile
- test
- jar

La commande crée les fichiers :
- classes/
- test-classes/
- surefire-reports/
- maven-status/
- bank-application-1.0-SNAPSHOT.jar

La différence entre `package` et `verify`, c'est que l'un produit un fichier .jar alors que l'autre vérifie la validité de ce package .jar.

