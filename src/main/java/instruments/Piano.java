package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Piano extends Instrument implements IPlay, ISell{
    private int pedal;

    public Piano(String type, String sound, double priceBought, double priceSell, int pedal) {
        super(type, sound, priceBought, priceSell);
        this.pedal = pedal;
    }

    public String getType(){
        return this.type;
    }

    public int getPedalsNumber(){
        return this.pedal;
    }


    public String play(String sound) {
        return "Playing: " + sound;
    }


    public double canCalculateMarkup(double priceBought, double priceSell) {
        double markUpPrice = priceSell - priceBought;
        return  markUpPrice;
    }
}
