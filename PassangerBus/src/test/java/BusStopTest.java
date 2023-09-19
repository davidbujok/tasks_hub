import org.example.Bus;
import org.example.BusStop;
import org.example.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class BusStopTest {
    Bus bus;
    Person person;
    BusStop busStop;
    private ArrayList<Person> queue;

    @Before
    public void before(){
        person = new Person();
        busStop = new BusStop("Some stop");
    }
    @Test
    public void addPassanger(){
        busStop.addPerson(person);
        Assert.assertEquals(1, busStop.getSize());
    }
    @Test
    public void removePassanger(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        Assert.assertEquals(2, busStop.getSize());
    }


}
