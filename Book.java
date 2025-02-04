public class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;
    
    public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    }
    
    public static void displayLibraryName() {
    System.out.println("Library Name: " + libraryName);
    }
    
    public void displayBookDetails() {
    if (this instanceof Book) {
    System.out.println("Library Name: " + libraryName);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    } else {
    System.out.println("This is not a Book instance.");
    }
    }
    
    public String getIsbn() {
    return isbn;
    }
    
    public String getTitle() {
    return title;
    }
    
    public String getAuthor() {
    return author;
    }
    
    public static void main(String[] args) {
    Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
    book1.displayBookDetails();
    book2.displayBookDetails();
    Book.displayLibraryName();
    }
    }
    