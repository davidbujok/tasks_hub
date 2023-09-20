import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

public class DatabaseAdminTest {
    DatabaseAdmin dbadmin;
    @Before
    public void before(){
        dbadmin = new DatabaseAdmin("John", 1233214321L, 2432.23);
    }
    @Test
    public void canGetPayRise(){
        dbadmin.raiseSalary( 20.00);
        Assert.assertEquals(2918.676, dbadmin.getSalary(), 0.0);
    }
    @Test
    public void canGetBonus(){
        Assert.assertEquals(24.32, dbadmin.payBonus(), 0.1);
    }
    @Test
    public void canChangeName(){
        dbadmin.setName("Varnold");
        Assert.assertEquals("Varnold", dbadmin.getName());
    }
}
