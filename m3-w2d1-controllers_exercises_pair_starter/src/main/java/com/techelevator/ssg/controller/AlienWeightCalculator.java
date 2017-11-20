package com.techelevator.ssg.controller;

public class AlienWeightCalculator {

	private static double gravities[] = {0.37, 0.90, 1.00, 0.17, 0.38, 2.65, 1.13, 1.09, 1.43};
	
	public static int calculateAlienWeight(int planet, int earthWeight)
	{
		if (planet < 0 || planet > 7) {
			return 0;
		} else {
			return (int)(gravities[planet]*earthWeight);
		}
	}
}
