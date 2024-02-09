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
            System.out.println("6. add student");
            System.out.println("7. delete student");
            System.out.println("8. display Students");
            System.out.println("9. lend book");
            System.out.println("10. return book");
            System.out.println("0_ exit");
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
                    library.modifyBook();
                    break;
                case 6:
                    library.addStudent();
                    break;
                case 7:
                    library.deleteStudent();
                    break;
                case 8:
                    library.displayStudents();
                    break;
                case 9:
                    library.lendBook();
                    break;
                case 10:
                    library.returnBook();
                    break;
                case 0:
                    System.out.println("your exiting");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while (choice != 0);
    }
}
