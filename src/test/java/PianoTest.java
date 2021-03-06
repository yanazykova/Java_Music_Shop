import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;

    @Before
    public void setup(){
        piano1 = new Piano("Grand", 100.00, 150.00, 2);
    }

    @Test
    public void hasType() {
        assertEquals("Grand", piano1.getType());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(100.00, piano1.getPriceBought(), 00.00);
    }

    @Test
    public void hasPriceSell(){
        assertEquals(150.00, piano1.getPriceSell(), 00.00);
    }

    @Test
    public void hasPedalsNumber(){
        assertEquals(2, piano1.getPedalsNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing: Plink Plink Plink", piano1.play("Plink Plink Plink"));
    }

    @Test
    public void canCalculateMarkup(){

        assertEquals(50.00, piano1.canCalculateMarkup(100.00, 150.00), 50.00);
    }
}

