import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private int pageNumber;
    private LocalDate publishDate;

    public Book(String name, String author, int pageNumber, LocalDate publishDate) {
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", publishDate=" + publishDate;
    }
}
