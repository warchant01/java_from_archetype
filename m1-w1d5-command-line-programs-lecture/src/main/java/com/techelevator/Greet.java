package com.techelevator;

public class Greet {
	
	public static void main(String[] args) {
		String firstName = "World";
		String lastName = "";
		if(args.length > 0) {
			firstName = args[0];
		}
		if(args.length > 1) {
			lastName = args[1];
		}
		System.out.println("Hello, "+firstName+" "+lastName+"!");
	}
}
