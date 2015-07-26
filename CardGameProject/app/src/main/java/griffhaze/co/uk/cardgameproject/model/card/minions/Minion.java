package griffhaze.co.uk.cardgameproject.model.card.minions;

import java.util.ArrayList;
import java.util.List;

import griffhaze.co.uk.cardgameproject.model.card.Card;
import griffhaze.co.uk.cardgameproject.model.player.Player;

/**
 * Created by richardhayes on 26/07/15.
 */
public abstract class Minion extends Card {

    private final int damage;
    private final int health;

    public Minion(MinionStats minionStats) {
        super(minionStats.getName(), minionStats.getManaCost());
        this.damage = minionStats.getDamage();
        this.health = minionStats.getHealth();
    }

    @Override
    protected boolean canUseCard(Player player) {
        return false;
    }



}
