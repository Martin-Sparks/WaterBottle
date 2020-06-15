import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class WaterBottleTest {
    WaterBottle waterB;

    @Before
    public void before(){
        waterB = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterB.getVolume());
    }

    @Test
    public void hasDrink(){
        waterB.drink();
        assertEquals(90, waterB.getVolume());
    }
}