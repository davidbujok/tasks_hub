import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlaneTest {
    Plane plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS_A320);
    }
    @Test
    public void canHaveType(){
        Assert.assertEquals(PlaneType.AIRBUS_A320, plane.getPlaneType());
    }
    @Test
    public void typeHaveMaxCapacity(){
        Assert.assertEquals(186, plane.getPlaneType().getCapacity());
    }
}
