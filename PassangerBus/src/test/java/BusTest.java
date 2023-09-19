import org.example.Bus;
import org.example.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BusTest {
    Bus bus;
    Person person;
    @Before
    public void before(){
        ArrayList<Person> passengers = new ArrayList<>();
        person = new Person();
        bus = new Bus(passengers, "Dunfermline", 1);
        bus.onboardPassenger(person);
    }
    @Test
    public void checkPessengers(){
        Assert.assertEquals(1, bus.getNumberOfPeopleInTheBus());
    }
    @Test
    public void checkIfBusIsFull(){
        Assert.assertEquals(true, bus.isFull());
    }
    @Test
    public void rejectPassenger(){
        Person person2 = new Person();
        Assert.assertEquals("Sorry it's full", bus.onboardPassenger(person2));
    }
    @Test
    public void removePassengerFromTheBus(){
        bus.removePassenger();
        Assert.assertEquals(0, bus.getNumberOfPeopleInTheBus());
    }

}
