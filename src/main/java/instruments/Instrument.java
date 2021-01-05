package instruments;

import behaviour.ISell;

public abstract class Instrument implements ISell {
    private double priceBought;
    private double priceSell;
    protected String type;

    public Instrument(String type, double priceBought, double priceSell) {
        this.type = type;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public String getType(){
        return this.type;
    }

    public double getPriceBought(){
        return this.priceBought;
    }

    public double getPriceSell(){
        return this.priceSell;
    }

    public void setPriceBought(double priceBought) {
        this.priceBought = priceBought;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public void play_sound(){
        System.out.println("Instrument is playing a sound");   
    }

    public double canCalculateMarkup(double priceBought, double priceSell){
        double markUpPrice = this.priceSell - this.priceBought;
        return  markUpPrice;
    }
}
