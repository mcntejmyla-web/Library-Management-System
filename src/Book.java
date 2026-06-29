public class Book {

    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    // Constructor
    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter for ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for Title
    public String getTitle() {
        return title;
    }

    // Setter for Title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for Author
    public String getAuthor() {
        return author;
    }

    // Setter for Author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for Genre
    public String getGenre() {
        return genre;
    }

    // Setter for Genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter for Availability
    public boolean isAvailable() {
        return available;
    }

    // Setter for Availability
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display Book Details
    public void displayBook() {
        System.out.println("ISBN      : " + isbn);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Genre     : " + genre);
        System.out.println("Available : " + available);
        System.out.println("----------------------------------");
    }
}
