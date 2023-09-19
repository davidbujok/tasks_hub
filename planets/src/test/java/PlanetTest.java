import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    Planet planet;
    @Before
    public void before() {
        planet = new Planet("Mercury", 265.45);
    }
    @Test
    public void hasName(){
        assertEquals("Mercury", planet.getName() );
    }
    @Test
    public void hasSize(){ assertEquals(265.45, planet.getSize(), 0.0);}
    @Test
    public void exploded(){
        assertEquals("Boom! {this.name} exploded!", planet.explode());

    }
}
