package Task4.library_management.controller;

import Task4.library_management.model.LoanRecord;
import Task4.library_management.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
public class LoanRecordController {

    private final LoanService loanRecordService;

    @Autowired
    public LoanRecordController(LoanService loanRecordService) {
        this.loanRecordService = loanRecordService;
    }

    // Endpoint to create a new loan record
    @PostMapping("/add")
    public ResponseEntity<LoanRecord> addLoanRecord(@RequestBody LoanRecord loanRecord) {
        LoanRecord newLoanRecord = loanRecordService.addLoanRecord(loanRecord);
        return ResponseEntity.ok(newLoanRecord);
    }

    // Endpoint to get all loan records
    @GetMapping("/all")
    public ResponseEntity<List<LoanRecord>> getAllLoanRecords() {
        List<LoanRecord> loanRecords = loanRecordService.getAllLoanRecords();
        return ResponseEntity.ok(loanRecords);
    }

    // Endpoint to get a loan record by ID
    @GetMapping("/{id}")
    public ResponseEntity<LoanRecord> getLoanRecordById(@PathVariable Long id) {
        Optional<LoanRecord> loanRecord = loanRecordService.getLoanRecordById(id);
        return loanRecord.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint to delete a loan record by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoanRecord(@PathVariable Long id) {
        loanRecordService.deleteLoanRecord(id);
        return ResponseEntity.noContent().build();
    }
}
