package Task4.library_management.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(name = "price")
    private Double price;

    @Column(name = "pages")
    private int pages;

    @Column(name = "genre")
    private String genre;

    @Column(name = "availability_status")
    private String availabilityStatus;

    public void setTitle(String title2) {
        // TODO Auto-generated method stub you had to create this method to be able to use settitle in bookservice.java and some others
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }

    public void setAuthor(String author2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAuthor'");
    }

    public void setIsbn(String isbn2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIsbn'");
    }

    // Getters and Setters
}
