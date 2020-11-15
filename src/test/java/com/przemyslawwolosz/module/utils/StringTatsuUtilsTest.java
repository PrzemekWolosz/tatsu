package com.przemyslawwolosz.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTatsuUtilsTest {

	@Test // isProductionState()
	public void shouldReturnTrueWhenProductionIsOn() {
		assertThat(StringTatsuUtils.isProductionState()).isTrue();
	}

	@Test // isDevState()
	public void shouldReturnFalseWhenDevIsOff() {
		assertThat(StringTatsuUtils.isDevState()).isFalse();
	}

	@Test // isBlank(String value)
	public void shouldReturnTrueWhenStringIsBlank() {
		assertThat(StringTatsuUtils.isBlank("")).isTrue();
		assertThat(StringTatsuUtils.isBlank("   ")).isTrue();
		assertThat(StringTatsuUtils.isBlank(null)).isTrue();
	}

	@Test // isBlank(String value)
	public void shouldReturnFalseWhenStringIsNotBlank() {
		assertThat(StringTatsuUtils.isBlank("V")).isFalse();
		assertThat(StringTatsuUtils.isBlank("Value1")).isFalse();
		assertThat(StringTatsuUtils.isBlank("Value1  Value2")).isFalse();
	}

	@Test // isEmail(String email)
	public void shouldReturnFalseWhenEmailIsNotValid() {
		assertThat(StringTatsuUtils.isEmail(null)).isFalse();
		assertThat(StringTatsuUtils.isEmail("")).isFalse();
		assertThat(StringTatsuUtils.isEmail(" ")).isFalse();
		assertThat(StringTatsuUtils.isEmail("a")).isFalse();
		assertThat(StringTatsuUtils.isEmail("email")).isFalse();
		assertThat(StringTatsuUtils.isEmail("email@")).isFalse();
		assertThat(StringTatsuUtils.isEmail("email@email")).isFalse();
	}

	@Test // isEmail(String email)
	public void shouldReturnTrueWhenEmailIsValid() {
		assertThat(StringTatsuUtils.isEmail("email@email.com")).isTrue();
		assertThat(StringTatsuUtils.isEmail("EMAIL@EMAIL.PL")).isTrue();
	}

	@Test //getFullName(String name, String surname)
	public void shouldReturnFullName() {
		assertThat(StringTatsuUtils.getFullName(null,null)).isEqualTo("");
		assertThat(StringTatsuUtils.getFullName("","")).isEqualTo("");
		assertThat(StringTatsuUtils.getFullName("","Surname")).isEqualTo("Surname");
		assertThat(StringTatsuUtils.getFullName(null,"Surname")).isEqualTo("Surname");
		assertThat(StringTatsuUtils.getFullName("Name","")).isEqualTo("Name");
		assertThat(StringTatsuUtils.getFullName("Name",null)).isEqualTo("Name");
		assertThat(StringTatsuUtils.getFullName("Name","Surname")).isEqualTo("Name Surname");
	}
}