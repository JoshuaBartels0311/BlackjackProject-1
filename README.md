### Blackjack Application Project

### Week 4 Homework Project for Skill Distillery

### Overview

This program simulates a blackjack game interface on the console. Standard blackjack rules apply. The current version does not have the ability to handle multiple players or ace low but the next version will have improved functionality.

### Technologies

Java Version 1.8, Eclipse IDE, Git, Github, Atom

### Topics Applied

The primary topics applied from Week 4 at Skill Distillery were the use of enumerated types, abstract classes and reinforcing Object-Oriented programing principles.

### Lessons Learned

This project pushed the boundaries on my understanding of Object-Oriented programming and more specifically inheritance. Going into this project, I felt confident with inheritance and classes, but once I started to build out the game, I couldn't reach some of the methods or use the data types as they were originally created. For example, I built a deck of cards using an array list from two separate objects which were abstracted from the real world, i.e. the rank and suit of a card. After modeling a player, then a blackjack player who IS-A player and HAS-A blackjack hand, which IS-An abstract hand, and a dealer who IS-Also a player and HAS-A deck of cards who are both "seated" at a table object, I was ready to finally start using that array list of cards only to find that my array list of cards is now a data type which I cannot iterate over or access as I had hoped. I struggled to conceptualize that my deck of cards was now an object that I couldn't use as originally designed until I converted it back to List<Card> by storing a copy of the cards being used into a new variable in order to access the data I needed. I probably spent too much time playing with that aspect of the program, but I wanted to thoroughly understand what was happening with the objects and data types. I needed to build a better foundation on this level before moving on. It was a necessary step in my programming evolution.

The downside of spending the extra time playing with inheritance and classes in order to thoroughly understand this program is the application's limited functionality. It meets the grading standard, but I would like to finish the stretch goals. I will definitely continue working on this program to improve it and may even completely rewrite the code at the end of the course.

### How to Run

You must compile this program to run it. Current version will only work on the console of an IDE. Download or clone this repository to a local directory. Open Eclipse IDE (or your favorite Java compiler) and import the project under the File menu. Alternatively, you can clone the repository directly into your IDE via terminal. Once you have compiled it, click run and follow the prompts.

Clone with SSH:

git@github.com:richardanewman/BlackjackProject.git

Clone with HTTPS:

https://github.com/richardanewman/BlackjackProject.git

## Context

Below you will find a copy of the assignment's tasks. I am providing this context for anyone evaluating my code. We were not given a code stub or boilerplate for this exercise. For better or worse, the code is my own. The only resources referenced were from the prior week's course material and my class notes. I am not a fan of copy and paste code because it does not aid in the learning process. I am attending this bootcamp so that I can thoroughly understand how to properly develop software using Java.

### Task Overview Provided by Skill Distillery

Use classes to create a functional blackjack game. Leave the game's functionality until the end, first get the class structure figured out. From here you can implement methods and fields to store data you think you would need during a blackjack game.

### Learning Objectives

Below are a list of objectives that we see the blackjack programing reinforcing.

  * Getting comfortable building classes in an Object-Oriented manner.
  * Building classes whose fields are Objects.
  * Practice writing methods.
  * Use collection types to organize and manage data.
  * Use conditionals to create game logic.

## User Stories

### User Story 1

Create a class structure that mimics a deck of cards. Remember decks as well as hands are made up of cards. Feel free to create the structure in any way you see fit.

Your card and deck implementations should NOT be coupled to Blackjack; you should be able to reuse them to implement a poker or bridge game application.

### User Story 2

Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck. You should be able to print out a shuffled deck to the terminal.

### User Story 3

Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the wiki.

Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

### User Story 4

The Dealer's decisions are based on game logic in the program.

The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.

### User Story 5

Determine the winner of each round by implementing the remaining rules of Blackjack (such as going over 21) and comparing hand values.

### Stretch Goals

Try as many of these as you like, but ONLY after you've completed, tested, and COMMITTED your working game that meets the requirements.

"Soft" Ace - Ace has the value 1 or 11.

A dealer must Hit on a hand with the value "soft 17" (where an Ace is present with value 11 and other cards total 6) and Stay on "hard 17" (where an Ace is present, but hitting could cause the Dealer to go over 21)
"Blackjack" hand - if the user is initially dealt an Ace and a card with the value 10, this is a blackjack. The user immediately wins unless the dealer also has a blackjack (two-card hand with an Ace and a 10-value card).

Allow multiple players in the game.

Implement a monetary system so players can place bets on their hands.

Allow players to split hands.

Allow players to double down.

Deal from a multi-deck shoe.

Keep going. How about implementing in-game suggestions based on the player's current hand? Maybe a card-counting player?

### Grading

This is a graded project. You are expected to have your project completed by the start of class on Monday morning.

You will be given either a pass or fail based on whether your code works given all of the following test conditions:

  * Your program must NOT be contained in one procedural main(). You MUST design a OO class structure.

  * When the game begins both the player and dealer are dealt two cards.

  * If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to hit as many times as they wish until they choose to stay.

  * Once the player has completed their turn the dealer will begin their turn, automatically hitting or staying according to the Blackjack rules.

  * The game is immediately over if either player gets above 21.

  * The winner is displayed.

  * To turn in a project, you must push it to Github. You must include a README.md that describes how to run your program and an overview of the class       structure you chose to use.

If the project does work with all of the above test conditions, you will be given a 1 for this week's project.

If the project does not work with the above test conditions, you will be given a 0 for this week's project.
