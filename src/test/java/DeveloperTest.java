import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Ethan", "xxxx", 123456789.11);
    }

    @Test
    public void hasAttributes() {
        assertEquals("Ethan", developer.getName());
        assertEquals("xxxx", developer.getNationalInsurance());
        assertEquals(123456789.11, developer.getSalary(), 0.0);
    }

    @Test
    public void RaiseSalaryCannotTakeNegativeValue(){
        developer.raiseSalary(-1.00);
        assertEquals(123456789.11, developer.getSalary(), 0.0);
    }

    @Test
    public void canUpdateName(){
        developer.setName("James");
        assertEquals("James", developer.getName());
    }

    @Test
    public void setNameCannotAcceptNull(){
        developer.setName("");
        assertEquals("Ethan", developer.getName());
    }

    @Test
    public void setNameCannotAcceptStringWithoutCharacters(){
        developer.setName(" ");
        assertEquals("Ethan", developer.getName());
    }
}


