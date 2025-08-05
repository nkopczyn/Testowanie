package pl.coderslab.mockito;

import pl.coderslab.asercje.Book;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }
}
