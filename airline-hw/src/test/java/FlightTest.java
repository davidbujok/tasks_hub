import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrewMember memberOne;
    CabinCrewMember memberTwo;
    Passenger passenger;
    Bag bag;
    Plane plane;
    Calendar depDate;
    @Before
    public void before(){
        pilot = new Pilot("Rudolph", Rank.CAPITAN, "TAR23212");
        memberOne = new CabinCrewMember("Ronda", Rank.FLIGHT_ATTENDANT);
        memberTwo = new CabinCrewMember("Dona", Rank.PURSER);
        passenger = new Passenger("Benny");
        passenger.addBaggage(Bag.CABIN_BAG);
        plane = new Plane(PlaneType.AIRBUS_A320);
        Calendar depDate = Calendar.getInstance();
        depDate.set(2023, Calendar.NOVEMBER, 22, 12, 30, 0);
        flight = new Flight(plane, "ER6743", Airport.CPH, Airport.CDG, depDate);
        flight.addPilot(pilot);
        flight.addCrewMember(memberOne);
        flight.addCrewMember(memberTwo);
        flight.addPassenger(passenger);
    }
    @Test
    public void canHavePilot(){
        Assert.assertEquals("Rudolph", flight.getPilots().get(0).getName());
    }
    @Test
    public void pilotsAreCorrect(){
        ArrayList<Pilot> some = new ArrayList<>();
        Pilot secondPilot = new Pilot("Baron", Rank.CAPITAN, "TAR53612");
        some.add(pilot);
        Assert.assertEquals(some, flight.getPilots());
    }
    @Test
    public void canAddCrew(){
        Assert.assertEquals(2, flight.getCrew().size());
    }
    @Test
    public void crewMembersAreCorrect(){
        ArrayList<CabinCrewMember> newCrew = new ArrayList<>();
        CabinCrewMember memberThree = new CabinCrewMember("Henrietta", Rank.FLIGHT_ATTENDANT);
        newCrew.add(memberOne);
        newCrew.add(memberTwo);
        Assert.assertEquals(newCrew, flight.getCrew());
    }
    @Test
    public void canAddPassengers(){
        Assert.assertTrue(flight.getPassengers().contains(passenger));
        Assert.assertEquals(1, flight.getPassengers().size());
    }
    @Test
    public void canAddPlane(){
        Assert.assertEquals(PlaneType.AIRBUS_A320, flight.getPlane().getPlaneType());
    }
    @Test
    public void canHaveFlightNo(){
        Assert.assertEquals("ER6743", flight.getFlightNo());
    }
    @Test
    public void haveDepartureAndDestination(){
        Assert.assertEquals(Airport.CPH, flight.getDeparture());
        Assert.assertEquals(Airport.CDG, flight.getDestination());
    }
    //@Test
    //public void haveDepartureTime(){
    //    Assert.assertEquals("12:45", flight.getDepartureTime());
    //}
    @Test
    public void canCalculatePlacesLeft(){
        Assert.assertEquals(185, flight.getNumberOfSeatsLeft());
    }
    @Test
    public void canSetDepartureTime(){
        Assert.assertEquals("Wed Nov 22 12:30:00 GMT 2023", flight.getDepartureTime().getTime().toString());
    }
    @Test
    public void canSetPassengerFlightNo(){
        Assert.assertEquals("ER6743", passenger.getFlightNo());
    }
    //@Test
    //public void canSetPassengerSeat(){
    //    Integer seat = 127;
    //    Assert.assertEquals(seat, passenger.getSeat());
    //}

}
