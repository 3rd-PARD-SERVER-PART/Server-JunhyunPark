package com.example.hw5.book.repo;

import com.example.hw5.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
