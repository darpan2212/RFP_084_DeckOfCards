package com.cards;

public class CardsDemo {

	public static void main(String[] args) {
		IDeckOfCards deckOfCard = new DeckOfCards();
		System.out.println("------------Before Shuffle-------------");
		deckOfCard.print();
		
		deckOfCard.shuffle();
		System.out.println("---------------After Shuffle-----------");
		deckOfCard.print();
		
	}
	
}