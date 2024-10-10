package main.java.Task4.library_management.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    // JPQL query to find books by the author
    //@Query("SELECT b FROM Book b WHERE b.author = ?1")
    //List<Book> findByAuthor(String author);
}
