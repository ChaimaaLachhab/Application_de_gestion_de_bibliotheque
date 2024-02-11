
import java.util.Scanner;

class Book {
    String titre;
    String auteur;
    String isbn;
    String publicationDate;
    String emprunteur;
    boolean isBooked;

    public Book(String titre, String auteur, String isbn, String publicationDate){
        this.titre=titre;
        this.auteur=auteur;
        this.isbn=isbn;
        this.publicationDate=publicationDate;
        this.isBooked=false;
    }



    public void modifyBook() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Entrer new titre: ");
                    this.titre = scanner.nextLine();
                    System.out.print("Entrer new auteur: ");
                    this.auteur = scanner.nextLine();
                    System.out.print("Entrer new ISBN: ");
                    this.isbn = scanner.nextLine();
                    System.out.print("Entrer new date de publication: ");
                    this.publicationDate = scanner.nextLine();
                    System.out.println("modifier avec succes");

    }
}


