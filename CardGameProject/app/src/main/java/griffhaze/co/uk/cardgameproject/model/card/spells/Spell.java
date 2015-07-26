package griffhaze.co.uk.cardgameproject.model.card.spells;

import java.util.List;

import griffhaze.co.uk.cardgameproject.model.card.minions.Minion;
import griffhaze.co.uk.cardgameproject.model.card.minions.MinionStats;
import griffhaze.co.uk.cardgameproject.model.player.Player;

/**
 * Created by richardhayes on 26/07/15.
 */
public abstract class Spell {

    private static List<Spell> allMinions;

    private final int damage;


    public Spell(String name, int damage ){
        this.damage = damage;
        // TODO
    }


}
