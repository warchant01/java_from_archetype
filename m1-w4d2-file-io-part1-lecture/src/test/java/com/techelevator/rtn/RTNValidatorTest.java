package com.techelevator.rtn;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

import org.junit.Test;

public class RTNValidatorTest {

	@Test
	public void returns_list_of_valid_routing_numbers() {
		StringReader testInput = new StringReader("114923756\n114910222\n124000054");
		RTNValidator validator = new RTNValidator(testInput);
		List<String> validNumbers = validator.getValidRoutingNumbers();
		assertEquals(3, validNumbers.size());
		assertEquals("114923756", validNumbers.get(0));
		assertEquals("114910222", validNumbers.get(1));
		assertEquals("124000054", validNumbers.get(2));
	}

	@Test
	public void list_of_valid_routing_numbers_does_not_include_invalid_routing_numbers() {
		final String BAD_RTN = "114810222";
		StringReader testInput = new StringReader("114923756\n"+BAD_RTN+"\n124000054");
		RTNValidator validator = new RTNValidator(testInput);
		List<String> validNumbers = validator.getValidRoutingNumbers();
		assertEquals(2, validNumbers.size());
		assertEquals("114923756", validNumbers.get(0));
		assertEquals("124000054", validNumbers.get(1));
	}
	
	@Test
	public void returns_list_of_invalid_routing_numbers() {
		final String BAD_RTN = "114810222";
		StringReader testInput = new StringReader("114923756\n"+BAD_RTN+"\n124000054");
		RTNValidator validator = new RTNValidator(testInput);
		List<String> invalidNumbers = validator.getInvalidRoutingNumbers();
		assertEquals(1, invalidNumbers.size());
		assertEquals(BAD_RTN, invalidNumbers.get(0));
	}
}
