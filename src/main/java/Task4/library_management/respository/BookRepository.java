package Task4.library_management.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Task4.library_management.model.Book;
import Task4.library_management.model.Borrower;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Borrower save(Borrower borrower);

    // Borrower save(Borrower borrower);
    
    // JPQL query to find books by the author
    //@Query("SELECT b FROM Book b WHERE b.author = ?1")
    //List<Book> findByAuthor(String author);
}
