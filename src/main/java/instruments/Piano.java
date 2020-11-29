package instruments;

public class Piano extends Instrument {
    private int pedal;

    public Piano(String name, String sound, double priceBought, double priceSell, int pedal) {
        super(name, sound, priceBought, priceSell);
        this.pedal = pedal;
    }

    public int getPedalsNumber(){
        return this.pedal;
    }


    public String play(String sound) {
        return "Playing: " + sound;
    }


}
