package griffhaze.co.uk.cardgameproject.model.card.attack;

import griffhaze.co.uk.cardgameproject.model.player.Player;

/**
 * Created by richardhayes on 26/07/15.
 */
public class Punch extends Attack {

    public Punch(String name) {
        super(name, AttackType.PHYSICAL);
    }

    public Punch() {
        super("Punch", AttackType.PHYSICAL);
    }

    @Override
    protected boolean haveEffect(Player player) {
        player.takeDamage(getLastUser().getStrength());
        return true;
    }

    @Override
    protected boolean canUseCard(Player player) {
        return true;
    }


}
