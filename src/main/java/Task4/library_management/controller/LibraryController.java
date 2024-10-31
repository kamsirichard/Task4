package Task4.library_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Task4.library_management.model.Book;
import Task4.library_management.model.Borrower;
import Task4.library_management.model.loan;  // Ensure Loan model is imported correctly
import Task4.library_management.service.BorrowerService;
import Task4.library_management.service.Loan;
import Task4.library_management.service.LoanService;
import Task4.library_management.service.BookService;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Book> addBook(@RequestParam String title, @RequestParam String author, @RequestParam String isbn) {
        Book newBook = bookService.addBook(title, author, isbn);
        return ResponseEntity.ok(newBook);
    }

    @PostMapping("/register-borrower")
    public ResponseEntity<Borrower> registerBorrower(@RequestParam String name, @RequestParam String email) {
        Borrower newBorrower = borrowerService.registerBorrower(name, email);
        return ResponseEntity.ok(newBorrower);
    }

    @PostMapping("/checkout-book")
    public ResponseEntity<Loan> checkoutBook(@RequestParam Long borrowerId, @RequestParam Long bookId) {
        Borrower borrower = borrowerService.getBorrowerById(borrowerId);
        Optional<Book> book = bookService.getBookById(bookId);
        
        if (borrower == null || book == null) {
            return ResponseEntity.notFound().build();  // Return 404 if borrower or book not found
        }
        
        Loan loan = loanService.checkoutBook(borrower, book);
        return ResponseEntity.ok(loan);
    }

    @PostMapping("/return-book")
    public ResponseEntity<Loan> returnBook(@RequestParam Long loanId) {
        Loan loan = loanService.getLoanById(loanId);
        
        if (loan == null) {
            return ResponseEntity.notFound().build();  // Return 404 if loan not found
        }
        
        Loan returnedLoan = loanService.returnBook(loan);
        return ResponseEntity.ok(returnedLoan);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }
}
