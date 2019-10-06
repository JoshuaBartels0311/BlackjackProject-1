package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	private int playerHandValue;

	BlackjackHand() {

	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		return false;
	}

	@Override
	public int getHandValue() {
		playerHandValue = 0;

		for (Card card : cards) {
			playerHandValue += card.getValue().getValue();
		}
		return playerHandValue;
	}


//	Stretch Goals
//	public boolean isHard() {
//		//TODO
//		return false;
//	}
//
//	public boolean isSoft() {
//		//TODO
//		return false;
//	}
	

}