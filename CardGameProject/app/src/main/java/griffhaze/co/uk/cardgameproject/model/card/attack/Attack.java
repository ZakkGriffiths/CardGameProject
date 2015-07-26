package griffhaze.co.uk.cardgameproject.model.card.attack;

import griffhaze.co.uk.cardgameproject.model.card.Card;

/**
 * Created by richardhayes on 26/07/15.
 */
public abstract class Attack extends Card {

    /**
     * The type of the attack
     */
    public enum AttackType {
        PHYSICAL
    }

    private final AttackType attackType;

    public Attack(String name, AttackType attackType) {
        super(name);
        this.attackType = attackType;
    }

}
