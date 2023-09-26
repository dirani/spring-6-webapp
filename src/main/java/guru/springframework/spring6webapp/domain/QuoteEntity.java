package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

@Entity
public class QuoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String quote;

    // Getters and setters
}
