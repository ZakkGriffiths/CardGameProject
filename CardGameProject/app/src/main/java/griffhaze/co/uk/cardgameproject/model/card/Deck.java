package griffhaze.co.uk.cardgameproject.model.card;

import java.util.Stack;

/**
 * Created by richardhayes on 26/07/15.
 */
public class Deck extends Stack<Card> {

    private void addCard(Card card) {
        add(card);
    }

    private Deck(int numberOfCards) {

    }

    public static Deck makeDeck(int numberOfCards) {
        Deck deck = new Deck(numberOfCards);
        for (int n = 0; n < numberOfCards; n++)
            deck.addCard(generateRandomCard());
        return deck;
    }

    private static Card generateRandomCard() {
        return null;
    }

    public void dealCards(int cardsPerPlayer, Player... players) {
        int n = 0;
        while (hasCards() && n++ < cardsPerPlayer)
            for (Player player : players)
                player.drawCard(this);
    }

    public boolean hasCards() {
        return size() != 0;
    }
}
