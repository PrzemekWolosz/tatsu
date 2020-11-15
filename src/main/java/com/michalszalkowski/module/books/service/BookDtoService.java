package com.michalszalkowski.module.books.service;

import com.michalszalkowski.module.books.dto.BookDto;
import com.michalszalkowski.module.books.entity.BookEntity;
import com.michalszalkowski.module.books.mapper.BookMapper;
import com.michalszalkowski.module.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookDtoService {

	@Autowired
	private BookRepository bookRepository;

	public Optional<BookDto> findOne(Long id) {

		BookEntity bookEntity = bookRepository.getOne(id);

		return Optional.ofNullable(
				BookMapper.map(bookEntity)
		);
	}

	public List<BookDto> getAll() {
		List<BookEntity> books = bookRepository.findAll();
		return BookMapper.map(books);
	}

}
