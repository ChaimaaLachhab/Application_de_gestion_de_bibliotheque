import java.util.Scanner;
import java.util.ArrayList;

class Library {
    ArrayList<Book> books;
    ArrayList<Student> students;

    public Library(){
        this.books=new ArrayList<>();
        this.students= new ArrayList<>();
    }

    /*void addBook(){
        Scanner scanner = new Scanner(System.in);
        Book newbook = new Book();
        System.out.print("entre le titre :  ");
        newbook.titre=scanner.nextLine();
        System.out.print("entre auteur :  ");
        newbook.auteur=scanner.nextLine();
        System.out.print("entre ISBN :  ");
        newbook.isbn=scanner.nextLine();
        System.out.print("entre la date de publication :  ");
        newbook.publicationDate=scanner.nextLine();
        books.add(newbook);

    }*/

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
            books.removeIf(book -> book.titre.equalsIgnoreCase(titre));
            System.out.println("suppression avec succes");
        }
    }

    /*void deletteBook() {
        Scanner scanner = new Scanner(System.in);
        String titre = scanner.nextLine();
        for (Book book : books){
            if (book.getTitre().equalsIgnoreCase(titre)) {
                books.remove(book);
            }
        }
    }*/

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
}

