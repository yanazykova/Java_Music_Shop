import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;

    @Before
    public void setup(){
        shop1 = new Shop("CC Music Shop");
    }

    @Test
    public void hasName() {
        assertEquals("CC Music Shop", shop1.getName());
    }




}
