package Task4.library_management.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import Task4.library_management.model.Book;
import Task4.library_management.model.Borrower;

@Service
public class LoanService {

    // Field-based Dependency Injection
    @SuppressWarnings("rawtypes")
    @Autowired
    private ListCrudRepository loanRepository;

    @SuppressWarnings("unchecked")
    public Loan checkoutBook(Borrower borrower, Optional<Book> book) {
        Loan loan = new Loan();
        loan.setBorrower(borrower);
        loan.setBook(book);
        loan.setLoanDate(LocalDate.now());
        loan.setReturnDate(null);  // Book not returned yet
        return (Loan) loanRepository.save(loan);
    }

    // Business logic to return a book
    @SuppressWarnings("unchecked")
    public Loan returnBook(Loan loan) {
        loan.setReturnDate(LocalDate.now());
        return (Loan) loanRepository.save(loan);
    }

    public Loan getLoanById(Long loanId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoanById'");
    }
}
