import java.util.Scanner;
//import java.util.ArrayList;
public class Menu {
    public static void main(String[] args) {
        Library library = new Library();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("........MENU.........");
            System.out.println("1- add book ");
            System.out.println("2- display books ");
            System.out.println("3- delete book ");
            System.out.println("4- search book");
            System.out.println("5_ modify book ");
            System.out.println("6_ exit");
            System.out.print("....Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    library.deleteBook();
                    break;
                case 4:
                    library.searchBook();
                    break;
                case 5:
                    if (library.books.isEmpty()) {
                        System.out.println("la bibliotheque est vide");
                    } else {
                        Scanner scanne = new Scanner(System.in);
                        System.out.print("Entrer le titre de livre à modifier: ");
                        String title = scanne.nextLine();
                        boolean found = false;
                        for (Book book : library.books) {
                            if (book.titre.equalsIgnoreCase(title)) {
                                book.modifyBook();
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Book not found");
                        }
                    }
                    break;
                case 6:
                    System.out.println("your exiting");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while (choice != 6);
    }
}
