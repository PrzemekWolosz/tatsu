package com.przemyslawwolosz.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTatsuUtilsTest {

	@Test // getListOfColorsPerType(String type)
	public void shouldReturnEmptyListWhenTypeIsNotValid() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("")).hasSize(0).isEmpty();
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_3")).hasSize(0).isEmpty();
		assertThat(CollectionTatsuUtils.getListOfColorsPerType(null)).hasSize(0).isEmpty();
	}

	@Test // getListOfColorsPerType(String type)
	public void shouldReturnFirstGroupOfColors() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_1"))
				.hasSize(3)
				.containsExactly("red", "blue", "green");
	}

	@Test // getListOfColorsPerType(String type)
	public void shouldReturnSecondGroupOfColors() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_2"))
				.hasSize(2)
				.containsExactly("black", "white");

	}
}