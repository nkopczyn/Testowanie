package pl.coderslab.asercje;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void searchByOneTitle() {

        // Given
        Book book1 = new Book("title1", "author1", 2001);
        Book book2 = new Book("title2", "author2", 2002);
        Book book3 = new Book("title3", "author3", 2003);

        List<Book> books = Arrays.asList(book1, book2, book3);
        Library library = new Library(books);

        // When
        List<Book> result = library.searchByTitle("title1");

        // Then
        assertEquals(1, result.size());
    }

    @Test
    void searchByTwoTitles() {
        // Given
        Book book1 = new Book("title2", "author1", 2001);
        Book book2 = new Book("title2", "author2", 2002);
        Book book3 = new Book("title2", "author3", 2003);

        List<Book> books = Arrays.asList(book1, book2, book3);
        Library library = new Library(books);

        // When
        List<Book> result = library.searchByTitle("title2");

        // Then
        assertEquals(3, result.size());
    }

    @Test
    void searchByEmptyTitle() {
        // Given
        Book book1 = new Book("title1", "author1", 2001);
        Book book2 = new Book("title2", "author2", 2002);
        Book book3 = new Book("title3", "author3", 2003);

        List<Book> books = Arrays.asList(book1, book2, book3);
        Library library = new Library(books);

        // When
        List<Book> result = library.searchByTitle("");

        // Then
        assertTrue(result.isEmpty());
    }

    @Test
    void searchIfAvailable() {
        // Given
        Book book1 = new Book("title1", "author1", 2001);

        List<Book> books = List.of(book1);
        Library library = new Library(books);

        // When
        //book1.isAvailable = true;

        // Then
        assertTrue(book1.isAvailable);
    }

    @Test
    void borrowBook() {
        // Given
        Book book1 = new Book("title1", "author1", 2001);
        Book book2 = new Book("title2", "author2", 2002);
        Book book3 = new Book("title3", "author3", 2003);

        List<Book> books = Arrays.asList(book1, book2, book3);
        Library library = new Library(books);

        // When
       library.borrowBook("title2", "author2");

        // Then
        assertFalse(book2.isAvailable());
    }

    @Test
    void returnBook() {
        // Given
        Book book1 = new Book("title1", "author1", 2001);
        Book book2 = new Book("title2", "author2", 2002);
        Book book3 = new Book("title3", "author3", 2003);

        List<Book> books = Arrays.asList(book1, book2, book3);
        Library library = new Library(books);

        // When
        library.borrowBook("title2", "author2");
        library.returnBook("title2", "author2");

        // Then
        assertTrue(book2.isAvailable);
    }

}