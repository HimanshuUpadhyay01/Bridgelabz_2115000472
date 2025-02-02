public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public LibraryBook() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
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

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Is Available: " + isAvailable);
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is already available.");
        }
    }

    // Method to update book details
    public void updateDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Book details updated successfully!");
    }

    // Main method
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("To Kill a Mockingbird", "Harper Lee", 15.99);
        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
        book.returnBook();
        book.displayDetails();
        book.updateDetails("1984", "George Orwell", 12.99);
        book.displayDetails();
    }
}