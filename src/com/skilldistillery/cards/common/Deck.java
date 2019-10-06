package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));

			}
		}

	}

	public int cardsLeftInDeck() {
		return cards.size();
	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public void dealCard(Hand hand) {
		Card newCard = cards.remove(0);
		hand.addCard(newCard);
		;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deck [cards=");
		builder.append(cards);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}
