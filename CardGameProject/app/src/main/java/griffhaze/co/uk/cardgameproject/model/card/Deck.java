package griffhaze.co.uk.cardgameproject.model.card;

import java.util.Stack;

import griffhaze.co.uk.cardgameproject.model.player.Player;

/**
 * Created by richardhayes on 26/07/15.
 * Defines the full deck of cards in a game
 */
public class Deck extends Stack<Card> {

    /**
     * Add a card to this deck
     *
     * @param card
     */
    private void addCard(Card card) {
        add(card);
    }

    /**
     * Private constructor- use factory
     *
     * @param numberOfCards
     */
    private Deck(int numberOfCards) {

    }

    /**
     * create a deck of cards
     *
     * @param numberOfCards to add to the deck
     * @return the newly created deck of cards
     */
    public static Deck makeDeck(int numberOfCards) {
        Deck deck = new Deck(numberOfCards);
        for (int n = 0; n < numberOfCards; n++)
            deck.addCard(Card.createRandomCard());
        return deck;
    }

    /**
     * Deal a set number of cards to each player, or all the cards in the deck
     *
     * @param cardsPerPlayer the number of cards each player will receive if there are enough cards in the deck
     * @param players        the players that should receive cards
     */
    public void dealCards(int cardsPerPlayer, Player... players) {
        int n = 0;
        while (hasCards() && n++ < cardsPerPlayer)
            for (Player player : players)
                player.drawCard(this);
    }

    /**
     * @return Whether there are cards remaining in the deck
     */
    public boolean hasCards() {
        return size() != 0;
    }
}
