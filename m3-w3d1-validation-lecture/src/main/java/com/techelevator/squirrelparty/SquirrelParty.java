package com.techelevator.squirrelparty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class SquirrelParty {

	@Min(0) @Max(100)
	private int numberOfSquirrels;
	private boolean isWeekend;
	
	public void setNumberOfSquirrels(int numberOfSquirrels) {
		this.numberOfSquirrels = numberOfSquirrels;
	}
	
	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}
	
	public int getNumberOfSquirrels() {
		return numberOfSquirrels;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	public boolean isSuccess() {
		boolean isSuccess = false;
		if(numberOfSquirrels >= 40 && (numberOfSquirrels <= 60 || isWeekend)) {
			isSuccess = true;
		}
		return isSuccess;
	}
	
}
