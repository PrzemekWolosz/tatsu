package com.michalszalkowski.module.books.service;

import com.michalszalkowski.module.books.dto.BookDto;
import com.michalszalkowski.module.books.entity.BookEntity;
import com.michalszalkowski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BookDtoServiceTest {

	private static final long BOOK_ID = 1;
	private static final BookEntity BOOK_ENTITY = new BookEntity()
			.setId(BOOK_ID);

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookDtoService bookDtoService;

	@Test
	public void shouldNotReturnBook() {
		// given
		// when
		// then
	}

	@Test
	public void shouldReturnBook() {
		// given
		// when
		// then
	}

	@Test
	public void shouldReturnEmptyList() {
		// given
		// when
		// then
	}

	@Test
	public void shouldReturnList() {
		// given
		// when
		// then
	}
}