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
        System.out.println("entrer les information de BOOK : ");
        System.out.print("Titre : ");
        String titre = scanner.nextLine();
        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();
        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();
        System.out.print("Date de publication : ");
        String publicationDate = scanner.nextLine();
        Book newBook = new Book(titre, auteur, isbn, publicationDate);
        books.add(newBook);
        System.out.println("Ajouter avec succes");
    }

    void displayBooks(){
        if(books.isEmpty()){
            System.out.println("la bibliotheque est vide");
        } else {
            System.out.println("La list des livers : ");
            System.out.println();
            for (int i=0 ; i< books.size();i++) {
                System.out.println("Book "+ (i+1));
                System.out.println("Titre : " + books.get(i).titre);
                System.out.println("Auteur : " + books.get(i).auteur);
                System.out.println("ISBN : " + books.get(i).isbn);
                System.out.println("Date de publication : " + books.get(i).publicationDate);
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
        System.out.println("entrer les information de STUDENT : ");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Adress : ");
        String adress = scanner.nextLine();
        System.out.print("ID : ");
        String id = scanner.nextLine();
        Student newStudent = new Student(nom, adress, id);
        students.add(newStudent);
        System.out.println("ajouter avec succes");
    }

    void displayStudents(){
        if(students.isEmpty()){
            System.out.println("la liste des students est vide");
        } else {
            System.out.println("La list des students : ");
            for (int i=0; i< students.size();i++) {
                System.out.println();
                System.out.println("Student "+ (i+1));
                System.out.println("nom : " + students.get(i).nom);
                System.out.println("adress : " + students.get(i).adress);
                System.out.println("id : " + students.get(i).id);
                System.out.println();
            }
        }
    }


    void deleteStudent() {
        if (students.isEmpty()) {
            System.out.println("La liste des étudiants est vide");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the student to delete: ");
            String nom = scanner.nextLine();

            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).nom.equalsIgnoreCase(nom)) {
//                    if (!students.get(i).bookLend.isEmpty()) {
//                        for (Book book : students.get(i).bookLend) {
//                            book.isBooked = false;
//                            book.emprunteur = null;
//                        }
//                    }
                    students.remove(i);
                    System.out.println("Student deleted successfully.");
                    return;
                }
            }
            System.out.println("Student not found.");
        }
    }


    public void borrowBook(){
        if (books.isEmpty() || students.isEmpty()) {
            System.out.println("La bibliothèque ou la liste des students est vide.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez le nom de student qui veut emprunter le livre :");
            String nom = scanner.nextLine();
            Student emprunteur = null;
            for (Student studenti : students) {
                if (studenti.nom.equalsIgnoreCase(nom)) {
                    emprunteur = studenti;
                    break;
                }
            }

            if (emprunteur == null) {
                System.out.println("student ne trouve pas");
                return;
            }

            System.out.println("entre le titre du student à emprunter :");
            String titre = scanner.nextLine();
            boolean bookTrouve = false;
            for (Book booki : books) {
                if (booki.titre.equalsIgnoreCase(titre)) {
                    bookTrouve = true;
                    if (booki.isBooked) {
                        System.out.println("Ce book est deja reserve.");
                        return;
                    }else {
                        student.borrowBook.add(booki);
                        booki.isBooked = true;
                        booki.emprunteur = emprunteur.nom;
                        System.out.println("Le book emprunte avec succes.");
                    }
                    break;
                }
            }

            if (!bookTrouve) {
                System.out.println("le book ne trouve pas");
            }
        }
    }

    public void returnBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre le titre de book à rendre");
        String titre = scanner.nextLine();
        for (int i = 0; i < student.borrowBook.size(); i++) {
            Book book = student.borrowBook.get(i);
            if (book.titre.equalsIgnoreCase(titre)) {
                student.borrowBook.remove(i);
                book.isBooked = false;
                book.emprunteur = null;
                System.out.println("book rendu avec succes.");
                return;
            }
        }
    }

    public void displayBookBr(){
        if(student.borrowBook.isEmpty()){
            System.out.println("la lise des booklend est vide");
        }else{
            boolean bookRe = false;
            System.out.println("la liste de reservation :");
            for (int i=0; i<books.size(); i++) {
                if (books.get(i).isBooked) {
                    System.out.println();
                    System.out.println("reseve N-"+ (i+1));
                    System.out.println("Emprunteur : " + books.get(i).emprunteur);
                    System.out.println("Titre : " + books.get(i).titre);
                    System.out.println("Auteur : " + books.get(i).auteur);
                    System.out.println();
                    bookRe = true;
                }
            }
            if (!bookRe) {
                System.out.println("Aucun book reservé");
            }
        }
    }
}

