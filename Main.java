import pack.Author;
import pack.Table;
import pack.Book;
import pack.Image;
import pack.Section;
import pack.Paragraph;
import pack.Table;

public class Main {

    public static void main(String[] args) {

        Book Carte1 = new Book("Carte1");
        Section capitol1 = new Section("Capitolul 1");
        capitol1.add(new Paragraph("text1"));
        capitol1.add(new Paragraph("text2"));
        capitol1.add(new Image("Image1"));
        Carte1.add(capitol1);
        Carte1.add(new Paragraph("paragraf1"));
        Carte1.print();
    }
}
