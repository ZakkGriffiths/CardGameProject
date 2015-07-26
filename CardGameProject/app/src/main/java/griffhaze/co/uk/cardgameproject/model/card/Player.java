package griffhaze.co.uk.cardgameproject.model.card;

/**
 * Created by richardhayes on 26/07/15.
 */
public class Player {

    private final String name;
    private final Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public boolean drawCard(Deck deck) {
        if (deck.hasCards()) {
            this.hand.add(deck.pop());
            return true;
        }
        return false;
    }
}

