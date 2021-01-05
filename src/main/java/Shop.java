import behaviour.ISell;

import java.util.ArrayList;

public class Shop {
        private String name;
        private ArrayList<ISell> stock;

        public Shop(String name) {
            this.name = name;
            this.stock = new ArrayList<ISell>();
        }

       public String getName() {
            return this.name;
       }

       public ArrayList<ISell> getStock(){
            return stock;
        }

        public int stockSize() {
            return this.stock.size();
        }

        public void addItemToStock(ISell item){
            this.stock.add(item);
        }

        public void removeItemFromStock(ISell item){
            this.stock.remove(item);
        }

}
