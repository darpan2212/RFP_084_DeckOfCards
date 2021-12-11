package com.cards;

public class DeckOfCards implements IDeckOfCards {

	private String[] decks = new String[52];

	public DeckOfCards() {
		init();
	}

	@Override
	public void init() {
		for (int i = 0; i < decks.length; i++) {
			decks[i] = RANKS[i % 13] + SUITS[i / 13];
		}
	}

	@Override
	public void shuffle() {
		for (int i = 0; i < decks.length; i++) {
			int randomIndex = (int) (Math.random() * decks.length);
			String temp = decks[i];
			decks[i] = decks[randomIndex];
			decks[randomIndex] = temp;
		}
	}

	@Override
	public void distribute() {

	}

	@Override
	public void print() {
		for (int i = 0; i < decks.length; i++) {
			System.out.println(decks[i]);
		}
	}
}