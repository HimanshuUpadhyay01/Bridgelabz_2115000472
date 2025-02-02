public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }


    public static void main(String[] args) {
        // Create a book object using default constructor
        Book book1 = new Book();
        book1.setTitle("To Kill a Mockingbird");
        book1.setAuthor("Harper Lee");
        book1.setPrice(15.99);
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        // Create a book object using parameterized constructor
        Book book2 = new Book("1984", "George Orwell", 12.99);
        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}