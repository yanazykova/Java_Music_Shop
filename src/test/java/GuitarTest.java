import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void setup(){
        guitar1 = new Guitar("Electric", "Ding Ting Ring", 20.50, 30.50, 6);
    }

    @Test
    public void hasType() {
        assertEquals("Electric", guitar1.getType());
    }

    @Test
    public void hasSound() {
        assertEquals("Ding Ting Ring", guitar1.getSound());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(20.50, guitar1.getPriceBought(), 00.00);
    }

    @Test
    public void hasPriceSell(){
        assertEquals(30.50, guitar1.getPriceSell(), 30.50);
    }

    @Test
    public void hasStringsNumber(){
        assertEquals(6, guitar1.getStringsNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing: Ding Ting Ring", guitar1.play("Ding Ting Ring"));
    }



}
