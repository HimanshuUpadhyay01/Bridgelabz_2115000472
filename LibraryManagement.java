class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
    this.title = title;
    this.publicationYear = publicationYear;
    }
    void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Publication Year: " + publicationYear);
    }
    }
    class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
    super(title, publicationYear);
    this.name = name;
    this.bio = bio;
    }
    void displayInfo() {
    super.displayInfo();
    System.out.println("Author Name: " + name);
    System.out.println("Author Bio: " + bio);
    }
    }
    public class LibraryManagement {
    public static void main(String[] args) {
    Author author = new Author("The Great Adventure", 2021, "John Doe", "John is a writer known for his adventurous tales.");
    author.displayInfo();
    }
    }
    