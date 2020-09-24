# testcanal-serenity
Ce test Cucumber a été développé avec IntelliJ IDEA.


Pour installer l'application, et exécuter le test, lancer cette commande:

mvn clean install


Pour visualiser le rapport Serenity, ouvrir ce fichier:

target/site/serenity/index.html


Afin de pouvoir exécuter plusieurs instances de ce test en parallèle, dans IntelliJ IDEA, installer le plugin TestNG-J.

Dans testng.xml situé à la racine, remplacer la valeur de l'attribut "name" de l'élément "test" par le chemin du projet.

Dans le panneau d'exploration du projet, faire un clic droit sur le fichier testng.xml, puis "Run".


Echecs:

Le MockServer ne répond pas.

Le fichier DTD associé à testng.xml n'est pas chargé, de erreurs se produisent même en spécifiant sa copie locale.
