package Task4.library_management.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Task4.library_management.model.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
    // Custom queries can be added here if needed
}
