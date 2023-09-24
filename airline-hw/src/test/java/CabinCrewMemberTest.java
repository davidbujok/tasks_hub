import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabinCrewMemberTest {
    CabinCrewMember crewMember;
    @Before
    public void Before(){
        crewMember = new CabinCrewMember("John", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void haveRank(){
        Assert.assertEquals(Rank.FLIGHT_ATTENDANT, crewMember.getRank());
    }
    @Test
    public void canRelayMessage(){
        Assert.assertEquals("Fasten your seatbelt", crewMember.relayMessage("Fasten your seatbelt"));
    }
}
