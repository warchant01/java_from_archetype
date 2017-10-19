package com.techelevator.paint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Shape> surfaces = new ArrayList<>();
		
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Add a peak");
			System.out.println("[3] Calculate paint required (and Exit)");
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
				surfaces.add(wall);
			} else if(userChoice.equals("2")) {
				Triangle peak = new Triangle();
				System.out.print("Enter peak height >>> ");
				peak.setHeight(Integer.parseInt(scan.nextLine()));
				System.out.print("Enter peak width >>> ");
				peak.setBase(Integer.parseInt(scan.nextLine()));
				System.out.println("Added "+peak.getHeight()+"x"+peak.getBase()+" peak - "+peak.getArea()+" square feet");
				surfaces.add(peak);
			} else if(userChoice.equals("3")) {
				
				int totalArea = 0; 

				// Here we need to sum up the areas of all walls that have been entered
				for(int i=0; i < surfaces.size(); i++) {
					Shape surface = surfaces.get(i);
					int surfaceArea = surface.getArea();
					System.out.println("Wall "+i+": "+surfaceArea+" square feet");
					totalArea += surfaceArea;
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
