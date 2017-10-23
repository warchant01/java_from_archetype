package com.techelevator;

public class FizzBuzz {

	/*
	 * Given an int num return the string represention.
	 * 
	 * Exceptions:
	 * 
	 * 1) If the number is divisble by 3 or contains a '3', return "Fizz"
	 * 2) If the number is divisble by 5 or contains a '5', return "Buzz"
	 * 3) If the number is divisible by 3 and 5 or 
	 *    is divisible by 3 and contains '5' or
	 *    is divisible by 5 and contains '3' or
	 *    contains '3' and contains '5'
	 *    return "FizzBuzz"
	 * 
	 */
	
	public static String fizzBuzz(int num)
	{
		String result = "";
		
		if (isFizz(num) && isBuzz(num)) {
			result = "FizzBuzz";
		} else if (isBuzz(num)) {
			result = "Buzz";
		} else if (isFizz(num)) {
			result = "Fizz";
		} else {
			result = String.valueOf(num);
		}
		
		return result;
	}

	private static boolean isBuzz(int num) {
		return isDivisibleBy5(num) || String.valueOf(num).contains("5");
	}

	private static boolean isFizz(int num) {
		return isDivisibleBy3(num) || String.valueOf(num).contains("3");
	}

	private static boolean isDivisibleBy5(int num) {
		return num % 5 == 0;
	}

	private static boolean isDivisibleBy3(int num) {
		return num % 3 == 0;
	}
}
