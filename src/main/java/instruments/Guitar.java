package instruments;

public class Guitar extends Instrument {
    private int strings;

    public Guitar(String type, String sound, double priceBought, double priceSell, int strings) {
        super(type, sound, priceBought, priceSell);
        this.strings = strings;
    }

    public String getType(){

        return this.type;
    }

    public String getSound() {
        return this.sound;
    }

    public int getStringsNumber(){
        return this.strings;
    }


    public String play(String sound) {
        return "Playing: " + this.sound;
    }


}
