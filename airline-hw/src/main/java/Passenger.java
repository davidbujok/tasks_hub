import java.lang.reflect.Array;
import java.util.ArrayList;

public class Passenger {
    private String name;
    private ArrayList<Bag> baggage;
    private String flightNo;
    private Integer seat;

    public Passenger(String name) {
        this.name = name;
        this.baggage = new ArrayList<>();
        this.flightNo = null;
        this.seat = null;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Bag> getBaggage() {
        return baggage;
    }
    public void addBaggage(Bag _bag){
        baggage.add(_bag);
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }
    public void setSeat(Integer seatNumber){
        seat = seatNumber;
    }
    public Integer getSeat(){
        return seat;
    }
}
