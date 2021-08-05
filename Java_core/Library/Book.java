package Library;

public class Book {
    private static Long genId = 1L;
    private Long id;
    private String name;
    private String category; // thể loại
    private String author; // tác giả
    private int year;
    private String producer; //nhà sản xuất
    private int bookPageNumber;

    public Book() {
    }

    public Book(String name, String category, String author, int year, String producer, int bookPageNumber) {
        this.id = genId++;
        this.name = name;
        this.category = category;
        this.author = author;
        this.year = year;
        this.producer = producer;
        this.bookPageNumber = bookPageNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", producer='" + producer + '\'' +
                ", bookPageNumber=" + bookPageNumber +
                '}';
    }
}
