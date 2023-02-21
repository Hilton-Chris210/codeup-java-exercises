package mediaEx;

import javax.swing.plaf.PanelUI;

public class Book extends Media {
    private String author;
    private String publisher;
    private int pages;

    public Book(String title, String category, int year, String author, String publisher, int pages) {
        super(title, category, year);
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void printMedia() {
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Year: " + this.year);
        System.out.println("Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Pages: " + this.pages);
        System.out.println("Checked Out: " + this.isCheckedOut);
        System.out.println("Times Checked Out: " + this.timesCheckedOut);
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "Fiction", 1925, "F. Scott Fitzgerald", "Charles Scribner's Sons", 180);
        Book book2 = new Book("The Catcher in the Rye", "Fiction", 1951, "J.D. Salinger", "Little, Brown and Company", 277);
        Book book3 = new Book("The Grapes of Wrath", "Fiction", 1939, "John Steinbeck", "The Viking Press", 464);
        book1.printMedia();
        book2.printMedia();
        book3.printMedia();
    }
}

