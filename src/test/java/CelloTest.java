import instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello1;

    @Before
    public void setup(){
        cello1 = new Cello("Performer", "Pling Pling Pling", 20.00, 40.00, "wooden");
    }

    @Test
    public void hasType() {
        assertEquals("Performer", cello1.getType());
    }

    @Test
    public void hasSound() {
        assertEquals("Pling Pling Pling", cello1.getSound());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(20.00, cello1.getPriceBought(), 00.00);
    }

    @Test
    public void hasPriceSell(){
        assertEquals(40.00, cello1.getPriceSell(), 00.00);
    }

    @Test
    public void hasBowType(){
        assertEquals("wooden", cello1.getBow());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing: Pling Pling Pling", cello1.play("Pling Pling Pling"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(20.00, cello1.calculateMarkup(20.00, 40.00), 20.00);
    }
}
