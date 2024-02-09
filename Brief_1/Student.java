import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String nom;
    String adress;
    String id;
    ArrayList<Book> bookLend;



    public Student (String nom, String adress, String id) {
        this.nom = nom;
        this.adress = adress;
        this.id = id;
    }
    public Student(){
        this.bookLend = new ArrayList<>();
    }
}

