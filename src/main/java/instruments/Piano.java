package instruments;

public class Piano extends Instrument {
    private int pedal;

    public Piano(String name, int priceBought, int priceSell, int pedal) {
        super(name, priceBought, priceSell);
        this.pedal = pedal;
    }

    public int getPedal(){
        return this.pedal;
    }


    public String play(String data) {
        return "Playing: " + data;
    }


}
