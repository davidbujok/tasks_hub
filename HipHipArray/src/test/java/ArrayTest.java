import org.example.Peacock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayTest {
    Peacock peacock;
    @Before
    public void before() {
        peacock = new Peacock();

    }
    @Test
    public void hasFourColours() {
        Assert.assertEquals(4, peacock.getColours().length);
    }
    @Test
    public void hasColourBlueAtIndex3(){
        Assert.assertEquals("Blue", peacock.getColourFromIndex(3));
    }
    @Test
    public void canChangeColour() {
        peacock.changeColour("Red", 0);
        Assert.assertEquals("Red", peacock.getColourFromIndex(0));
    }

}
