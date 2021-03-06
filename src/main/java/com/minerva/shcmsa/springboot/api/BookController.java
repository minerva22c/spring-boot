package com.minerva.shcmsa.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minerva.shcmsa.springboot.domain.Book;
import com.minerva.shcmsa.springboot.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/{bookId}")
	public ResponseEntity findById(@PathVariable Long bookId){
		Book book = bookService.findById(bookId)
				.orElseThrow( () -> new RuntimeException("Not Found: " + bookId ) );
		return ResponseEntity.ok(book);
	}
}
