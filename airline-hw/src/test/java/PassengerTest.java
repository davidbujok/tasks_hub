import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassengerTest {
    Passenger passenger;
    Bag bag;

    @Before
    public void before(){
        passenger = new Passenger("Carol");
        passenger.addBaggage(Bag.CABIN_BAG);
    }
    @Test
    public void canHaveBag(){
        Assert.assertEquals(10, passenger.getBaggage().get(0).getWeight(), 0.0);
    }
    @Test
    public void canAddFlightNo(){
        passenger.setFlightNo("RT5442");
        Assert.assertEquals("RT5442", passenger.getFlightNo());
    }
}
