# testcanal-serenity
Ce test **Cucumber** a été développé avec IntelliJ IDEA.


Pour installer l'application et exécuter le test, lancer cette commande:

**mvn clean install**


Pour visualiser le rapport Serenity, ouvrir ce fichier:

**target/site/serenity/index.html**


Afin de pouvoir exécuter plusieurs instances de ce test en parallèle, dans IntelliJ IDEA, installer le plugin _TestNG-J_.

Dans _testng.xml_ situé à la racine, remplacer la valeur de l'attribut "name" de l'élément "test" par le chemin du projet.

Dans le panneau d'exploration du projet, faire un clic droit sur le fichier testng.xml, puis "Run".

**Structure de l'application**

**pom.xml**

**src/test/resources/features**: Scénarios de test.

**org.example.acceptancetests.AcceptanceTestSuite**: La série de tests.

**org.example.steps.StepDefinitions**: Les étapes du cas de test.

Package **org.example.model**: Classes de modèle représentant les entités fonctionnelles.

Package **org.example.services**: Classes de service qui interrogent le MockServer.

**org.example.mock.CanalExpInitializer**: Classe qui définit les réponses du MockServer.

**Echecs**:

Le MockServer ne répond pas.

Le fichier DTD associé à _testng.xml_ n'est pas chargé, et des erreurs se produisent même en spécifiant sa copie locale.
