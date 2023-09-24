import java.util.ArrayList;

public class FlightManager {
    private String name;

    public FlightManager(String name) {
        this.name = name;
    }
    private Double totalWeightOfLuggage(ArrayList<Passenger> _passengers){
        Double totalWeight = 0.0;
        for (Passenger passenger : _passengers) {
            for (Bag bag : passenger.getBaggage()) {
               totalWeight += bag.getWeight();
            }
        }
        return totalWeight;
    }
    private Double totalWeightOfPassengers(ArrayList<Passenger> _passengers){
        return _passengers.size() * 80.00;
    }
    private Double weightOfPassengersWhenFull(Plane _plane){
        PlaneType planeType = _plane.getPlaneType();
        return planeType.getCapacity() * 80.00;
    }
    public Double calculateLeftWeightCapacity(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        Double passengersLuggageWeight = totalWeightOfLuggage(passengers);
        Double passengersWeight = weightOfPassengersWhenFull(flight.getPlane());
        Double planeCapacity = flight.getPlane().getPlaneType().getTotal_weight();
        return planeCapacity - passengersWeight - passengersLuggageWeight;
    }
}
