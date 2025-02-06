import java.util.ArrayList;
class Book{
private String title;
private String author;
public Book(String title,String author){
this.title=title;
this.author=author;
}
public String getTitle(){
return title;
}
public String getAuthor(){
return author;
}
@Override
public String toString(){
return "Title: "+title+", Author: "+author;
}
}
class Library{
private ArrayList<Book> books;
public Library(){
books=new ArrayList<>();
}
public void addBook(Book book){
books.add(book);
}
public void displayBooks(){
System.out.println("Books in Library:");
for(Book book:books){
System.out.println(book);
}
}
}
public class LibraryAndBooks{
public static void main(String[] args){
Book book1=new Book("The Great Gatsby","F. Scott Fitzgerald");
Book book2=new Book("1984","George Orwell");
Book book3=new Book("To Kill a Mockingbird","Harper Lee");
Library library1=new Library();
Library library2=new Library();
library1.addBook(book1);
library1.addBook(book2);
library2.addBook(book3);
library1.displayBooks();
library2.displayBooks();
}
}
