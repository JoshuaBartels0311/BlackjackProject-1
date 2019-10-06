package com.skilldistillery.cards.common;

public class Card {
	private Suit suit;
	private Rank rank;
	private Rank aceLow;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		this.aceLow = rank;
		
	}

	public Rank getValue() {
		return rank;
	}
	
	public Rank getAcelow() {
		return aceLow;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aceLow == null) ? 0 : aceLow.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (aceLow != other.aceLow)
			return false;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(rank);
		builder.append(" of ");
		builder.append(suit);
		return builder.toString();
	}	
	
	
	

}
