import Management.Director;
import Management.Manager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectorTest {
    Director managerTom;
    @Before
    public void before(){
        managerTom = new Director("Tom", 3124354312L, 2456.00, "Sale", 10000.00);
    }
    @Test
    public void canGetPayRise(){
        managerTom.raiseSalary(10.00);
        Assert.assertEquals(2701.6, managerTom.getSalary(), 0.0);
    }
    @Test
    public void canGetBonus(){
        Assert.assertEquals(49.12, managerTom.payBonus(), 0.1);
    }
    @Test
    public void hasBudget(){
        Assert.assertEquals(10000, managerTom.getBudget(), 0.1);
    }


}
