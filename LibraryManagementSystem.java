abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author) {
    this.itemId = itemId;
    this.title = title;
    this.author = author;
    }
    public String getItemId() {
    return itemId;
    }
    public String getTitle() {
    return title;
    }
    public String getAuthor() {
    return author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails() {
    System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
    }
    class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
    super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
    return 14;
    }
    }
    class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
    super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
    return 7;
    }
    }
    class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
    super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
    return 3;
    }
    }
    interface Reservable {
    void reserveItem();
    boolean checkAvailability();
    }
    class LibraryManagementSystem {
    public static void main(String[] args) {
    LibraryItem book = new Book("B123", "The Great Gatsby", "F. Scott Fitzgerald");
    LibraryItem magazine = new Magazine("M456", "National Geographic", "Various");
    LibraryItem dvd = new DVD("D789", "Inception", "Christopher Nolan");
    System.out.println("Details of Library Items:");
    book.getItemDetails();
    System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
    magazine.getItemDetails();
    System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");
    dvd.getItemDetails();
    System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
    }
    }