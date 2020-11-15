package com.michalszalkowski.module.books.mapper;

import com.michalszalkowski.module.books.dto.BookDetailsDto;
import com.michalszalkowski.module.books.entity.BooksDetailsEntity;

public class BookDetailsMapper {

	public static BookDetailsDto map(BooksDetailsEntity details) {
		if (details == null) {
			return new BookDetailsDto();
		}
		return new BookDetailsDto()
				.setIsbn(details.getIsbn())
				.setLang(details.getLang());
	}

}
