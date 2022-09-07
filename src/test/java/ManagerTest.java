import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("James", "xxx", 1000.00, "dev");

    }

    @Test
    public void hasAttributes() {
        assertEquals("James", manager.getName());
        assertEquals("xxx", manager.getNationalInsurance());
        assertEquals(1000.00, manager.getSalary(), 0.0);
        assertEquals("dev", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertEquals(1010.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(10.00, manager.payBonus(), 0.0);
    }


}
