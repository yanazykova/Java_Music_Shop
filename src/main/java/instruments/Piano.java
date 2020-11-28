package instruments;

import behaviour.IPlay;

import javax.sound.midi.Instrument;

public class Piano extends Instrument {
    private int pedal;

    public Piano(String name, int priceBought, int priceSell, int pedal) {
        super(name, priceBought, priceSell);
        this.pedal = pedal;
    }


    public void instrumentSound() {
        System.out.println("The piano says: tram-pam-pam!");
    }


}
