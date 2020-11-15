package com.michalszalkowski.module.books.mapper;

import com.michalszalkowski.module.books.dto.BookForm;
import com.michalszalkowski.module.books.entity.BooksDetailsEntity;
import com.michalszalkowski.module.books.entity.BookEntity;
import com.michalszalkowski.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookFormMapper {

	public static BookEntity map(BookForm form) {
		BookEntity entity = new BookEntity();
		entity.setTitle(form.getTitle())
				.setAuthor(form.getAuthor())
				.setDetails(getDetails(form))
				.setTags(getTags(form, entity));
		return entity;
	}

	private static BooksDetailsEntity getDetails(BookForm form) {
		return new BooksDetailsEntity()
				.setIsbn(form.getIsbn())
				.setLang(form.getLang());
	}

	private static Set<BooksTagsEntity> getTags(BookForm form, BookEntity entity) {
		return form
				.getTags()
				.stream()
				.map(tag -> new BooksTagsEntity()
						.setValue(tag)
						.setBook(entity))
				.collect(Collectors.toSet());
	}
}
