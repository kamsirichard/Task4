package Task4.library_management.service;
import java.util.List;
import java.util.Optional;

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


    // Business logic to find a book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Business logic to delete a book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
