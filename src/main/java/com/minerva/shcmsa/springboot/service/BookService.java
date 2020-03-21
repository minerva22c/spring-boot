package com.minerva.shcmsa.springboot.service;

import java.util.Optional;

import com.minerva.shcmsa.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long Id);
}
