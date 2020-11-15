package com.przemyslawwolosz.module.person;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDtoTest {

	private static final String NAME = "Michał";
	private static final String SURNAME = "Szałkowski";
	private static final String EMAIL = "no@michalszalkowski.com";

	@Test
	public void shouldReturnEmptyObject() {
		// given
		// when
		// then
		PersonDto personDto = new PersonDto();
		assertThat(personDto.getName()).isNull();
		assertThat(personDto.getSurname()).isNull();
		assertThat(personDto.getEmail()).isNull();
		assertThat(personDto.isEmailValid()).isFalse();

	}

	@Test
	public void shouldReturnPerson() {
		// given
		// when
		// then
		PersonDto personDto = new PersonDto(NAME,SURNAME,EMAIL);
		assertThat(personDto.getName()).isEqualTo(NAME);
		assertThat(personDto.getSurname()).isEqualTo(SURNAME);
		assertThat(personDto.getEmail()).isEqualTo(EMAIL);
		assertThat(personDto.isEmailValid()).isTrue();
	}
}