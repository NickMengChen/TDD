package com.thoughtworks.tdd;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;


public class FizzBuzzTest {

    @Test
    public void fizzbuzzTest(){

        FizzBuzz fizz = new FizzBuzz();
        String result = fizz.fizzBuzz(105);
        assertThat(result, is("FizzBuzzWhizz"));
        result = fizz.fizzBuzz(1);
        assertThat(result, is("1"));
        result = fizz.fizzBuzz(15);
        assertThat(result, is("FizzBuzz"));
        result = fizz.fizzBuzz(35);
        assertThat(result, is("BuzzWhizz"));

    }

}
