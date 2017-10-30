package com.techelevator.rtn;

import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RTNValidator {
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };
	
	private List<String> validRoutingNumbers;
	private List<String> invalidRoutingNumbers;
	
	public RTNValidator(Reader inputData) {
		validRoutingNumbers = new ArrayList<>();
		invalidRoutingNumbers = new ArrayList<>();
		
		Scanner input = new Scanner(inputData);
		while(input.hasNextLine()) {
			String rtn = input.nextLine();
			if(checksumIsValid(rtn)) {
				validRoutingNumbers.add(rtn);
			} else {
				invalidRoutingNumbers.add(rtn);
			}
		}
	}
	
	public List<String> getValidRoutingNumbers() {
		return validRoutingNumbers;
	}

	public List<String> getInvalidRoutingNumbers() {
		return invalidRoutingNumbers;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
