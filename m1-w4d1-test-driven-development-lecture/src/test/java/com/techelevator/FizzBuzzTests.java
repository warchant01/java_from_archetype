package com.techelevator;

import static com.techelevator.FizzBuzz.fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTests {

	@Test
	public void return_string_representation() {
		assertEquals("1", fizzBuzz(1));
		assertEquals("2", fizzBuzz(2));
		assertEquals("4", fizzBuzz(4));
	}

	@Test
	public void return_Fizz_if_divisible_by_3(){
		assertEquals("Fizz", fizzBuzz(3));
		assertEquals("Fizz", fizzBuzz(6));
	}
	
	@Test
	public void return_Buzz_if_divisble_by_5() {
		assertEquals("Buzz", fizzBuzz(5));
		assertEquals("Buzz", fizzBuzz(10));
		assertEquals("Buzz", fizzBuzz(25));
	}
	
	@Test
	public void return_FizzBuzz_if_divisible_by_3_and_5() {
		assertEquals("FizzBuzz", fizzBuzz(15));
		assertEquals("FizzBuzz", fizzBuzz(30));
		assertEquals("FizzBuzz", fizzBuzz(45));
	}
	
	@Test
	public void return_Fizz_if_string_contains_3() {
		assertEquals("Fizz", fizzBuzz(31));
		assertEquals("Fizz", fizzBuzz(33));
		assertEquals("Fizz", fizzBuzz(103));
	}
	
	@Test
	public void return_Buzz_if_string_contains_5() {
		assertEquals("Buzz", fizzBuzz(58));
	}
	
	@Test
	public void return_Fizz_Buzz_if_divisible_by_5_and_contains_3() {
		assertEquals("FizzBuzz", fizzBuzz(35));
		assertEquals("FizzBuzz", fizzBuzz(135));
		assertEquals("FizzBuzz", fizzBuzz(30));
	}
	
	@Test
	public void return_Fizz_Buzz_if_divisible_by_3_and_contains_5() {
		assertEquals("FizzBuzz", fizzBuzz(15));
		assertEquals("FizzBuzz", fizzBuzz(51));
	}
	
	@Test
	public void reutnFizzBuzz_if_contains_3_and_5() {
		assertEquals("FizzBuzz", fizzBuzz(53));
		assertEquals("FizzBuzz", fizzBuzz(503));
	}
}
