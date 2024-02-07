import java.util.Scanner;
//import java.util.ArrayList;
public class Menu {
    public static void main(String[] args) {
        Library library = new Library();
        int choice=0;
        Scanner scanne = new Scanner(System.in);
        do {
            System.out.print("........MENU.........");
            System.out.print("1- add book ");
            System.out.print("2- display books ");
            System.out.print("3- delete book ");
            System.out.print("4- search book");
            System.out.print("Enter your choice:  ");
            choice = scanne.nextInt();

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
                    System.out.println("your exiting");
                default:
                    System.out.print("invalid choice");
                    break;
            }
        }while (choice != 5);
    }
}
