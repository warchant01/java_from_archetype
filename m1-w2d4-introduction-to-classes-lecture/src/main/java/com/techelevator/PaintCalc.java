package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Rectangle> walls = new ArrayList<>();
		
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();
			
			System.out.println();
			
			if(userChoice.equals("1")) {
				Rectangle wall = new Rectangle();
				System.out.print("Enter wall height >>> ");
				wall.setLength(Integer.parseInt(scan.nextLine()));
				System.out.print("Enter wall width >>> ");
				wall.setWidth(Integer.parseInt(scan.nextLine()));
				System.out.println("Added "+wall.getLength()+"x"+wall.getWidth()+" wall - "+wall.getArea()+" square feet");
				walls.add(wall);
			} else if(userChoice.equals("2")) {
				
				int totalArea = 0; 

				// Here we need to sum up the areas of all walls that have been entered
				for(int i=0; i < walls.size(); i++) {
					Rectangle wall = walls.get(i);
					int wallArea = wall.getArea();
					System.out.println("Wall "+i+": "+wall.getLength()+"x"+wall.getWidth()+" - "+wallArea+" square feet");
					totalArea += wallArea;
				}
				
				System.out.println("===============================");
				System.out.println("Total Area: "+totalArea+" square feet");
				
				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float)totalArea / 400;
				System.out.println("Paint Required: "+gallonsRequired+" gallons");
				
				System.exit(0); // Causes the program to end
			}
		}
	}

}
