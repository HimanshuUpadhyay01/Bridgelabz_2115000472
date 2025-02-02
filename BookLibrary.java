class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;
    void setAuthor(String author) {
    this.author = author;
    }
    String getAuthor() {
    return author;
    }
    public static void main(String[] args) {
    BookLibrary book = new BookLibrary();
    book.ISBN = "123-456-789";
    book.title = "Java Fundamentals";
    book.setAuthor("John Smith");
    System.out.println("ISBN: " + book.ISBN);
    System.out.println("Title: " + book.title);
    System.out.println("Author: " + book.getAuthor());
    }
    }
    class EBook extends BookLibrary {}