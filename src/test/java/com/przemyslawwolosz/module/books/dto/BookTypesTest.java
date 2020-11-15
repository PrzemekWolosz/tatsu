package com.przemyslawwolosz.module.books.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTypesTest {

	@Test
	public void shouldReturnDefaultEnumInCaseOfNullOrInvalidValue() {
		assertThat(BookTypes.byString(null)).isEqualTo(BookTypes.CLASSIC);
		assertThat(BookTypes.byString("")).isEqualTo(BookTypes.CLASSIC);
		assertThat(BookTypes.byString("DOCUMENT")).isEqualTo(BookTypes.CLASSIC);
	}

	@Test
	public void shouldReturnEnumByString() {
		assertThat(BookTypes.byString("FANTASY")).isEqualTo(BookTypes.FANTASY);
		assertThat(BookTypes.byString("ACTION")).isEqualTo(BookTypes.ACTION);
		assertThat(BookTypes.byString("HORROR")).isEqualTo(BookTypes.HORROR);
	}

	@Test
	public void shouldReturnEnumByStringAndIgnoreCase() {
		assertThat(BookTypes.byString("action")).isEqualTo(BookTypes.ACTION);
		assertThat(BookTypes.byString("Fantasy")).isEqualTo(BookTypes.FANTASY);
		assertThat(BookTypes.byString("hORrOr")).isEqualTo(BookTypes.HORROR);
	}

}