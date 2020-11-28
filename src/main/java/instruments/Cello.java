package instruments;

public class Cello {
    private int bow;

    public Cello(String name, int priceBought, int priceSell, int bow) {
        super(name, priceBought, priceSell);
        this.bow = bow;
    }

    public void instrumentSound() {
        System.out.println("The cello says: a-a-a-a");
    }
}
