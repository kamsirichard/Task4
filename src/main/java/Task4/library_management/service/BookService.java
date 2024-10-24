package Task4.library_management.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Task4.library_management.model.Book;
import Task4.library_management.respository.BookRepository;
@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor-based Dependency Injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Business logic to add a new book
    public Book addBook(String title, String author, String isbn) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }

    // Business logic to get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
