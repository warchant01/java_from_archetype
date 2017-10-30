package com.techelevator.rtn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RTNValidatorCLI {
	public static void main(String[] args) throws IOException {

		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();
		try(FileReader fileReader = new FileReader(inputFile)) {
			RTNValidator validator = new RTNValidator(fileReader);
			List<String> valid = validator.getValidRoutingNumbers();
			System.out.println("The file contained "+valid.size()+" valid routing numbers.");
			List<String> invalid = validator.getInvalidRoutingNumbers();
			System.out.println("The file contained "+invalid.size()+" invalid routing numbers:");
			for(String rtn : invalid) {
				System.out.println(rtn);
			}
		}
		
	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
}
