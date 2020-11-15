package com.przemyslawwolosz.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTatsuUtilsTest {

// użycie assertThat pozwala sprawdzać kilka warunków na raz,
// przykład na końcu

	@Test // isEven()
	public void shouldReturnTrueWhenNumberIsEven() {
		assertThat(NumberTatsuUtils.isEven(2)).isTrue();
		assertThat(NumberTatsuUtils.isEven(4)).isTrue();
		assertThat(NumberTatsuUtils.isEven(6)).isTrue();
		assertThat(NumberTatsuUtils.isEven(8)).isTrue();
		assertThat(NumberTatsuUtils.isEven(10)).isTrue();
	}

	@Test // isEven()
	public void shouldReturnFalseWhenNumberIsOdd() {
		assertThat(NumberTatsuUtils.isEven(1)).isFalse();
		assertThat(NumberTatsuUtils.isEven(3)).isFalse();
		assertThat(NumberTatsuUtils.isEven(5)).isFalse();
		assertThat(NumberTatsuUtils.isEven(7)).isFalse();
		assertThat(NumberTatsuUtils.isEven(9)).isFalse();
	}

	@Test // add()
	public void shouldReturnSum() {
		assertThat(NumberTatsuUtils.add(0,0)).isEqualTo(0);
		assertThat(NumberTatsuUtils.add(0,1)).isEqualTo(1);
		assertThat(NumberTatsuUtils.add(1,0)).isEqualTo(1);
		assertThat(NumberTatsuUtils.add(10,20)).isEqualTo(30);
		assertThat(NumberTatsuUtils.add(-10,10)).isEqualTo(0);

		assertThat(NumberTatsuUtils.add(10,-10))
				.isEqualTo(0)
				.isBetween(-1,1)
				.isGreaterThan(-1)
				.isLessThan(1);

	}
}