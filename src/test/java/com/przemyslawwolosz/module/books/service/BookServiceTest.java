package com.przemyslawwolosz.module.books.service;

import com.przemyslawwolosz.module.books.entity.BookEntity;
import com.przemyslawwolosz.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    private static final long VALID_BOOK_ID = 1;
    private static final long NOT_VALID_BOOK_ID = 0;
    private static final BookEntity BOOK = new BookEntity();

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test // getOne(Long id)
    public void shouldCallGetOneWhenIdIsValid() {
        // when
        bookService.getOne(VALID_BOOK_ID);
        // then
        Mockito.verify(bookRepository).getOne(VALID_BOOK_ID);
    }

    @Test // getOne(Long id)
    public void shouldNotCallGetOneWhenIdIsValid() {
        // when
        bookService.getOne(NOT_VALID_BOOK_ID);
        // then
        Mockito.verify(bookRepository, Mockito.times(0))
                .getOne(NOT_VALID_BOOK_ID);
    }

    @Test // getAll()
    public void shouldCallFindAll() {
        // when
        bookService.getAll();
        // then
        Mockito.verify(bookRepository).findAll();
    }

    @Test // create(BookEntity entity)
    public void shouldCallSaveAndFlash() {
        // when
        bookService.create(BOOK);
        // then
        Mockito.verify(bookRepository).saveAndFlush(BOOK);
    }

    @Test // create(BookEntity entity)
    public void shouldNotCallSaveAndFlashWhenObjectIsEqualToNull() {
        // when
        bookService.create(null);
        // then
        Mockito.verify(bookRepository, Mockito.times(0))
                .saveAndFlush(BOOK);
    }

    @Test // delete(Long id)
    public void shouldCallDeleteById() {
        // when
        bookService.delete(VALID_BOOK_ID);
        // then
        Mockito.verify(bookRepository).deleteById(VALID_BOOK_ID);
    }

    @Test // update(Long id, BookEntity entity)
    public void shouldSaveAndFlashInCaseOfUpdate() {
        // when
        bookService.update(VALID_BOOK_ID, BOOK);
        // then
        Mockito.verify(bookRepository).saveAndFlush(BOOK.setId(VALID_BOOK_ID));
    }
}