import java.util.ArrayList;

class Student {
    String nom;
    String adress;
    String id;
    ArrayList<Book> borrowBook;

    public Student (String nom, String adress, String id) {
        this.nom = nom;
        this.adress = adress;
        this.id = id;
    }

    public Student (){
        this.borrowBook = new ArrayList<>();
    }

}

