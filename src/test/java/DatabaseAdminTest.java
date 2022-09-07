import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Ethan", "xxxx", 123456789.11);
    }

    @Test
    public void hasAttributes() {
        assertEquals("Ethan", dbAdmin.getName());
        assertEquals("xxxx", dbAdmin.getNationalInsurance());
        assertEquals(123456789.11, dbAdmin.getSalary(), 0.0);
    }
}
