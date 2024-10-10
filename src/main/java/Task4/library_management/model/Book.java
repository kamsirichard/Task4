package main.java.Task4.library_management.model;

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

    // Getters and Setters
}
