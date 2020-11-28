package instruments;

import javax.sound.midi.Instrument;

public class Guitar extends Instrument {
    private int string;

    public Piano(String name, int priceBought, int priceSell, int string) {
        super(name, priceBought, priceSell);
        this.string = string;
    }

    public void instrumentSound() {
        System.out.println("The guitar says: tra-la-la!");
    }
}
