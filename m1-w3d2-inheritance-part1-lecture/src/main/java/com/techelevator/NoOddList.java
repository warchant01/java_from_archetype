package com.techelevator;

import java.util.ArrayList;

public class NoOddList extends ArrayList<Integer> {

	@Override
	public boolean add(Integer e) {
		if(e % 2 != 0) {
			return false;
		} else {
			return super.add(e);
		}
	}
	
	@Override
	public void add(int index, Integer element) {
		if(element % 2 == 0) {
			super.add(index, element);
		}
	}
}
