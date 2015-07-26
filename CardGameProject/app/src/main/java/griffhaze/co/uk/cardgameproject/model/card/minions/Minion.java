package griffhaze.co.uk.cardgameproject.model.card.minions;

import java.util.ArrayList;
import java.util.List;

import griffhaze.co.uk.cardgameproject.model.card.Card;
import griffhaze.co.uk.cardgameproject.model.player.Player;

/**
 * Created by richardhayes on 26/07/15.
 */
public abstract class Minion extends Card {

    private static List<Minion> allMinions;

    private final int damage;
    private final int health;

    public Minion(String name, int manaCost, int damage, int health) {
        super(name, manaCost);
        this.damage = damage;
        this.health = health;
    }

    @Override
    protected boolean canUseCard(Player player) {
        return false;
    }

    static {
        allMinions = new ArrayList<Minion>();
        fillBasicMinions();
    }

    public static void addMinionToGame(Minion minion) {
        allMinions.add(minion);
        Card.addCard(minion);
    }

    public static void fillBasicMinions() {
        addMinionToGame(new Minion("Zakk", 0, 1, 3){

            @Override
            protected boolean haveEffect(Player player) {
                return false;
            }
        });
        addMinionToGame(new Minion("Imp", 2, 2, 1){

            @Override
            protected boolean haveEffect(Player player) {
                return false;
            }
        });

    }


}
