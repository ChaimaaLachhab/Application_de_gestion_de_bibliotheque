import java.util.Scanner;
import java.util.ArrayList;

class Library {
    Student student= new Student();
    ArrayList<Book> books;
    ArrayList<Student> students;

    public Library(){
        this.books=new ArrayList<>();
        this.students= new ArrayList<>();
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrer le titre : ");
        String titre = scanner.nextLine();
        System.out.print("entrer l'auteur : ");
        String auteur = scanner.nextLine();
        System.out.print("entrer ISBN : ");
        String isbn = scanner.nextLine();
        System.out.print("entrer la date de publication : ");
        String publicationDate = scanner.nextLine();
        Book newBook = new Book(titre, auteur, isbn, publicationDate);
        books.add(newBook);
        System.out.println("ajouter avec succes");
    }

    void displayBooks(){
        if(books.isEmpty()){
            System.out.println("la bibliotheque est vide");
        } else {
            System.out.println("La list des livers : ");
            for (Book book : books) {
                System.out.println("Titre : " + book.titre);
                System.out.println("Auteur : " + book.auteur);
                System.out.println("ISBN : " + book.isbn);
                System.out.println("Date de publication : " + book.publicationDate);
                System.out.println();
            }
        }
    }

    void deleteBook() {
        if(books.isEmpty()){
            System.out.println("la bibliotheque est vide");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("entrer le titre de live à supprimer :  ");
            String titre = scanner.nextLine();
            boolean isRemoved = books.removeIf(book -> book.titre.equalsIgnoreCase(titre));
            if(isRemoved)
            System.out.println("suppression avec succes");
            else {
                System.out.println("le livre n'existe pas");
            }
        }
    }


    void modifyBook(){
        if (books.isEmpty()) {
            System.out.println("la bibliotheque est vide");
        } else {
            Scanner scanne = new Scanner(System.in);
            System.out.print("Entrer le titre de livre à modifier: ");
            String titre = scanne.nextLine();
            boolean found = false;
            for (Book book : books) {
                if (book.titre.equalsIgnoreCase(titre)) {
                    book.modifyBook();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Book not found");
            }
        }
    }


    public void searchBook() {
        if (books.isEmpty()) {
            System.out.println("la bibliotheque est vide");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrer le titre de livre à rechercher : ");
            String titre = scanner.nextLine();
            boolean found = false;
            for (Book book : books) {
                if (book.titre.equalsIgnoreCase(titre)) {
                    System.out.println("Book found :");
                    System.out.println("Titre : " + book.titre);
                    System.out.println("Auteur : " + book.auteur);
                    System.out.println("ISBN : " + book.isbn);
                    System.out.println("Date de publication : " + book.publicationDate);
                    System.out.println();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Book not found.");
            }
        }
    }

    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrer le nom : ");
        String nom = scanner.nextLine();
        System.out.print("entrer l'adress : ");
        String adress = scanner.nextLine();
        System.out.print("entrer ID : ");
        String id = scanner.nextLine();
        Student newStudent = new Student(nom, adress, id);
        students.add(newStudent);
        System.out.println("ajouter avec succes");
    }

    void displayStudents(){
        if(students.isEmpty()){
            System.out.println("la liste est vide");
        } else {
            System.out.println("La list des students : ");
            for (Student studenti : students) {
                System.out.println("nom : " + studenti.nom);
                System.out.println("adress : " + studenti.adress);
                System.out.println("id : " + studenti.id);
                System.out.println("borrow book : " + studenti.bookLend);
                System.out.println();
            }
        }
    }

    void deleteStudent() {
        if(students.isEmpty()){
            System.out.println("la bibliotheque est vide");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("entrer le nom de student à supprimer :  ");
            String nom = scanner.nextLine();
            for (Student studenti : students){
                if (studenti.nom.equalsIgnoreCase(nom)) {
                    students.remove(studenti);
                }
                System.out.println("suppression avec succes");
            }
        }
    }


    public void lendBook(){
        if (books.isEmpty() || students.isEmpty()) {
            System.out.println("La bibliothèque ou la liste des students est vide.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez le nom de student qui veux emprunter le livre :");
            String nom = scanner.nextLine();
            Student emprunteur = null;
            for (Student studenti : students) {
                if (studenti.nom.equalsIgnoreCase(nom)) {
                    emprunteur = studenti;
                    break;
                }
            }

            if (emprunteur == null) {
                System.out.println("L'étudiant n'a pas trouver");
                return;
            }

            System.out.println("Entrez le titre du livre à emprunter :");
            String titre = scanner.nextLine();
            Book bookld = null;
            for (Book booki : books) {
                if (booki.titre.equalsIgnoreCase(titre)) {
                    bookld = booki;
                    break;
                }
            }

            if (bookld == null) {
                System.out.println("Le livre n'a pas trouver");
                return;
            }
            if (bookld.isBooked) {
                System.out.println("Ce livre est deja reserve.");
                return;
            }


            student.bookLend.add(bookld);
            bookld.isBooked = true;
            bookld.emprunteur = emprunteur.nom;
            System.out.println("Le livre emprunte avec succes.");
        }
    }

    public void returnBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre le titre de livre à rendre");
        String titre = scanner.nextLine();
        for (Student studenti : students) {
            for (Book booki : studenti.bookLend) {
                if (booki.titre.equalsIgnoreCase(titre)) {
                    student.bookLend.remove(booki);
                    books.add(booki);
                    break;
                }
            }
        }
    }

    public void displayBookRe(){
        if(student.bookLend.isEmpty()){
            System.out.println("la lise des booklend est vide");
        }else{
            boolean bookRe = false;
            for (Book book : books) {
                if (book.isBooked) {
                    System.out.println("Titre : " + book.titre);
                    System.out.println("Auteur : " + book.auteur);
                    System.out.println("Emprunteur : " + book.emprunteur);
                    System.out.println();
                    bookRe = true;
                }
            }
            if (!bookRe) {
                System.out.println("Aucun livre n'est actuellement réservé.");
            }



        }

    }
}

