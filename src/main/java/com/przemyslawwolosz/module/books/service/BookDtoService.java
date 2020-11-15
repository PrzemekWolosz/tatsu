package com.przemyslawwolosz.module.books.service;

import com.przemyslawwolosz.module.books.dto.BookDto;
import com.przemyslawwolosz.module.books.entity.BookEntity;
import com.przemyslawwolosz.module.books.mapper.BookMapper;
import com.przemyslawwolosz.module.books.repository.BookRepository;
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
