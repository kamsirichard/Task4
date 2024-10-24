package Task4.library_management.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Task4.library_management.service.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    // Custom queries can be added here if needed
}
