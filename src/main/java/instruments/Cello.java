package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Cello extends Instrument implements IPlay, ISell {
    private String bow;

    public Cello(String type, String sound, double priceBought, double priceSell, String bow) {
        super(type, sound, priceBought, priceSell);
        this.bow = bow;
    }

    public String getType(){
        return this.type;
    }

    public String getSound() {
        return this.sound;
    }

    public String getBow(){
        return this.bow;
    }


    public String play(String sound) {
        return "Playing: " + this.sound;
    }


    public double canCalculateMarkup(double priceBought, double priceSell) {
        double markUpPrice = priceSell - priceBought;
        return  markUpPrice;
    }
}
