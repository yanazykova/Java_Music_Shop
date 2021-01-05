package instruments;

public class Cello extends Instrument{
    @Override
    public void play_sound(){
        System.out.println("Pling pling-a-pling");
    }

    private String bow;

    public Cello(String type, double priceBought, double priceSell, String bow) {
        super(type, priceBought, priceSell);
        this.bow = bow;
    }

    public String getType(){
        return this.type;
    }

    public String getBow(){
        return this.bow;
    }

}
