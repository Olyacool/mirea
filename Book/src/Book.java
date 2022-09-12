import java.lang.*;
public class Book {
    private String type;
    private String author;
    private int sheets;

    public String getName() {
        return type;
    }

    public Book(String t, String a, int s){
        type = t;
        author = a;
        sheets = s;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Книга типа " + type + " автора " + author + " имеет " + sheets + " страниц";
    }

}