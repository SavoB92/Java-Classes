package class19;
public class Book {
/*Write Book class that will have instance variables and 2 Constructors. While creating an
object make sure:
Instance variables are being initialized
Both Constructors are being executed*/

    String name;
    int numberOfPages;
    int year;

    Book (String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    Book (String name, int numberOfPages, int year) {
        this (name, numberOfPages);
        this.year = year;
    }

    void info () {
        System.out.println("Name:"+name+" Number of pages:"+numberOfPages);
    }

    public static void main(String[] args) {

        Book book1 = new Book ("Java", 121);
        Book book2 = new Book ("Selenium", 150, 13);
        book1.info();
        book2.info();
    }

}
