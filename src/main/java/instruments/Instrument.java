package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {
    private final double priceBought;
    private final double priceSell;
    protected String type;
    protected String sound;


    public Instrument(String type, String sound, double priceBought, double priceSell) {
        this.type = type;
        this.sound = sound;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public String getType(){
        return this.type;
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


    public double calculateMarkup(double priceBought, double priceSell){
        double markUpPrice = this.priceSell - this.priceBought;
        return  markUpPrice;
    }
}
