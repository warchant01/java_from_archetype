package com.techelevator;

import com.techelevator.util.Console;

public class ConvertDistance {

	public static void main(String[] args) {
		// Ask the user to choose whether input is miles or km
		System.out.println("Is input miles or km? (enter m or k) >>> ");
		// Read user input
		String unitChoice = Console.readLine();
		// if user chose miles 
		if(unitChoice.equals("m")) {
			// Prompt user to enter number of miles
			System.out.print("Enter number of miles >>> ");
			// Read input from user
			String input = Console.readLine();
			// Parse the user input into a double
			double numberOfMiles = Double.parseDouble(input);
			// Multiply the number of miles by 1.6 to find the number of Km
			double numberOfKm = numberOfMiles * 1.6;
			// Display the number of Km to the user
			System.out.println(numberOfMiles+" miles is equal to "+numberOfKm+" km.");
		} else if(unitChoice.equals("k")) {
			// Prompt user to enter number of km
			System.out.print("Enter number of km >>> ");
			// Read input from user
			String input = Console.readLine();
			// Parse the user input into a double
			double numberOfKm = Double.parseDouble(input);
			// Multiply the number of km by 0.621371
			double numberOfMiles = numberOfKm * 0.621371;
			// Display the number of Miles to the user
			System.out.println(numberOfKm+" km is equal to "+numberOfMiles+" miles.");
		} else {
			System.out.println("You're not very good at following directions, are you?");
		}
	}
}
