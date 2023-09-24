import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Pilot pilot;
        CabinCrewMember memberOne, memberTwo;
        Passenger passenger;
        Plane plane;
        Calendar calendar;
        Flight flight;
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
        System.out.println(flight.formatDate());
    }
}
