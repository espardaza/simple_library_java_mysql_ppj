package com.project.library.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "borrow_records")
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookId; // Which book should I borrow?
    private Long userId; // Who borrowed?

    private LocalDate borrowDate; // Borrowed date
    private LocalDate returnDate; // Return date (if null, it means it hasn't been returned yet)
}