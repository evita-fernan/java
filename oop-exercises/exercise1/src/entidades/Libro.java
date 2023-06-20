package entidades;

public class Libro {
    public int ISBN;
    public String title;
    public String author;
    public int pageNumber;

    //constructor
    public Libro (){
    }

    public Libro(int ISBN, String title, String author, int pageNumber) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
    }
}
