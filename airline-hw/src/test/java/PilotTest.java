import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Rudolph", Rank.CAPITAN, "TAR23212");
    }
    @Test
    public void haveRank(){
        Assert.assertEquals(Rank.CAPITAN, pilot.getRank());
    }
    @Test
    public void canRelayMessage(){
        Assert.assertEquals("Good Morning", pilot.relayMessage("Good Morning"));
    }
    @Test
    public void haveLicenceNo(){
        Assert.assertEquals("TAR23212", pilot.getLicenceNo());
    }
    @Test
    public void canFly(){
        Assert.assertEquals("whir whir buzzzz", pilot.startFlight());
    }
}
