package Task4.library_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Task4.library_management.model.Book;
import Task4.library_management.model.Borrower;
import Task4.library_management.respository.BookRepository;

@Service
public class BorrowerService {

    private BookRepository borrowerRepository;

    // Setter-based Dependency Injection
    @Autowired
    public void setBorrowerRepository(BookRepository borrowerRepository) {
        this.borrowerRepository = borrowerRepository;
    }

    // Business logic to add a new borrower
    public Borrower registerBorrower(String name, String email) {
        Borrower borrower = new Borrower();
        borrower.setName(name);
        borrower.setEmail(email);
        return borrowerRepository.save(borrower);
    }

    // Business logic to get all borrowers
    public List<Book> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    public Borrower getBorrowerById(Long borrowerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBorrowerById'");
    }
}
