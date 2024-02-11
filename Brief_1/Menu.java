import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Library library = new Library();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println(".................................................MENU....................................................");
            System.out.println();
            System.out.println("..............BOOK.............................STUDENT.............................Emprunt...............");
            System.out.println(".        1- add book              ..                                 ..                                 .");
            System.out.println(".        2- delete book           ..        6. add student           ..        9. borrow book           .");
            System.out.println(".        3- search book           ..        7. delete student        ..        10. return book          .");
            System.out.println(".        4_ modify book           ..        8. display Students      ..        11. display borrow book  .");
            System.out.println(".        5- display books         ..                                 ..                                 .");
            System.out.println(".........................................................................................................");
            System.out.println();
            System.out.println("....................................           0. Exit             ......................................");
            System.out.println();
            System.out.print("..............Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.deleteBook();
                    break;
                case 3:
                    library.searchBook();
                    break;
                case 4:
                    library.modifyBook();
                    break;
                case 5:
                    library.displayBooks();
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
                    library.borrowBook();
                    break;
                case 10:
                    library.returnBook();
                    break;
                case 11:
                    library.displayBookBr();
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
