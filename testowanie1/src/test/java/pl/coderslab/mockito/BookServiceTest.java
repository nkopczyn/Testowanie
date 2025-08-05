package pl.coderslab.mockito;

import org.junit.jupiter.api.Test;
import pl.coderslab.asercje.Book;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void findBookByTitle() {
        BookRepository br = mock(BookRepository.class);
        BookService bs = new BookService(br);

        when(br.findBookByTitle("title1")).thenReturn(new Book("title1", "author", 2023));

        Book book = bs.findBookByTitle("title1");
        assertEquals("title1", book.getTitle());
    }
}