package com.project.library.repository;

import com.project.library.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {

    // 1. Find books that are currently borrowed (not yet returned).
    Optional<BorrowRecord> findByUserIdAndBookIdAndReturnDateIsNull(Long userId, Long bookId);

    // 2. Find books that have BEEN RETURNED (Return date is not null)
    // Just declare the function name; Spring Boot will automatically write the underlying SQL code.
    List<BorrowRecord> findByReturnDateIsNotNull();
}