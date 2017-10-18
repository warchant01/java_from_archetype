package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		ReserveAuction theAuction = new ReserveAuction("Beaver Fur Top Hat", 500);
		theAuction.placeBid( new Bid("David", 5));
		theAuction.placeBid( new Bid("Ben", 550));
		theAuction.placeBid( new Bid("Rick", 560));
		theAuction.placeBid( new Bid("Sam", 525));
		
		String itemForSale = theAuction.getItemForSale();
		Bid highBid = theAuction.getHighBid();
		
		System.out.println("The high bid for the "+itemForSale+" is "+highBid.getBidder()+" for $"+highBid.getBidAmount());
		
	}
}