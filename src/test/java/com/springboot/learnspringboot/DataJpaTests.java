package com.springboot.learnspringboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import com.springboot.learnspringboot.entity.Book;
import com.springboot.learnspringboot.enums.Status;
import com.springboot.learnspringboot.repository.BookRepository;

@DataJpaTest
class DataJpaTests {
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	void tesktData() {
		Book book = new Book();
		
		// create a new book and save
		book.setId(1L);
		book.setStatus(Status.COMPLETED);
		book = bookRepository.save(book);
		
		// load book with id = 1L
		book = null;
		book = bookRepository.getReferenceById(1);
				
		assertThat(book.getStatus()).isEqualTo(Status.COMPLETED);
	}

}
