package griffhaze.co.uk.cardgameproject.model.interfaces;

/**
 * Created by richardhayes on 26/07/15.
 */
public enum CardStats {

    CARD("Card", 0, new Runnable() {
        @Override
        public void run() {

        }
    });

    private final String name;
    private final int manaCost;
    private final Runnable effect;


    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }


    private CardStats(String name, int manaCost, Runnable effect) {
        this.name = name;
        this.manaCost = manaCost;
        this.effect = effect;
    }

}
