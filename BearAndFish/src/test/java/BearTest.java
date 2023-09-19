import org.example.Bear;
import org.example.River;
import org.example.Salmon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BearTest {

    private Bear bear;
    private Salmon salmon;
    private River river; //ADDED
    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon(10);
        river = new River();    // ADDED
        river.add(salmon);  // ADDED
    }

    @Test
    public void bellyStartsEmpty(){
        Assert.assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFishFromRiver(river); //AMENDED
        Assert.assertEquals(0, river.getFishCount());
    }
}