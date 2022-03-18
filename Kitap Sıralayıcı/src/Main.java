import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> unorderedBooks = new HashSet<>();
        unorderedBooks.add(new Book("Picture of Dorian Gray", "Oscar Wilde", 230, LocalDate.of(1890, Month.JUNE,1)));
        unorderedBooks.add(new Book("Picture of Dorian Gray", "Oscar Wilde", 230, LocalDate.of(1890, Month.JUNE,1)));
        unorderedBooks.add(new Book("Hobbit", "J.R.R Tolkien", 426, LocalDate.of(1937, Month.SEPTEMBER,1)));
        unorderedBooks.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, LocalDate.of(1997, Month.JULY,1)));
        unorderedBooks.add(new Book("Aşk-ı Memnu", "Halit Ziya Uşaklıgil", 424, LocalDate.of(1901, Month.JANUARY,1)));
        unorderedBooks.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 230, LocalDate.of(1943, Month.APRIL,1)));

        System.out.println("******** Unordered books ***********");

        for(Book b: unorderedBooks)
            System.out.println(b.toString());

        TreeSet<Book> orderedBooks = new TreeSet<>(new BookNameComparator());
        orderedBooks.add(new Book("Picture of Dorian Gray", "Oscar Wilde", 230, LocalDate.of(1890, Month.JUNE,1)));
        orderedBooks.add(new Book("Picture of Dorian Gray", "Oscar Wilde", 230, LocalDate.of(1890, Month.JUNE,1)));
        orderedBooks.add(new Book("Hobbit", "J.R.R Tolkien", 426, LocalDate.of(1937, Month.SEPTEMBER,1)));
        orderedBooks.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, LocalDate.of(1997, Month.JULY,1)));
        orderedBooks.add(new Book("Aşk-ı Memnu", "Halit Ziya Uşaklıgil", 424, LocalDate.of(1901, Month.JANUARY,1)));
        orderedBooks.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 230, LocalDate.of(1943, Month.APRIL,1)));

        System.out.println("******** Ordered books ***********");

        for(Book b: orderedBooks)
            System.out.println(b.toString());
    }
}
