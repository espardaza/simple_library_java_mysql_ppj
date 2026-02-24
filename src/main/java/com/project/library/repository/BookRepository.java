package com.project.library.repository;

import com.project.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<Data type, ID type>
public interface BookRepository extends JpaRepository<Book, Long> {
    // Left blank, Spring Boot handles the behind-the-scenes work.
}