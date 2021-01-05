import behaviour.ISell;
import instruments.Cello;
import instruments.Guitar;
import instruments.Piano;

public class ShopTest {
    Shop shop1;
    ISell guitar1;
    ISell cello1;
    ISell piano1;
    

    @Before
    public void setup(){
        shop1 = new Shop("CC Music Shop");
        guitar1 = new Guitar("Acoustic", 100, 200, 7);
        cello1 = new Cello("Performer", 200, 300, "white");
        piano1 = new Piano("Grand", 400, 500, 3);
    }

    @Test
    public void hasName() {
        assertEquals("CC Music Shop", shop1.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop1.stockSize());
    }

    @Test
    public void canAddItemToStock() {
        shop1.addItemToStock(guitar1);
        shop1.addItemToStock(cello1);
        shop1.addItemToStock(piano1);
        assertEquals(3, shop1.stockSize());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop1.addItemToStock(guitar1);
        shop1.removeItemFromStock(guitar1);
        assertEquals(0, shop1.stockSize());
    }


    private void assertEquals(int i, int stockSize) {
    }

    private void assertEquals(String string, String name) {
    }





}
