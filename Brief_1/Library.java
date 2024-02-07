import java.util.Scanner;
import java.util.ArrayList;

class Library {
    ArrayList<Book> books;
    ArrayList<Student> students;

    public Library(){
        this.books=new ArrayList<>();
        this.students= new ArrayList<>();
    }

    void addBook(){
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

    }

    void displayBooks(){
        System.out.print("La list des livers : ");
        for (Book ignored : books){
            System.out.print("Titre : ");
            System.out.print("");
            System.out.print("");
            System.out.print("");
        }
    }

    void deleteBook(){
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        String titre=scanner.nextLine();
        if(book.getTitre().equalsIgnoreCase(titre)){
            books.remove(book);
        }

    }

    public void searchBook() {
        Scanner scanner = new Scanner(System.in);
        String titre=scanner.nextLine();
        for (Book book : books) {
            if (book.getTitre().equalsIgnoreCase(titre)) {
                System.out.println("Title: " + book.getTitre());
                System.out.println("Author: " + book.getAuteur());
            } else {
                System.out.println("Book not found.");
            }
        }
    }

}

