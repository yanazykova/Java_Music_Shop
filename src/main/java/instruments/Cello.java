package instruments;

public class Cello extends Instrument {
    private int bow;

    public Cello(String name, int priceBought, int priceSell, int pedal) {
        super(name, priceBought, priceSell);
        this.bow = bow;
    }


    public int getBow(){
        return this.bow;
    }

    public String play(String data) {
        return "Playing: " + data;
    }


}
