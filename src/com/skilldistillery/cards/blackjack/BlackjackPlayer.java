package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Player;

public class BlackjackPlayer extends Player {
	private BlackjackHand playerHand;
	private int handValue;

	public BlackjackPlayer() {
		playerHand = new BlackjackHand();
		super.setName("Player 1");
	}

	public void addCard(Card card) {
		playerHand.addCard(card);
	}
	
	public void getPlayerHand() {
		List<Card> playerCards = playerHand.getCards();
		System.out.print("\nPlayer has ");
		for (Card card : playerCards) {
			System.out.print(card + " ");
		}
		System.out.println();
	}

	public int getHandValue() {
		handValue = playerHand.getHandValue();
		return handValue;
	}
	
	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("\nPlayer has blackjack! Player wins!");
			List<Card> playerCards = playerHand.getCards();
			for (Card card : playerCards) {
				System.out.println(card);
			}
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("\n*** You busted! ***");
			return true;
		}
		return false;
	} 
	
	public boolean isTwentyOne() {
		if (getHandValue() == 21) {
			System.out.println("\nPlayer has twenty one!");
			List<Card> playerCards = playerHand.getCards();
			for (Card card : playerCards) {
				System.out.println(card);
			}
			return true;
		}
		return false;
	}
	
	public void clear() {
		playerHand.clear();
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlackjackPlayer [bjHand=");
		builder.append(playerHand);
		builder.append("]");
		return builder.toString();
	}

}
