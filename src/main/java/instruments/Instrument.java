package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {
    private final double priceBought;
    private final double priceSell;
    protected String name;
    protected String sound;


    public Instrument(String name, String sound, double priceBought, double priceSell) {
        this.name = name;
        this.sound = sound;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.sound;
    }

    public double getPriceBought(){
        return this.priceBought;
    }

    public double getPriceSell(){
        return this.priceSell;
    }

    public String play(String sound) {
            return "playing: " + sound;
    }
}
