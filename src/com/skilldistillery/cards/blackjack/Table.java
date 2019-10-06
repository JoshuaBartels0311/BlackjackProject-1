package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Table {

	private BlackjackPlayer bjPlayer;
	private Dealer dealer;
	private Scanner kb;

	public static void main(String[] args) {
		Table app = new Table();
		app.run();
	}

	private void run() {
		kb = new Scanner(System.in);
		welcome();
		kb.close();
	}

	private void welcome() {
		System.out.println("Welcome to the Blackjack Table!");
		System.out.println("Press 1 + Enter to Play");
		System.out.println("Press 2 + Enter to Exit");
		System.out.print(">>");
		int selection = kb.nextInt();
		switch (selection) {
		case 1:
			newGame();
			break;
		case 2:
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println("Not a valid option. Please enter 1 or 2.");
			selection = kb.nextInt();
			break;
		}
	}

	private void newGame() {
		bjPlayer = new BlackjackPlayer();
		dealer = new Dealer();
		dealer.dealerShuffle();

		bjPlayer.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());

		bjPlayer.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());

		bjPlayer.getPlayerHand();
		System.out.println("Player: " + bjPlayer.getHandValue());
		System.out.println();
		dealer.dealersFirstHand();

		checkBlackjack();

		if (dealer.getHandValue() < 21 && bjPlayer.getHandValue() < 21) {
			hitOrStay();
		}

	}

	private void continueGame() {
		System.out.println("\nWould you like to play another hand?");
		System.out.println("\nPress 1 + enter to Play");
		System.out.println("Press 2 + enter to Exit");
		System.out.print(">>");
		int selection = kb.nextInt();
		switch (selection) {
		case 1:
			newHand();
			break;
		case 2:
			System.out.println("See ya later!");
			System.exit(0);
			break;
		default:
			System.out.println("Not a valid option. Please enter 1 or 2.");
			selection = kb.nextInt();
			break;
		}
		
	}

	private void newHand() {
		clear();
		checkDeck();
		bjPlayer.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());

		bjPlayer.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());

		bjPlayer.getPlayerHand();
		System.out.println("Player: " + bjPlayer.getHandValue());
		System.out.println();
		dealer.dealersFirstHand();

		checkBlackjack();

		if (dealer.getHandValue() < 21 && bjPlayer.getHandValue() < 21) {
			hitOrStay();
		}

	}

	private void hitOrStay() {
		System.out.println("\nTo Hit enter 1");
		System.out.println("To Stay enter 2");
		int selection = kb.nextInt();
		switch (selection) {
		case 1:
			playerHit();
			break;
		case 2:
			System.out.println("You've elected to stay. Dealer's move.");
			if (bjPlayer.getHandValue() <= 21 && dealer.getHandValue() < 17) {
				dealerHit();
				dealer.isBust();
				continueGame();
			}

			if (bjPlayer.getHandValue() == dealer.getHandValue()) {
				System.out.println("\n*** Push! ***");
				dealer.showDealersHand();
				continueGame();

			} else if (dealer.getHandValue() > 16 && dealer.getHandValue() < 21) {
				bjPlayer.isTwentyOne();
				bjPlayer.isBust();
				checkWin();
			}

			break;

		default:
			System.out.println("Not a valid option. Please enter 1 or 2.");
			selection = kb.nextInt();
			break;
		}
	}

	private void playerHit() {
		bjPlayer.addCard(dealer.dealCard());
		bjPlayer.isBust();
		bjPlayer.getPlayerHand();
		System.out.println("Player: " + bjPlayer.getHandValue());
		if (bjPlayer.getHandValue() < 22) {
			hitOrStay();
		}
		continueGame();
	}

	private void dealerHit() {
		while (dealer.getHandValue() < 17) {
			dealer.addCard(dealer.dealCard());
			System.out.println("\nDealer hits!");
		}
		
		if (bjPlayer.isTwentyOne() && dealer.isTwentyOne()) {
			System.out.println("\n**** Push! ****");
			clear();
			
		} else if (dealer.getHandValue() > 16 && dealer.getHandValue() < 22) {
			checkWin();
		}

	}

	private void checkWin() {
		if (bjPlayer.getHandValue() == dealer.getHandValue()) {
			System.out.println("\n*** Push! ***");
			
		}
		if (bjPlayer.getHandValue() > dealer.getHandValue() || dealer.getHandValue() > 21) {
			System.out.println("\n*** Player wins! ***");
		
		}
		if (bjPlayer.getHandValue() < dealer.getHandValue() || bjPlayer.getHandValue() > 21) {
			System.out.println("\n*** Dealer wins! ***");
	
		}
		dealer.showDealersHand();
		continueGame();
	}

	private boolean checkBlackjack() {
		if (dealer.isBlackjack()) {
			continueGame();
			return true;
		}
		if (dealer.getHandValue() < 21 && bjPlayer.isBlackjack()) {
			continueGame();
			return true;

		} else {
			return false;
		}

	}

	private void checkDeck() {
		if (dealer.getDeckSize() < 14) {
			System.out.println("\n...shuffling new deck...");
			dealer = new Dealer();
			dealer.dealerShuffle();
		}
	}

	private void clear() {
		bjPlayer.clear();
		dealer.clear();
	}

}