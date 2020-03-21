package com.minerva.shcmsa.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.minerva.shcmsa.springboot.domain.Book;
import com.minerva.shcmsa.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Optional<Book> findById(Long id) {

		return bookRepository.findById(id);
	}

}
