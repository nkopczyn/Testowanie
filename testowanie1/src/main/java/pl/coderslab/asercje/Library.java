package pl.coderslab.asercje;

import java.util.ArrayList;
import java.util.List;


public class Library {
    public List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;

    }

    public List<Book> searchByTitle(String title) {
        List<Book> booksWithTitle = new ArrayList<>();

        for (Book b : bookList) {
            if (b.getTitle().equals(title)) {
                booksWithTitle.add(b);
            }
        }
        return booksWithTitle;
    }

    public String borrowBook(String title, String author) {
        String message = "";

        for (Book b : bookList) {
            if (b.getTitle().equals(title) && b.getAuthor().equals(author)) {
                if (b.isAvailable) {
                    b.isAvailable = false;
                    message += "Książka " + b.getTitle() + " została wypożyczona.";
                    //return "Książka " + b.getTitle() + " została wypożyczona.";
                } else {
                    message += "Książka " + b.getTitle() + " jest niedostępna.";
                    //return "Książka " + b.getTitle() + " jest niedostępna.";
                }
            }
        }
        return message;
    }

    public void returnBook(String title, String author) {

        for (Book b : bookList) {
            if (b.getTitle().equals(title) && b.getAuthor().equals(author)) {
                if (!(b.isAvailable)) {
                    b.isAvailable = true;

                } else {
                    System.out.println("Book was not borrowed!");

                }
            }
        }

    }
}
