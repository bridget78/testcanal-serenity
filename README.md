# testcanal-serenity
Ce test Cucumber a été développé avec IntelliJ IDEA.

Pour installer l'application, et exécuter le test, lancer cette commande:
mvn clean install

Pour visualiser le rapport Serenity, ouvrir ce fichier:
target/site/serenity/index.html

Afin de pouvoir exécuter plusieurs instances de ce test en parallèle, dans IntelliJ IDEA, installer le plugin TestNG-J.

Dans testng.xml situé à la racine, remplacer la valeur de l'attribut "name" de l'élément "test" par le chemin du projet.

Dans le panneau d'exploration du projet, faire un clic droit sur le fichier testng.xml, puis "Run".

Si le fichier DTD ne peut pas être chargé, remplacer son URL par le chemin de se copie locale, à la racine aussi.
C'est-à-dire remplacer:
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
par:
<!DOCTYPE suite SYSTEM "file://(Chemin du projet)/testng-1.0.dtd">

Echec:
Le MockServer ne répond pas.
