package com.techelevator;

public class RectangleDemo {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setLength(10);
		r1.setWidth(12);
		
		r2.setLength(8);
		r2.setWidth(5);
		
		System.out.println("r1 - length: "+r1.getLength()+" width: "+r1.getWidth());
		System.out.println("r2 - length: "+r2.getLength()+" width: "+r2.getWidth());
		
		int area1 = r1.getArea();
		int area2 = r2.getArea();
		
		System.out.println("r1 Area: "+area1);
		System.out.println("r2 Area: "+area2);
		
		if(r1.isLargerThan(r2)) {
			System.out.println("r1 is larger!");
		} else {	
			System.out.println("r2 is larger!");
		}
		
		// Using our fancy new constructor
		Rectangle r3 = new Rectangle(15, 20);
		System.out.println("r3 - length: "+r3.getLength()+" width: "+r3.getWidth());
				
	}

}
