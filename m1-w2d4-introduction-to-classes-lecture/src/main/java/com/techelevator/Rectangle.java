package com.techelevator;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		return length * width;
	}
	
	public boolean isLargerThan(Rectangle r) {
		return this.getArea() > r.getArea();
	}
	
	public boolean isLargerThan(int length, int width) {
		return this.getArea() > (length * width);
	}
}
