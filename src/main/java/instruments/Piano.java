package instruments;

public class Piano extends Instrument {
    @Override
    public void play_sound(){
        System.out.println("Plink, plink, plink");
    }
        private int pedal;

    public Piano(String type, double priceBought, double priceSell, int pedal) {
        super(type, priceBought, priceSell);
        this.pedal = pedal;
    }

    public String getType(){
        return this.type;
    }

    public int getPedalsNumber(){
        return this.pedal;
    }


}
