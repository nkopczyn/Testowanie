package pl.coderslab.asercje;

public class Book {
    public String title;
    public String author;
    public int yearOfPublication;
    public boolean isAvailable = true;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
