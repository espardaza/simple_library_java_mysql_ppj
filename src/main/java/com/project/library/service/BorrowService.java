package com.project.library.service;

import com.project.library.entity.BorrowRecord;
import com.project.library.repository.BorrowRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BorrowService {

    @Autowired
    private BorrowRecordRepository borrowRecordRepository;

    // 1. Book Borrowing Function
    public BorrowRecord borrowBook(Long userId, Long bookId) {
        // Create a new loan slip
        BorrowRecord record = new BorrowRecord();
        record.setUserId(userId);
        record.setBookId(bookId);
        record.setBorrowDate(LocalDate.now());
        record.setReturnDate(null);

        return borrowRecordRepository.save(record);
    }

    // 2. Book Return function
    public BorrowRecord returnBook(Long userId, Long bookId) {
        // Tìm phiếu mượn đang mở
        BorrowRecord record = borrowRecordRepository.findByUserIdAndBookIdAndReturnDateIsNull(userId, bookId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phiếu mượn nào!"));

        record.setReturnDate(LocalDate.now()); // Cập nhật ngày trả
        return borrowRecordRepository.save(record);
    }

    // 3. Function to retrieve ALL loan slips
    public List<BorrowRecord> getAllBorrows() {
        return borrowRecordRepository.findAll();
    }

    // 4. Function to retrieve a list of books that HAVE BEEN RETURNED
    public List<BorrowRecord> getReturnedBooks() {
        return borrowRecordRepository.findByReturnDateIsNotNull();
    }
}