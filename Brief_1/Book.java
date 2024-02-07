class Book {
    String titre;
    String auteur;
    String isbn;
    String publicationDate;

    public Book(String titre, String auteur, String isbn, String publicationDate){
        this.titre=titre;
        this.auteur=auteur;
        this.isbn=isbn;
        this.publicationDate=publicationDate;
    }
    String getTitre() {
        return titre;
    }
    String getAuteur() {
        return auteur;
    }
}
