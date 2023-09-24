import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private ArrayList<Integer> seatsTaken;
    private Plane plane;
    private String flightNo;
    private Airport departure;
    private Airport destination;
    private Calendar departureTime;


    public Flight(Plane plane, String flightNo, Airport departure, Airport destination, Calendar departureTime) {
        this.pilots = new ArrayList<>();
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.seatsTaken = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    public void addPilot(Pilot _pilot){
        pilots.add(_pilot);
    }
    public ArrayList<Pilot> getPilots(){
        return pilots;
    }
    public void addCrewMember(CabinCrewMember _member){
        crew.add(_member);
    }
    public ArrayList<CabinCrewMember> getCrew(){
        return crew;
    }
    public void bookSeat(int seatNumber){

    }
    public void addPassenger(Passenger _passenger){
        passengers.add(_passenger);
        Integer seat = generateSeat();
        while (seatsTaken.contains(seat)){
            seat = generateSeat();
        }
        _passenger.setFlightNo(flightNo);
        _passenger.setSeat(seat);
        seatsTaken.add(seat);
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }
    public Plane getPlane(){
        return plane;
    }
    public String getFlightNo(){
        return flightNo;
    }
    public Airport getDeparture(){
        return departure;
    }
    public Airport getDestination(){
        return destination;
    }
    public Calendar getDepartureTime(){
        return departureTime;
    }
    public void setDepartureTime(int year, int month, int day, int hour, int minute){
        departureTime.set(year, month, day, hour, minute, 0);
    }
    public int getNumberOfSeatsLeft(){
        int booked = passengers.size();
        return plane.getPlaneType().getCapacity() - booked;
    }
    public Integer generateSeat(){
        double seat = (Math.random() * plane.getPlaneType().getCapacity());
        String seatString = new DecimalFormat("#").format( Math.floor(seat));
        return Integer.parseInt(seatString);
    }
    public String formatDate(){
        String timeFullFormat = departureTime.getTime().toString();
        String[] timePartial = timeFullFormat.split(" ", 7);
        return String.format("Departure: %s %s %s",timePartial[2], timePartial[1], timePartial[5]);
    }
}
