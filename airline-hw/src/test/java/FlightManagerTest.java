import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

public class FlightManagerTest {
    FlightManager manager;
    Flight flight;
    Pilot pilot;
    CabinCrewMember memberOne;
    CabinCrewMember memberTwo;
    Passenger passengerBenny, passengerTonny;
    Bag bag;
    Plane plane;
    Calendar depDate;
    @Before
    public void before(){
        manager = new FlightManager("Thonkier");
        pilot = new Pilot("Rudolph", Rank.CAPITAN, "TAR23212");
        memberOne = new CabinCrewMember("Ronda", Rank.FLIGHT_ATTENDANT);
        memberTwo = new CabinCrewMember("Dorma", Rank.PURSER);
        passengerBenny = new Passenger("Benny");
        passengerBenny.addBaggage(Bag.CABIN_BAG);
        passengerTonny = new Passenger("Tonny");
        passengerTonny.addBaggage(Bag.CHECKED_BAGGAGE_LARGE);
        passengerTonny.addBaggage(Bag.CHECKED_BAGGAGE_LARGE);
        depDate = Calendar.getInstance();
        depDate.set(2023, Calendar.NOVEMBER, 22, 12, 30);
        plane = new Plane(PlaneType.AIRBUS_A320);
        flight = new Flight(plane, "ER6743", Airport.CPH, Airport.CDG, depDate);
        flight.addPilot(pilot);
        flight.addCrewMember(memberOne);
        flight.addCrewMember(memberTwo);
        flight.addPassenger(passengerBenny);
        flight.addPassenger(passengerTonny);
    }
    @Test
    public void canCalculateWeightCapacityLeft(){
        Assert.assertEquals(15926.00, manager.calculateLeftWeightCapacity(flight), 0.0);
    }
}
