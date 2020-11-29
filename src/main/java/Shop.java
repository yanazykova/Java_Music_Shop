import behaviour.ISell;

import java.util.ArrayList;

public abstract class Shop implements ISell {
        private String name;
        private ArrayList<ISell> stock;

        public Shop(String name) {
            this.name = name;
            this.stock = new ArrayList<ISell>();
        }

       public ArrayList<ISell> getStock(){
            return stock;
        }

        public void addItemToStock(ISell item){
            stock.add(item);
        }

        public ISell removeItemFromStock(int item){
            return stock.remove(item);
        }
}
