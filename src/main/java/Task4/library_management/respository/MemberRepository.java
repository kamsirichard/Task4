package Task4.library_management.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Task4.library_management.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Additional query methods can be defined here if needed
}
