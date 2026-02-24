package com.project.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data // Lombok generates its own hidden code (getter/setter).
@Entity // This indicates that this is a table in the database.
@Table(name = "books") // The table name in MySQL will be 'books'.
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically increment ID (1, 2, 3...)
    private Long id;

    private String title; // Book title
    private String author; // Author
    private String isbn; // Book code
}