package com.crafties.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_display_1_when_1() {
        // given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(1);

        // then
        assertThat(result, is("1"));
    }

    @Test
    public void should_display_n_when_n() {
        // given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(2);

        // then
        assertThat(result, is("2"));

    }

    @Test
    public void should_display_fizz_when_multiple_of_3() {
        // given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(6);

        // then
        assertThat(result, is("fizz"));
    }

    @Test
    public void should_display_buzz_when_multiple_of_5() {
        // given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(10);

        // then
        assertThat(result, is("buzz"));
    }

    @Test
    public void should_display_fizzbuzz_when_multiple_of_3_and_5() {
        // given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(15);

        // then
        assertThat(result, is("fizzbuzz"));
    }

}
