package griffhaze.co.uk.cardgameproject.model.player;

import java.util.List;

import griffhaze.co.uk.cardgameproject.model.card.Card;
import griffhaze.co.uk.cardgameproject.model.card.Deck;
import griffhaze.co.uk.cardgameproject.model.card.Hand;

/**
 * Created by richardhayes on 26/07/15.
 */
public class Player {

    private final String name;
    private final Hand hand;

    private int health;

    private int strength;
    private int defense;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.hand = new Hand();
    }

    public Player(String name) {
        this.name = name;
        this.health = 10;
        this.hand = new Hand();
    }

    public boolean drawCard(Deck deck) {
        if (deck.hasCards()) {
            this.hand.add(deck.pop());
            return true;
        }
        return false;
    }

    public Card playCard(int number) {
        Card card = hand.remove(number);
        return card.setLastUser(this);
    }

    public String showCards() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Card card : hand)
            stringBuffer.append(card.toString()+'\n');
        return stringBuffer.toString();
    }

    public int getStrength() {
        return strength;
    }

    public void takeDamage(int damage) {
        health -= damage/defense;
    }
}

