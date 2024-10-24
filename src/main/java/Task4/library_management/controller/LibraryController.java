package Task4.library_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Task4.library_management.model.Book;
import Task4.library_management.model.Borrower;
import Task4.library_management.service.BorrowerService;
import Task4.library_management.service.Loan;
import Task4.library_management.service.LoanService;
import main.java.Task4.library_management.service.BookService;

import java.util.List;


@RestController
@RequestMapping("/library")
public class LibraryController {

    private final BookService bookService;
    private final BorrowerService borrowerService;
    private final LoanService loanService;

    // Constructor injection for all services
    @Autowired
    public LibraryController(BookService bookService, BorrowerService borrowerService, LoanService loanService) {
        this.bookService = bookService;
        this.borrowerService = borrowerService;
        this.loanService = loanService;
    }

    @PostMapping("/add-book")
    public Book addBook(@RequestParam String title, @RequestParam String author, @RequestParam String isbn) {
        return bookService.addBook(title, author, isbn);
    }

    @PostMapping("/register-borrower")
    public Borrower registerBorrower(@RequestParam String name, @RequestParam String email) {
        return borrowerService.registerBorrower(name, email);
    }

    @PostMapping("/checkout-book")
    public Loan checkoutBook(@RequestParam Long borrowerId, @RequestParam Long bookId) {
        Borrower borrower = borrowerService.getBorrowerById(borrowerId);
        Book book = bookService.getBookById(bookId);
        return loanService.checkoutBook(borrower, book);
    }

    @PostMapping("/return-book")
    public Loan returnBook(@RequestParam Long loanId) {
        Loan loan = loanService.getLoanById(loanId);
        return loanService.returnBook(loan);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
