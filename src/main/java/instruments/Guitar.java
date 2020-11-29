package instruments;

public class Guitar extends Instrument {
    private int string;

    public Guitar(String name, int priceBought, int priceSell, int pedal) {
        super(name, priceBought, priceSell);
        this.string = string;
    }

    public int getString(){
        return this.string;
    }



    public String play(String data) {
        return "Playing: " + data;
    }


}
