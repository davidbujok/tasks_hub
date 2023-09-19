import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 94.57, 223.47);
    }
    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(94.57, bear.getWeight(), 0.0);
    }
    @Test
    public void hasHeight(){
        assertEquals(223.47, bear.getHeight(), 0.1 );
    }
    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate() );
    }
    @Test
    public void readyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Baloo", 25, 65.44, 223.47);
        assertEquals(false, thinBear.readyToHibernate() );
    }

}
