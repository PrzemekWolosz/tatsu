package com.przemyslawwolosz.module.person;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.LIST;

public class PersonMapperTest {

    private static final String NAME = "Michał";
    private static final String SURNAME = "Szałkowski";
    private static final String EMAIL = "no@michalszalkowski.com";

    @Test
    public void shouldReturnNull() {
        // given
        PersonEntity personEntity = null;
        // when
        PersonDto personDto = PersonMapper.map(personEntity);
        // then
        assertThat(personDto).isNull();

    }

    @Test
    public void shouldReturnDto() {
        // given
        PersonEntity personEntity = new PersonEntity()
                .setName(NAME)
                .setSurname(SURNAME)
                .setEmail(EMAIL);
        // when
        PersonDto personDto = PersonMapper.map(personEntity);
        // then
        assertThat(personDto.getName()).isEqualTo(NAME);
        assertThat(personDto.getSurname()).isEqualTo(SURNAME);
        assertThat(personDto.getEmail()).isEqualTo(EMAIL);
        assertThat(personDto.isEmailValid()).isTrue();
    }

    @Test
    public void shouldReturnEmptyList() {
        // given
        List<PersonEntity> persons = List.of();
        // when
        List<PersonDto> personDtos = PersonMapper.asList(persons);
        // then
        assertThat(personDtos).isEmpty();
    }

    @Test
    public void shouldReturnList() {
        // given
        List<PersonEntity> persons = List.of(
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL),
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL)
        );
        // when
        List<PersonDto> personDtos = PersonMapper.asList(persons);
        // then
        assertThat(personDtos).isNotEmpty().hasSize(2);
    }

    @Test
    public void shouldReturnSet() {
        // given
        List<PersonEntity> persons = List.of(
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL),
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL)
        );
        // when
        Set<PersonDto> personDtos = PersonMapper.asSet(persons);
        // then
        assertThat(personDtos).isNotEmpty().hasSize(1);
    }
}