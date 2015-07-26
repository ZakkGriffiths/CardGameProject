package griffhaze.co.uk.cardgameproject.model.card;

import java.io.Serializable;
import java.util.List;

import griffhaze.co.uk.cardgameproject.model.player.Player;

/**
 * Created by richardhayes on 26/07/15.
 * Abstract class inherited by all cards in game
 */
public abstract class Card implements Serializable {

    private static List<Card> allCards;
    private boolean isFaceUp;

    private final String name;
    private final int manaCost;

    /**
     * The last user of this card
     */
    private Player lastUser;

    public Card(String name, int manaCost) {
        this.name = name;
        this.isFaceUp = false;
        this.manaCost = manaCost;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setIsFaceUp(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }

    /**
     * Add a new card to the game
     *
     * @param card
     */
    public static void addCard(Card card) {
        allCards.add(card);
    }

    /**
     * Use this card on a target player
     *
     * @param player target player
     * @return if the card play was successful
     */
    public final boolean on(Player player) {
        if (canUseCard(player))
            return haveEffect(player);
        else
            return false;
    }

    /**
     * Define the effect that this card has on a player
     *
     * @param player target player
     * @return if the effect was successful
     */
    protected abstract boolean haveEffect(Player player);

    /**
     * Define prerequisites for the use of a card by a player
     *
     * @param player using the card
     * @return whether the using player can use the card
     */
    protected abstract boolean canUseCard(Player player);

    /**
     * Set the last user of the card. Must be called before a card is used
     *
     * @param lastUser
     * @return this instance
     */
    public Card setLastUser(Player lastUser) {
        this.lastUser = lastUser;
        return this;
    }

    /**
     * @return the last user to use this card
     */
    public Player getLastUser() {
        return lastUser;
    }

    /**
     * @return a card that has been added to the game
     */
    public static Card createRandomCard() {
        return allCards.get((int) (Math.random() * (allCards.size()) - 1));
    }
}
