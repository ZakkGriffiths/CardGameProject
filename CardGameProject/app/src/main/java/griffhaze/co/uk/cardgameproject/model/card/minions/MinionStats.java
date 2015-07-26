package griffhaze.co.uk.cardgameproject.model.card.minions;

import griffhaze.co.uk.cardgameproject.model.interfaces.CardStats;

/**
 * Created by richardhayes on 26/07/15.
 */
public enum MinionStats extends CardStats {
    // @formatter:on
    WISP("Wisp", 0, 1, 1, new Runnable() {
        @Override
        public void run() {

        }
    }),
    ELVEN_ARCHER("Elven Archer", 1, 1, 1, new Runnable() {
        @Override
        public void run() {

        }
    }),
//    GOLDSHIRE_FOOTMAN("Goldshire Footman")
;
// @formatter:off

    private final String name;
    private final int manaCost;
    private final Runnable minionEffect;

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    private final int damage;
    private final int health;

    private MinionStats(String name, int manaCost, int damage, int health, Runnable minionEffect) {
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.health = health;
        this.minionEffect = minionEffect;
    }

    }
