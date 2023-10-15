package com.springboot.learnspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learnspringboot.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
