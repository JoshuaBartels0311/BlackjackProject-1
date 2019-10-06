package com.skilldistillery.cards.common;

public enum Suit {

//	HEARTS, SPADES, CLUBS, DIAMONDS;
	HEARTS("Hearts"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");
	
	private String name;
	
	
	Suit(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
