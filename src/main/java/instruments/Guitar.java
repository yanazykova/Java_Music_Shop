package instruments;

public class Guitar extends Instrument{
    @Override
    public void play_sound(){
        System.out.println("Strum, strum, strum");
    }

    private int strings;

    public Guitar(String type, double priceBought, double priceSell, int strings) {
        super(type, priceBought, priceSell);
        this.strings = strings;
    }

    public String getType(){

        return this.type;
    }

    public int getStringsNumber(){
        return this.strings;
    }

}
