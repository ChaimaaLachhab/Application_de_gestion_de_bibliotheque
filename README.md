# Application_de_gestion_de_bibliotheque

Ce projet est une application de gestion de bibliothèque permettant aux utilisateurs d'ajouter, de supprimer, de modifier et d'afficher des livres, ainsi que d'ajouter, de supprimer et d'afficher des étudiants. De plus, les utilisateurs peuvent emprunter et retourner des livres.

## Fonctionnalités

### Menu

- Affiche un menu interactif pour accéder aux différentes fonctionnalités du programme.
- Gère les entrées utilisateur pour exécuter les fonctionnalités correspondantes.

### Library

- `addBook()`: Permet d'ajouter un livre à la bibliothèque.
- `deleteBook()`: Permet de supprimer un livre de la bibliothèque.
- `modifyBook()`: Permet de modifier les détails d'un livre existant.
- `displayBooks()`: Affiche tous les livres présents dans la bibliothèque.
- `addStudent()`: Permet d'ajouter un étudiant à la liste des emprunteurs.
- `deleteStudent()`: Permet de supprimer un étudiant de la liste des emprunteurs et de retourner les livres empruntés par cet étudiant.
- `displayStudents()`: Affiche tous les étudiants inscrits.
- `borrowBook()`: Permet à un étudiant d'emprunter un livre de la bibliothèque.
- `returnBook()`: Permet à un étudiant de retourner un livre emprunté.
- `displayBookBr()`: Affiche les livres actuellement empruntés.

### Book

- Modèle de données représentant un livre avec les attributs suivants :
  - Titre
  - Auteur
  - ISBN
  - Date de publication
  - Emprunteur (si le livre est emprunté)
  - Statut de réservation (si le livre est emprunté ou non)

### Student

- Modèle de données représentant un étudiant avec les attributs suivants :
  - Nom
  - Adresse
  - ID
  - Liste des livres empruntés

## Comment utiliser

Clonez ce dépôt avec la commande git clone https://github.com/chaimalac/Application_de_gestion_de_bibliotheque.git.
Accédez au répertoire du projet avec la commande  cd chemin/vers/le/dossier.
Compilez le code source avec la commande javac Menu.java.
Exécutez le programme avec la commande java Menu.
Suivez les instructions affichées dans la console pour utiliser l'application.

## Exigences

- Java Development Kit (JDK) installé sur votre machine.

## Auteur

Cette application a été développée par CHAIMAA LACHHAB, sous la supervision de l'école ENAA Béni Mellal.

