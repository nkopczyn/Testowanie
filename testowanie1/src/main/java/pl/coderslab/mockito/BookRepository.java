package pl.coderslab.mockito;

import pl.coderslab.asercje.Book;

public interface BookRepository {
    Book findBookByTitle(String title);
}
