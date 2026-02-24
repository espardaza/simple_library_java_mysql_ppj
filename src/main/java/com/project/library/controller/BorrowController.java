package com.project.library.controller;

import com.project.library.entity.BorrowRecord;
import com.project.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    // 1. View the list of currently borrowed items.
    @GetMapping
    public List<BorrowRecord> getList() {
        return borrowService.getAllBorrows();
    }

    // 2. View the list of paid items
    @GetMapping("/return")
    public List<BorrowRecord> getReturnedList() {
        return borrowService.getReturnedBooks();
    }

    // 3. Action to borrow a book
    @PostMapping
    public BorrowRecord borrow(@RequestParam Long userId, @RequestParam Long bookId) {
        return borrowService.borrowBook(userId, bookId);
    }

    // 4. Action to return books
    @PutMapping("/return")
    public BorrowRecord returnBook(@RequestParam Long userId, @RequestParam Long bookId) {
        return borrowService.returnBook(userId, bookId);
    }
}