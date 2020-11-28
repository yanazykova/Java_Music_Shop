package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String name;
    private int priceBought;
    private int priceSell;

    public Instrument(String name, int priceBought, int priceSell) {
        this.name = name;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }
}
