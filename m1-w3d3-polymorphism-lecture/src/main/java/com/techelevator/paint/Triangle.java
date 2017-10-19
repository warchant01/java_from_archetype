package com.techelevator.paint;

public class Triangle implements Shape {

	private int base;
	private int height;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return (base * height) / 2;
	}
}
